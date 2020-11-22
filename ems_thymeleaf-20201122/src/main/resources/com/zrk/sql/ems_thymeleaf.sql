/*
Navicat MySQL Data Transfer

Source Server         : old
Source Server Version : 50562
Source Host           : localhost:3306
Source Database       : ems_thymeleaf

Target Server Type    : MYSQL
Target Server Version : 50562
File Encoding         : 65001

Date: 2020-11-22 15:43:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_emp`
-- ----------------------------
DROP TABLE IF EXISTS `t_emp`;
CREATE TABLE `t_emp` (
  `id` int(40) NOT NULL AUTO_INCREMENT,
  `name` varchar(60) DEFAULT NULL,
  `salary` double(7,2) DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  `bir` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of t_emp
-- ----------------------------

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(40) NOT NULL AUTO_INCREMENT,
  `username` varchar(40) DEFAULT NULL,
  `realname` varchar(40) DEFAULT NULL,
  `password` varchar(40) DEFAULT NULL,
  `sex` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of t_user
-- ----------------------------
