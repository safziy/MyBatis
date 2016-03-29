package com.safziy.bean;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface LearnDiaryMapper {

	@Insert("INSERT INTO `learn_diary` (`title`,`content`,`create_time`,`create_user`) VALUES(#{title},#{content},#{createTime},#{createUser})")
	public int save(LearnDiary learnDiary);

	@Delete("DELETE FROM `learn_diary` WHERE `id`=#{id}")
	public int delete(int id);

	@Update("UPDATE `learn_diary` SET `title`=#{title},`content`=#{content},`create_time`=#{createTime},`create_user`=#{createUser} WHERE `id`=#{id}")
	public int update(LearnDiary learnDiary);

	@Select("SELECT * FROM `learn_diary` WHERE `id`=#{id}")
	@Results({ @Result(column = "create_time", property = "createTime"),
			@Result(column = "create_user", property = "createUser") })
	public LearnDiary loadById(int id);

	@Select("SELECT `id`,`title`,`content`,`create_time` as createTime,`create_user` as createUser FROM `learn_diary`")
	public List<LearnDiary> loadAll();
}
