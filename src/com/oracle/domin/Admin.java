package com.oracle.domin;

public class Admin {
	
	private int id;
	
	private String name;
	
	private String username;
	
	private String password;
	
	private String  phone;

	public Admin(int id, String name, String username, String password, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.phone = phone;
	}

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(String name, String username, String password, String phone) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.phone = phone;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password + ", phone="
				+ phone + "]";
	}
	
	

}
