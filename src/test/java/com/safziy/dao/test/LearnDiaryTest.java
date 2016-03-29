package com.safziy.dao.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.safziy.bean.LearnDiary;

public class LearnDiaryTest extends BaseTest {

	@Test
	public void testSave() {
		// 默认不是自动提交的 需要自动提交的话 sessionFactory.openSession(true)
		SqlSession session = sessionFactory.openSession();

		String statement = "com.safziy.bean.learn_diary.mapper.save";
		
		LearnDiary learnDiary = new LearnDiary(-1, "第X天的标题", "第X天的内容...", System.currentTimeMillis(), 1);
		// 返回改变的行数
		int insert = session
				.insert(statement, learnDiary);
		System.out.println("LearnDiaryTest testSave() ==" + insert);
		System.out.println("LearnDiaryTest testSave() ==" + learnDiary);
		session.commit();
		session.close();
	}

	@Test
	public void testDelete() {
		SqlSession session = sessionFactory.openSession(true);

		String statement = "com.safziy.bean.learn_diary.mapper.delete";
		// 返回改变的行数
		int delete = session.delete(statement, 4);
		System.out.println("LearnDiaryTest testDelete() ==" + delete);
		session.close();
	}

	@Test
	public void testUpdate() {
		SqlSession session = sessionFactory.openSession(true);

		String statement = "com.safziy.bean.learn_diary.mapper.update";
		// 返回改变的行数
		int update = session.update(statement,
				new LearnDiary(3, "第三天的标题", "第三天的内容update...", System.currentTimeMillis(), 1));
		System.out.println("LearnDiaryTest testUpdate() ==" + update);
		session.close();
	}

	@Test
	public void testLoadById() {
		// 默认不是自动提交的 需要自动提交的话 sessionFactory.openSession(true)
		SqlSession session = sessionFactory.openSession();

		String statement = "com.safziy.bean.learn_diary.mapper.loadById";
		LearnDiary learnDiary = session.selectOne(statement, 2);
		System.out.println("LearnDiaryTest testLoadById() ==" + learnDiary);
		session.commit();
		session.close();
	}

	@Test
	public void testLoadAll() {
		// 默认不是自动提交的 需要自动提交的话 sessionFactory.openSession(true)
		SqlSession session = sessionFactory.openSession();

		String statement = "com.safziy.bean.learn_diary.mapper.loadAll";
		List<LearnDiary> list = session.selectList(statement);
		System.out.println("LearnDiaryTest testLoadAll() ==" + list);
		session.commit();
		session.close();
	}

}
