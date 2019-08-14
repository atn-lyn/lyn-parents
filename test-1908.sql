/*
SQLyog Professional v12.09 (64 bit)
MySQL - 5.6.26-log : Database - test
*********************************************************************
*/

USE `test`;

/*Table structure for table `customer_info` */

DROP TABLE IF EXISTS `customer_info`;

CREATE TABLE `customer_info` (
  `customer_id` int(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `category` int(2) NOT NULL COMMENT '分类',
  `grade` int(2) DEFAULT '0' COMMENT '级别',
  `customer_no` varchar(50) NOT NULL COMMENT '客户编号',
  `customer_name` varchar(50) NOT NULL COMMENT '客户名称',
  `customer_type` int(50) NOT NULL COMMENT '客户类型',
  `nick_name` varchar(20) DEFAULT NULL COMMENT '简称	',
  `phone` varchar(20) DEFAULT NULL COMMENT '电话',
  `province` varchar(10) DEFAULT NULL COMMENT '省份',
  `city` varchar(10) DEFAULT NULL COMMENT '所在城市',
  `district` varchar(10) DEFAULT NULL COMMENT '地区',
  `address` varchar(100) DEFAULT NULL COMMENT '详细地址',
  `contact` varchar(20) DEFAULT NULL COMMENT '联系人',
  `mobile` varchar(11) DEFAULT NULL COMMENT '联系人电话',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `fax` varchar(20) DEFAULT NULL COMMENT '传真号码',
  `regist_date` datetime DEFAULT NULL COMMENT '注册时间',
  `description` varchar(255) DEFAULT NULL COMMENT '公司介绍',
  `source` int(1) DEFAULT NULL COMMENT '来源',
  `card_id` varchar(255) DEFAULT NULL COMMENT '证件照片',
  `license` varchar(100) DEFAULT NULL COMMENT '营业执照',
  `permit` varchar(100) DEFAULT NULL COMMENT '营业许可证',
  `store_photo` varchar(255) DEFAULT NULL COMMENT '店铺照片',
  `follower` varchar(20) DEFAULT NULL COMMENT '跟进入',
  `status` int(1) DEFAULT '0' COMMENT '用户状态 0-禁用，1-启用',
  `confirm_status` int(1) DEFAULT NULL COMMENT '审核状态',
  `confirm_date` datetime DEFAULT NULL COMMENT '审核时间',
  `create_by` varchar(20) DEFAULT NULL COMMENT '创建人',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(20) DEFAULT NULL COMMENT '更新人',
  `update_date` datetime DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `customer_info` */

/*Table structure for table `goods_attribute` */

DROP TABLE IF EXISTS `goods_attribute`;

CREATE TABLE `goods_attribute` (
  `attribute_id` int(20) NOT NULL AUTO_INCREMENT COMMENT '属性ID',
  `attribute_value` varchar(50) DEFAULT NULL COMMENT '属性值',
  `creator` varchar(10) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `updater` varchar(10) DEFAULT NULL COMMENT '修改人',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注信息',
  PRIMARY KEY (`attribute_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `goods_attribute` */

/*Table structure for table `goods_attribute_key` */

DROP TABLE IF EXISTS `goods_attribute_key`;

CREATE TABLE `goods_attribute_key` (
  `attribute_id` int(20) NOT NULL AUTO_INCREMENT,
  `category_id` int(20) DEFAULT NULL,
  `attribute_name` varchar(50) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`attribute_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `goods_attribute_key` */

insert  into `goods_attribute_key`(`attribute_id`,`category_id`,`attribute_name`,`create_time`,`update_time`) values (1,2,'颜色','2019-07-13 00:34:27',NULL),(2,2,'版本','2019-07-13 00:34:43',NULL),(3,2,'套餐',NULL,NULL);

/*Table structure for table `goods_attribute_value` */

DROP TABLE IF EXISTS `goods_attribute_value`;

CREATE TABLE `goods_attribute_value` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `attribute_id` int(20) DEFAULT NULL,
  `attribute_value` varchar(50) DEFAULT NULL,
  `sort` int(11) DEFAULT '0',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `goods_attribute_value` */

insert  into `goods_attribute_value`(`id`,`attribute_id`,`attribute_value`,`sort`,`create_time`,`update_time`) values (1,1,'蓝水翡翠',1,'2019-07-13 00:37:54',NULL),(2,1,'幻夜星河',2,'2019-07-13 00:37:56',NULL),(3,1,'MOSCHINO联名版',3,'2019-07-13 00:38:02',NULL),(4,2,'全网通8G 128G',1,'2019-07-13 00:40:36',NULL),(5,2,'全网通8G 256G',2,NULL,NULL),(6,2,'MOSCHINO联名版8G 256G',3,'2019-07-13 00:40:39',NULL),(7,3,'官方套餐',1,'2019-07-13 00:40:41',NULL),(8,3,'套餐一',2,'2019-07-13 00:40:43',NULL),(9,3,'套餐二',3,'2019-07-13 00:40:45',NULL),(10,3,'套餐三',4,'2019-07-13 00:40:48',NULL);

/*Table structure for table `goods_brand` */

DROP TABLE IF EXISTS `goods_brand`;

CREATE TABLE `goods_brand` (
  `brand_id` int(20) NOT NULL AUTO_INCREMENT COMMENT '品牌ID',
  `brand_name` varchar(50) DEFAULT NULL COMMENT '品牌名',
  `brand_log` varchar(50) DEFAULT NULL COMMENT '品牌log',
  `brand_desc` varchar(50) DEFAULT NULL COMMENT '品牌描述',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`brand_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `goods_brand` */

insert  into `goods_brand`(`brand_id`,`brand_name`,`brand_log`,`brand_desc`,`create_time`,`update_time`) values (1,'荣耀手机',NULL,'荣耀，华为旗下手机品牌','2019-07-13 00:29:44',NULL);

/*Table structure for table `goods_category` */

DROP TABLE IF EXISTS `goods_category`;

CREATE TABLE `goods_category` (
  `category_id` int(20) NOT NULL AUTO_INCREMENT COMMENT '分类ID',
  `parent_id` int(20) DEFAULT '0' COMMENT '父级ID',
  `category_name` varchar(50) DEFAULT NULL COMMENT '分类名',
  `category_img` varchar(200) DEFAULT NULL COMMENT '图片',
  `status` tinyint(1) DEFAULT '1',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `goods_category` */

insert  into `goods_category`(`category_id`,`parent_id`,`category_name`,`category_img`,`status`,`create_time`,`update_time`) values (1,0,'电子数码',NULL,1,'2019-07-13 00:28:52',NULL),(2,1,'手机',NULL,1,'2019-07-13 00:29:13',NULL);

/*Table structure for table `goods_info` */

DROP TABLE IF EXISTS `goods_info`;

CREATE TABLE `goods_info` (
  `goods_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '商品ID',
  `goods_no` varchar(50) DEFAULT NULL COMMENT '商品编号',
  `goods_name` varchar(50) DEFAULT NULL COMMENT '商品名',
  `goods_title` varchar(100) DEFAULT NULL COMMENT 'title',
  `goods_img` varchar(200) DEFAULT NULL COMMENT '主图',
  `category_id` int(20) NOT NULL COMMENT '分类ID',
  `brand_id` int(20) NOT NULL COMMENT '品牌ID',
  `goods_detail` varchar(200) DEFAULT NULL COMMENT '商品详情',
  `is_hot_sell` tinyint(1) DEFAULT '0' COMMENT '是否为热销商品',
  `status` int(11) DEFAULT '0' COMMENT '状态',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `remark` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`goods_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `goods_info` */

insert  into `goods_info`(`goods_id`,`goods_no`,`goods_name`,`goods_title`,`goods_img`,`category_id`,`brand_id`,`goods_detail`,`is_hot_sell`,`status`,`create_time`,`update_time`,`remark`) values (1,'S19061239293849547545','荣耀20pro','荣耀20 PRO DX全球第二高分..........',NULL,2,1,'',0,1,'2019-07-13 00:33:47',NULL,NULL),(2,'S19080516651510228587','小米8','小米8手机',NULL,2,2,NULL,0,1,'2019-08-08 16:36:32',NULL,NULL),(3,'S19080516657489632474','魅族手机','魅族手机',NULL,2,3,NULL,0,1,'2019-08-08 16:37:15',NULL,NULL);

/*Table structure for table `goods_specs` */

DROP TABLE IF EXISTS `goods_specs`;

CREATE TABLE `goods_specs` (
  `specs_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '规则主键（sku）',
  `goods_id` int(20) DEFAULT NULL COMMENT '商品主键spu',
  `goods_attribute` varchar(200) DEFAULT NULL COMMENT '商品规格',
  `stock` int(10) unsigned DEFAULT '0' COMMENT '库存',
  `price` decimal(10,2) DEFAULT NULL COMMENT '售价',
  `status` tinyint(1) DEFAULT '0' COMMENT '状态',
  `sell_amount` int(11) DEFAULT '0' COMMENT '销量',
  `creator` varchar(10) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `updater` varchar(10) DEFAULT NULL COMMENT '修改人',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`specs_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `goods_specs` */

insert  into `goods_specs`(`specs_id`,`goods_id`,`goods_attribute`,`stock`,`price`,`status`,`sell_amount`,`creator`,`create_time`,`updater`,`update_time`) values (1,1,'{\"颜色\":\"蓝水翡翠\",\"版本\":\"全网通8G 128G\",\"套餐\":\"官方套餐\"}',99,'3199.00',1,0,'1','2019-07-13 00:45:57',NULL,NULL),(2,1,'{\"颜色\":\"蓝水翡翠\",\"版本\":\"全网通8G 256G\",\"套餐\":\"官方套餐\"}',21,'3499.00',1,0,'1','2019-07-13 00:46:03',NULL,NULL),(3,1,'{\"颜色\":\"蓝水翡翠\",\"版本\":\"MOSCHINO联名版\",\"套餐\":\"官方套餐\"}',0,'3699.00',1,0,'1','2019-07-13 00:46:06',NULL,NULL),(4,1,'{\"颜色\":\"幻夜星河\",\"版本\":\"全网通8G 128G\",\"套餐\":\"官方套餐\"}',1,'3199.00',1,0,'1','2019-07-13 00:46:09',NULL,NULL),(5,1,'{\"颜色\":\"幻夜星河\",\"版本\":\"全网通8G 256G\",\"套餐\":\"官方套餐\"}',3,'3499.00',1,0,'1','2019-07-13 00:51:57',NULL,NULL),(6,1,'{\"颜色\":\"幻夜星河\",\"版本\":\"MOSCHINO联名版\",\"套餐\":\"官方套餐\"}',0,'3699.00',1,0,'1','2019-07-13 00:52:00',NULL,NULL);

/*Table structure for table `order_info` */

DROP TABLE IF EXISTS `order_info`;

CREATE TABLE `order_info` (
  `order_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '订单id',
  `order_no` varchar(50) NOT NULL COMMENT '订单编号',
  `store_id` int(10) DEFAULT NULL COMMENT '商铺id',
  `customer_id` bigint(11) DEFAULT NULL COMMENT '采购人id',
  `goods_id` int(10) DEFAULT NULL COMMENT '商品id',
  `specs_id` int(11) DEFAULT NULL COMMENT '规格ID',
  `specs_desc` varchar(200) DEFAULT NULL COMMENT '规格描述',
  `sell_price` decimal(10,2) DEFAULT '0.00' COMMENT '单价',
  `sell_num` int(10) DEFAULT '0' COMMENT '销售数量',
  `sell_amount` decimal(10,2) DEFAULT '0.00' COMMENT '销售总金额',
  `coup_amount` decimal(10,2) DEFAULT '0.00' COMMENT '总优惠金额',
  `status` int(1) DEFAULT '0' COMMENT '订单状态：1待付款-2待发货-3待收货-4已完成-5已关闭',
  `logistics_id` bigint(20) DEFAULT NULL COMMENT '物流id',
  `shipping_no` varchar(50) DEFAULT NULL COMMENT '物流单号',
  `post_fee` double(20,2) DEFAULT '0.00' COMMENT '邮费',
  `receiver_province` int(6) DEFAULT NULL COMMENT '省份',
  `receiver_city` int(6) DEFAULT NULL COMMENT '城市',
  `receiver_district` int(6) DEFAULT NULL COMMENT '区/县',
  `receiver_name` varchar(20) DEFAULT NULL COMMENT '收货人名称',
  `receiver_mobile` varchar(20) DEFAULT NULL COMMENT '收货人电话',
  `receiver_address` varchar(65) DEFAULT NULL COMMENT '收货地址',
  `buyer_remark` varchar(200) DEFAULT NULL COMMENT '买家备注',
  `send_time` datetime DEFAULT NULL COMMENT '发货时间',
  `sender_name` varchar(10) DEFAULT NULL COMMENT '发货人',
  `follower` varchar(10) DEFAULT NULL COMMENT '跟进人',
  `pay_method` int(1) DEFAULT '0' COMMENT '支付方式 1-微信，2-支付宝',
  `trade_no` varchar(50) DEFAULT NULL COMMENT '第三方交易流水号',
  `is_delete` int(1) DEFAULT '1' COMMENT '是否删除：1-否，2-是',
  `is_post` int(1) DEFAULT '0' COMMENT '是否包邮：1-否，2-是',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `end_time` datetime DEFAULT NULL COMMENT '交易完成时间',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='订单表';

/*Data for the table `order_info` */

insert  into `order_info`(`order_id`,`order_no`,`store_id`,`customer_id`,`goods_id`,`specs_id`,`specs_desc`,`sell_price`,`sell_num`,`sell_amount`,`coup_amount`,`status`,`logistics_id`,`shipping_no`,`post_fee`,`receiver_province`,`receiver_city`,`receiver_district`,`receiver_name`,`receiver_mobile`,`receiver_address`,`buyer_remark`,`send_time`,`sender_name`,`follower`,`pay_method`,`trade_no`,`is_delete`,`is_post`,`create_time`,`update_time`,`end_time`) values (1,'D042019052917355136400017253',1147,393,1,NULL,NULL,'0.00',0,'0.00','0.00',6,NULL,NULL,0.00,110100,110100,659007,'aaa','15626666666','sss',NULL,NULL,NULL,'32',0,NULL,2,2,'2019-05-29 17:35:51','2019-05-29 18:12:11','2019-05-29 18:11:55');

/*Table structure for table `user_info` */

DROP TABLE IF EXISTS `user_info`;

CREATE TABLE `user_info` (
  `user_id` int(10) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(20) COLLATE utf8_estonian_ci DEFAULT NULL,
  `dept` char(20) COLLATE utf8_estonian_ci DEFAULT NULL,
  `position` varchar(20) COLLATE utf8_estonian_ci DEFAULT NULL,
  `direct_leader` int(10) DEFAULT NULL,
  `mobile` char(12) COLLATE utf8_estonian_ci DEFAULT NULL,
  `password` char(32) COLLATE utf8_estonian_ci DEFAULT NULL,
  `icon` varchar(100) COLLATE utf8_estonian_ci DEFAULT NULL,
  `status` tinyint(1) DEFAULT '0',
  `token` char(32) COLLATE utf8_estonian_ci DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `creator` int(10) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `updater` int(10) DEFAULT NULL,
  `remark` varchar(200) COLLATE utf8_estonian_ci DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_estonian_ci;

/*Data for the table `user_info` */

insert  into `user_info`(`user_id`,`user_name`,`dept`,`position`,`direct_leader`,`mobile`,`password`,`icon`,`status`,`token`,`create_time`,`creator`,`update_time`,`updater`,`remark`) values (1,'Lucy',NULL,'leader',0,'13892154562','sadswqwq2d12fe45sadswqwq2d12fe45',NULL,1,NULL,'2019-06-13 15:02:19',0,NULL,NULL,NULL),(2,'Lily',NULL,'oo',1,'13312345678','sadswqwq2d12fe45sadswqwq2d12fe45',NULL,1,NULL,'2019-06-15 13:12:27',NULL,NULL,NULL,NULL),(3,'aaaaaasssssssssss',NULL,NULL,NULL,'13612345670','sadswqwq2d12fe45sadswqwq2d12fe45',NULL,1,NULL,'2019-06-15 17:35:39',2,NULL,NULL,NULL),(5,'Wang nana',NULL,NULL,NULL,'13812345670','dskjdffgdkjfgdgbkgflbdlfvdf',NULL,1,NULL,'2019-06-15 19:55:38',2,NULL,NULL,NULL);

