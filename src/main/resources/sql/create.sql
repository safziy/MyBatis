CREATE TABLE `user` (
  `id` int(11) NOT NULL COMMENT 'user唯一ID',
  `name` varchar(30) NOT NULL COMMENT 'user用户名',
  `pwd` varchar(64) NOT NULL COMMENT 'user密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `learn_diary` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '学习日记的自增ID',
  `title` varchar(200) NOT NULL COMMENT '学习日记的标题',
  `content` text NOT NULL COMMENT '学习日记的内容',
  `create_time` bigint(20) NOT NULL COMMENT '学习日记的创建时间',
  `create_user` int(11) NOT NULL COMMENT '学习日记的创建者',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
