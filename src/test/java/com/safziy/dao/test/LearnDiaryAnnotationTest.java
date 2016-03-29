package com.safziy.dao.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.safziy.bean.LearnDiary;
import com.safziy.bean.LearnDiaryMapper;

public class LearnDiaryAnnotationTest extends BaseTest {

	@Test
	public void testSave() {
		// 默认不是自动提交的 需要自动提交的话 sessionFactory.openSession(true)
		SqlSession session = sessionFactory.openSession();
		LearnDiaryMapper mapper = session.getMapper(LearnDiaryMapper.class);
		// 返回改变的行数
		int insert = mapper.save(new LearnDiary(-1, "第X天的标题", "第X天的内容...", System.currentTimeMillis(), 1));

		System.out.println(insert);
		session.commit();
		session.close();
	}

	@Test
	public void testDelete() {
		SqlSession session = sessionFactory.openSession(true);
		LearnDiaryMapper mapper = session.getMapper(LearnDiaryMapper.class);

		// 返回改变的行数
		int delete = mapper.delete(4);
		System.out.println(delete);
		session.close();
	}

	@Test
	public void testUpdate() {
		SqlSession session = sessionFactory.openSession(true);
		LearnDiaryMapper mapper = session.getMapper(LearnDiaryMapper.class);

		// 返回改变的行数
		int update = mapper.update(new LearnDiary(3, "第三天的标题", "第三天的内容update...", System.currentTimeMillis(), 1));
		System.out.println(update);
		session.close();
	}

	@Test
	public void testLoadById() {
		// 默认不是自动提交的 需要自动提交的话 sessionFactory.openSession(true)
		SqlSession session = sessionFactory.openSession();
		LearnDiaryMapper mapper = session.getMapper(LearnDiaryMapper.class);

		LearnDiary learnDiary = mapper.loadById(2);
		System.out.println(learnDiary);
		session.commit();
		session.close();
	}

	@Test
	public void testLoadAll() {
		// 默认不是自动提交的 需要自动提交的话 sessionFactory.openSession(true)
		SqlSession session = sessionFactory.openSession();
		LearnDiaryMapper mapper = session.getMapper(LearnDiaryMapper.class);

		List<LearnDiary> list = mapper.loadAll();
		System.out.println(list);
		session.commit();
		session.close();
	}

}
