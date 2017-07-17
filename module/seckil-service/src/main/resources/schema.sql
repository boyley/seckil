Create Database If Not Exists seckil Character Set UTF8;
USE seckil;

DROP TABLE IF EXISTS `seckil`;

CREATE TABLE `seckil` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `title` varchar(20) DEFAULT NULL COMMENT '商品标题',
  `name` varchar(20) DEFAULT NULL COMMENT '商品名称',
  `summary` varchar(50) DEFAULT NULL COMMENT '商品摘要',
  `start_time` datetime DEFAULT NULL COMMENT '秒杀开始时间',
  `end_time` datetime DEFAULT NULL COMMENT '秒杀结束时间',
  `stock` int(11) DEFAULT NULL COMMENT '库存',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='秒杀活动';