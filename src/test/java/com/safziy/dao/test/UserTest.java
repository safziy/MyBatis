package com.safziy.dao.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.safziy.bean.User;

public class UserTest extends BaseTest {

	@Test
	public void testLoadAllUser() {
		// 默认不是自动提交的 需要自动提交的话 sessionFactory.openSession(true)
		SqlSession session = sessionFactory.openSession();

		String statement = "com.safziy.bean.user.mapper.list";
		List<User> list = session.selectList(statement);
		System.out.println(list);

		session.close();
	}

	@Test
	public void testLoadUserByName() {
		// 默认不是自动提交的 需要自动提交的话 sessionFactory.openSession(true)
		SqlSession session = sessionFactory.openSession();

		String statement = "com.safziy.bean.user.mapper.loadByName";
		User user = session.selectOne(statement, "safziy");
		
		System.out.println(user);

		session.close();
	}

}
