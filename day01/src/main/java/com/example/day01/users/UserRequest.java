package com.example.day01.users;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserRequest{
	private String last_name;
	private String first_name;
	private int age;

	@Override
	public String toString() {
		return "UserRequest{" +
				"last_name='" + last_name + '\'' +
				", first_name='" + first_name + '\'' +
				", age=" + age +
				'}';
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
