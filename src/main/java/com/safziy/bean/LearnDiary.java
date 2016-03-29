package com.safziy.bean;

public class LearnDiary {
	private int id;
	private String title;
	private String content;
	private long createTime;
	private int createUser;

	public LearnDiary() {
	}

	public LearnDiary(int id, String title, String content, long createTime, int createUser) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.createTime = createTime;
		this.createUser = createUser;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}

	public int getCreateUser() {
		return createUser;
	}

	public void setCreateUser(int createUser) {
		this.createUser = createUser;
	}

	@Override
	public String toString() {
		return "LearnDiary [id=" + id + ", title=" + title + ", content=" + content + ", createTime=" + createTime
				+ ", createUser=" + createUser + "]";
	}

}
