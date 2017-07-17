Create Database If Not Exists seckil Character Set UTF8;
USE seckill;

DROP TABLE IF EXISTS `user`;
DROP TABLE IF EXISTS `authority`;
DROP TABLE IF EXISTS `user_authority`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(50) DEFAULT NULL COMMENT '用户名',
  `password_hash` varchar(100) DEFAULT NULL COMMENT '密码',
  `account_non_expired` bit(1) DEFAULT NULL COMMENT '账号是否未过期',
  `account_non_locked` bit(1) DEFAULT NULL COMMENT '账号是否未锁定',
  `credentials_non_expired` bit(1) DEFAULT NULL COMMENT '密码是否为过期',
  `enabled` bit(1) DEFAULT NULL COMMENT '账号是否可用',
  `activated` bit(1) DEFAULT NULL COMMENT '账号是否激活',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='用户表';

CREATE TABLE `authority` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `authority` varchar(20) DEFAULT NULL COMMENT '权限名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='用户权限表';


CREATE TABLE `user_authority` (
  `user_id` int(11) DEFAULT NULL COMMENT '用户ID',
  `authority_id` int(11) DEFAULT NULL COMMENT '角色ID'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户权限管理表';