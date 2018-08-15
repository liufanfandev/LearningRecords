/*
Navicat MySQL Data Transfer

Source Server         : lipk
Source Server Version : 50096
Source Host           : localhost:3306
Source Database       : hello

Target Server Type    : MYSQL
Target Server Version : 50096
File Encoding         : 65001

Date: 2018-08-15 17:23:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for menu
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu` (
  `id` bigint(10) NOT NULL auto_increment,
  `parent_id` bigint(10) NOT NULL,
  `name` varchar(255) default NULL,
  `url` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of menu
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(11) NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  `sex` varchar(2) default NULL,
  `age` int(2) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '小明', '男', '23');
INSERT INTO `user` VALUES ('2', '小红', '女', '22');
INSERT INTO `user` VALUES ('3', '小蓝', '男', '21');
INSERT INTO `user` VALUES ('4', '小绿', '男', '22');
INSERT INTO `user` VALUES ('5', '小白', '男', '23');
INSERT INTO `user` VALUES ('6', '小黑', '男', '24');
INSERT INTO `user` VALUES ('7', '小黄', '男', '22');
INSERT INTO `user` VALUES ('8', '小紫', '女', '23');
INSERT INTO `user` VALUES ('9', '小青', '女', '21');
INSERT INTO `user` VALUES ('10', '小橙', '男', '22');
INSERT INTO `user` VALUES ('11', '张飞', '男', '33');
INSERT INTO `user` VALUES ('12', '关羽', '男', '34');
INSERT INTO `user` VALUES ('13', '刘备', '男', '35');
INSERT INTO `user` VALUES ('14', '孙权', '男', '27');
INSERT INTO `user` VALUES ('15', '诸葛亮', '男', '36');
INSERT INTO `user` VALUES ('16', '赵云', '男', '28');
INSERT INTO `user` VALUES ('17', '黄忠', '男', '54');
INSERT INTO `user` VALUES ('18', '马超', '男', '33');
INSERT INTO `user` VALUES ('19', '周瑜', '男', '28');
INSERT INTO `user` VALUES ('20', '大乔', '女', '30');
INSERT INTO `user` VALUES ('21', '小乔', '女', '27');
