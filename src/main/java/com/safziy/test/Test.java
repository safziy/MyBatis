package com.safziy.test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.safziy.vo.User;

public class Test {
	public static void main(String[] args) throws IOException {
		Reader reader = Resources.getResourceAsReader("mybatis.cfg.xml");

		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder()
				.build(reader);

		SqlSession session = sessionFactory.openSession();

		List<User> list = session.selectList("com.safziy.vo.user.mapper.list");

		System.out.println(list);
		
		User user = session.selectOne("com.safziy.vo.user.mapper.loadByName", "safziy");
		System.out.println(user);
		
	}
}
