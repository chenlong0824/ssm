/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50641
Source Host           : localhost:3306
Source Database       : ssm

Target Server Type    : MYSQL
Target Server Version : 50641
File Encoding         : 65001

Date: 2018-10-26 14:33:05
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `ssm_user`
-- ----------------------------
DROP TABLE IF EXISTS `ssm_user`;
CREATE TABLE `ssm_user` (
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `pname` varchar(20) NOT NULL DEFAULT '',
  `password` varchar(20) NOT NULL DEFAULT '',
  PRIMARY KEY (`pid`),
  UNIQUE KEY `pname_unique` (`pname`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;


