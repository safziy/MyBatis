package com.safziy.dao.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.safziy.bean.User;

/**
 * 缓存 测试
 *
 */
public class CacheTest extends BaseTest {


	/**
	 * 测试一级缓存  一级缓存是Session级别的缓存
	 */
	@Test
	public void testCache1() {
		SqlSession session = sessionFactory.openSession(true);

		String selectStatement = "com.safziy.bean.user.mapper.loadById";
		String updateStatement = "com.safziy.bean.user.mapper.updateUser";
		
		User user1 = session.selectOne(selectStatement, 1);
		System.out.println(user1);
		
		// 可以直接调用清空缓存
		session.clearCache();
		
		// 调用C/U/D 操作时 会清空缓存
		session.update(updateStatement, new User(2,"safziy_update","123456_update"));
		
		User user2 = session.selectOne(selectStatement, 1);
		System.out.println(user2);
		
		// session close 也会清空缓存
		session.close();
	}
	
	/**
	 * 测试二级缓存  二级缓存是Mapper(namespace)级别的缓存
	 */
	@Test
	public void testCache2() {
		SqlSession session1 = sessionFactory.openSession(true);
		SqlSession session2 = sessionFactory.openSession(true);

		String selectStatement = "com.safziy.bean.user.mapper.loadById";
		
		User user1 = session1.selectOne(selectStatement, 1);
		System.out.println(user1);
		
		session1.commit();
		
		
		User user2 = session2.selectOne(selectStatement, 1);
		System.out.println(user2);
		
		session1.close();
		session2.close();
	}

}
