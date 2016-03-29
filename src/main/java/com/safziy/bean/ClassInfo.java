package com.safziy.bean;

public class ClassInfo {
	private int id;
	private String name;
	private Teacher teacher;

	public ClassInfo() {
	}

	public ClassInfo(int id, String name, Teacher teacher) {
		this.id = id;
		this.name = name;
		this.teacher = teacher;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "ClassInfo [id=" + id + ", name=" + name + ", teacher=" + teacher + "]";
	}

}
