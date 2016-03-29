INSERT INTO `user` (`id`,`name`,`pwd`) VALUES(1,"safziy","123456");
INSERT INTO `user` (`id`,`name`,`pwd`) VALUES(2,"mysafziy","111111");
INSERT INTO `user` (`id`,`name`,`pwd`) VALUES(3,"jack","222222");

INSERT INTO `learn_diary` (`id`,`title`,`content`,`create_time`,`create_user`) VALUES(1,"第一天的标题","第一天的内容...",UNIX_TIMESTAMP('2016-03-27 18:00:00')*1000,1);
INSERT INTO `learn_diary` (`id`,`title`,`content`,`create_time`,`create_user`) VALUES(2,"第二天的标题","第二天的内容...",UNIX_TIMESTAMP('2016-03-28 12:45:37')*1000,1);
INSERT INTO `learn_diary` (`id`,`title`,`content`,`create_time`,`create_user`) VALUES(3,"第三天的标题","第三天的内容...",UNIX_TIMESTAMP('2016-03-29 09:45:30')*1000,1);