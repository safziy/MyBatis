INSERT INTO `user` (`id`,`name`,`pwd`) VALUES(1,"safziy","123456");
INSERT INTO `user` (`id`,`name`,`pwd`) VALUES(2,"mysafziy","111111");
INSERT INTO `user` (`id`,`name`,`pwd`) VALUES(3,"jack","222222");

INSERT INTO `learn_diary` (`id`,`title`,`content`,`create_time`,`create_user`) VALUES(1,"第一天的标题","第一天的内容...",UNIX_TIMESTAMP('2016-03-27 18:00:00')*1000,1);
INSERT INTO `learn_diary` (`id`,`title`,`content`,`create_time`,`create_user`) VALUES(2,"第二天的标题","第二天的内容...",UNIX_TIMESTAMP('2016-03-28 12:45:37')*1000,1);
INSERT INTO `learn_diary` (`id`,`title`,`content`,`create_time`,`create_user`) VALUES(3,"第三天的标题","第三天的内容...",UNIX_TIMESTAMP('2016-03-29 09:45:30')*1000,1);

INSERT INTO `teacher` (`t_id`,`t_name`,`t_sex`,`t_age`) VALUES(1,"刘建舟",TRUE,30);
INSERT INTO `teacher` (`t_id`,`t_name`,`t_sex`,`t_age`) VALUES(2,"张三",FALSE,30);
INSERT INTO `teacher` (`t_id`,`t_name`,`t_sex`,`t_age`) VALUES(3,"李四",TRUE,30);
INSERT INTO `teacher` (`t_id`,`t_name`,`t_sex`,`t_age`) VALUES(4,"王五",FALSE,30);

INSERT INTO `class` (`c_id`,`c_name`,`teacher_id`) VALUES(1,"09软件工程1班",1);
INSERT INTO `class` (`c_id`,`c_name`,`teacher_id`) VALUES(2,"09软件工程2班",2);
INSERT INTO `class` (`c_id`,`c_name`,`teacher_id`) VALUES(3,"09网络工程1班",3);

INSERT INTO `student` (`s_id`,`s_name`,`class_id`) VALUES(1,"李师师",1);
INSERT INTO `student` (`s_id`,`s_name`,`class_id`) VALUES(2,"张飞",1);
INSERT INTO `student` (`s_id`,`s_name`,`class_id`) VALUES(3,"曹仁",1);
INSERT INTO `student` (`s_id`,`s_name`,`class_id`) VALUES(4,"马冬梅",2);
INSERT INTO `student` (`s_id`,`s_name`,`class_id`) VALUES(5,"李帅",2);
INSERT INTO `student` (`s_id`,`s_name`,`class_id`) VALUES(6,"李天一",2);

