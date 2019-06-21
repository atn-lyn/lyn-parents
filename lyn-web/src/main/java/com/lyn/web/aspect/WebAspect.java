package com.lyn.web.aspect;

import com.lyn.common.exception.DescribeException;
import com.lyn.common.exception.ExceptionEnum;
import com.lyn.common.utils.DeviceUtils;
import com.lyn.common.utils.IllegalStrFilterUtils;
import com.lyn.web.exception.ExceptionHandler;
import org.apache.catalina.connector.RequestFacade;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import javax.servlet.http.HttpServletRequest;

@Component
@Aspect
public class WebAspect {

    private final static Logger LOGGER = LoggerFactory.getLogger(WebAspect.class);

    @Autowired
    private ExceptionHandler exceptionHandler;

    private final String pointcut = "execution(* com.lyn.web.controller.*.*(..))";

    @Pointcut(pointcut)
    public void executeService() {

    }

    /**
     * Aop前置通知
     *
     * @param joinPoint
     */
    @Before("executeService()")
    public void doBeforeAdvice(JoinPoint joinPoint) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        LOGGER.info("【AOP前置通知】url:" + request.getRequestURI()+", " +
                "ip:" + DeviceUtils.getIpAddr(request)+ ", " +
                "method:" + request.getMethod()+ ", " +
                "class_method:" + joinPoint.getSignature().getDeclaringTypeName() + "."
                + joinPoint.getSignature().getName());
    }

    /**
     * 环绕通知
     *
     * @param pjp
     * @return
     */
    @Around("executeService()")
    public Object doAroundAdvice(ProceedingJoinPoint pjp) throws Throwable{
        StopWatch clock = new StopWatch();
        //返回的结果
        Object result = null;
        //方法名称
        String className = pjp.getTarget().getClass().getName();
        String methodName = pjp.getSignature().getName();
        try {
            clock.start();
            //处理入参特殊字符和sql注入攻击
            checkRequestParam(pjp);
            //执行访问接口操作
            result = pjp.proceed();
            clock.stop();
            //后置通知
            if (!methodName.equalsIgnoreCase("initBinder")) {
                long constTime = clock.getTotalTimeMillis();
                RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
                HttpServletRequest request = (HttpServletRequest) requestAttributes.resolveReference(RequestAttributes.REFERENCE_REQUEST);
                LOGGER.info("【AOP环绕通知】 接口[" + request.getRequestURI() + "]" + "-" + "[" + request.getMethod() + "]" + " 请求耗时:" + constTime + "ms");
            }
        }catch (Exception e) {
            LOGGER.error(e.getMessage(),e);
            result = exceptionHandler.exceptionGet(e);
        }
        return result;
    }

    @AfterReturning(value = "executeService()", returning = "result")
    public void doAfterReturning(Object result) {
        LOGGER.info("【AOP后置通知】 返回值：" + result);
    }

    /**
     * 检查防SQL注入和非法字符
     * @param pjp
     */
    private void checkRequestParam(ProceedingJoinPoint pjp){
        Object[] args = pjp.getArgs();
        RequestFacade  facade= (RequestFacade) args[0];
        String str = (String) facade.getAttribute("RequestStr");
        if (!IllegalStrFilterUtils.sqlStrFilter(str)) {
            LOGGER.info("访问接口：" + pjp.getSignature() + "，输入参数存在SQL注入风险!");
            throw new DescribeException(ExceptionEnum.REQUEST_ERROR);
        }
        if (IllegalStrFilterUtils.isIllegalStr(str)) {
            LOGGER.info("访问接口：" + pjp.getSignature() + ",输入参数含有非法字符!");
            throw new DescribeException(ExceptionEnum.REQUEST_ERROR);
        }
    }
}