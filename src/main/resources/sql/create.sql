-- 用户表
CREATE TABLE `user` (
  `id` int(11) NOT NULL COMMENT 'user唯一ID',
  `name` varchar(30) NOT NULL COMMENT 'user用户名',
  `pwd` varchar(64) NOT NULL COMMENT 'user密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 学习日记表
CREATE TABLE `learn_diary` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '学习日记的自增ID',
  `title` varchar(200) NOT NULL COMMENT '学习日记的标题',
  `content` text NOT NULL COMMENT '学习日记的内容',
  `create_time` bigint(20) NOT NULL COMMENT '学习日记的创建时间',
  `create_user` int(11) NOT NULL COMMENT '学习日记的创建者',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 教师表
CREATE TABLE `teacher` (
  `t_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '教师ID',
  `t_name` varchar(20) NOT NULL COMMENT '教师名称',
  `t_sex` tinyint(1) NOT NULL COMMENT '教师性别',
  `t_age` tinyint(3) unsigned DEFAULT NULL COMMENT '教师年龄',
  PRIMARY KEY (`t_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 班级表
CREATE TABLE `class` (
  `c_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '班级ID',
  `c_name` varchar(100) NOT NULL COMMENT '班级名称',
  `teacher_id` int(10) unsigned NOT NULL COMMENT '班主任教师ID',
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 学生表
CREATE TABLE `student` (
  `s_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '学生ID',
  `s_name` varchar(100) NOT NULL COMMENT '学生姓名',
  `class_id` int(10) unsigned NOT NULL COMMENT '班级ID',
  PRIMARY KEY (`s_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

