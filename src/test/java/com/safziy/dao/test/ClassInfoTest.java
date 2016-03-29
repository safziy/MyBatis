package com.safziy.dao.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.safziy.bean.ClassInfo;

public class ClassInfoTest extends BaseTest {

	@Test
	public void testLoadById() {
		// 默认不是自动提交的 需要自动提交的话 sessionFactory.openSession(true)
		SqlSession session = sessionFactory.openSession();

		String statement = "com.safziy.bean.classinfo.mapper.loadById";
		ClassInfo classInfo = session.selectOne(statement, 1);
		System.out.println("ClassInfoTest testLoadById() == " + classInfo);
		session.commit();
		session.close();
	}
	
	@Test
	public void testLoadById2() {
		// 默认不是自动提交的 需要自动提交的话 sessionFactory.openSession(true)
		SqlSession session = sessionFactory.openSession();

		String statement = "com.safziy.bean.classinfo.mapper.loadById2";
		ClassInfo classInfo = session.selectOne(statement, 1);
		System.out.println("ClassInfoTest testLoadById() == " + classInfo);
		session.commit();
		session.close();
	}

}
