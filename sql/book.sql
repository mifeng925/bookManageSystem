/*
 Navicat Premium Data Transfer

 Source Server         : MySql
 Source Server Type    : MySQL
 Source Server Version : 80018
 Source Host           : localhost:3306
 Source Schema         : book

 Target Server Type    : MySQL
 Target Server Version : 80018
 File Encoding         : 65001

 Date: 16/01/2021 18:50:57
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book`  (
  `book_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `book_name ` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '书籍名称',
  `book_author ` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '书籍作者\n ',
  `book_sort ` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '书籍分类',
  `book_record ` datetime(0) NULL DEFAULT NULL COMMENT '书籍登记日期',
  PRIMARY KEY (`book_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES (1, '林狗', 'Bee', 'sadsa', '2021-01-11 22:51:52');
INSERT INTO `book` VALUES (2, 'JAVA从入门到精通', '国家863中部软件孵化器', '教育', '2020-11-12 11:11:22');
INSERT INTO `book` VALUES (3, 'Android第一行代码', '郭霖', 'Android', '2021-01-11 23:16:14');
INSERT INTO `book` VALUES (13, 'JavaScript高级程序设计（第4版）', '李松峰', 'JAVA', '2021-01-16 16:55:17');
INSERT INTO `book` VALUES (16, 'JavaScript高级程序设计（第4版）', '李松峰', 'JAVA', '2021-01-16 17:02:25');
INSERT INTO `book` VALUES (17, 'JavaScript高级程序设计（第4版）', '李松峰', NULL, '2021-01-16 17:03:43');
INSERT INTO `book` VALUES (18, 'JavaScript高级程序设计（第4版）', '李松峰', 'JAVA', '2021-01-16 17:04:26');
INSERT INTO `book` VALUES (19, 'JavaScript高级程序设计（第4版）', '李松峰', 'JAVA', '2021-01-16 17:05:17');

-- ----------------------------
-- Table structure for book_sort
-- ----------------------------
DROP TABLE IF EXISTS `book_sort`;
CREATE TABLE `book_sort`  (
  `sort_id ` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '类型编号',
  `sort_name ` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '类型名称',
  PRIMARY KEY (`sort_id `) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
