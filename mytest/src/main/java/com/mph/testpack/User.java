package com.mph.testpack;
public class User {
	private String name;
public String getName() {
		return name;
	}
public void setName(String name) {
		this.name = name;
	}
public static void main(String[] args) {
		User u = new User();
		u.setName("Piri");
		System.out.println(u.getName());
	}

}

