package com.safziy.dao.test;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;

public class BaseTest {
	public static SqlSessionFactory sessionFactory;

	@BeforeClass
	public static void beforeClass() throws IOException {
		Reader reader = Resources.getResourceAsReader("mybatis.cfg.xml");

		sessionFactory = new SqlSessionFactoryBuilder().build(reader);
	}
}
