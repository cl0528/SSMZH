package com.oracle.domin;

public class User {
	
	private int id;
	
	private String name;
	
	private String username;
	
	private String password;
	
	private String phone;
	
	private String zctime;

	public User(int id, String name, String username, String password, String phone, String zctime) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.zctime = zctime;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String name, String username, String password, String phone, String zctime) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.zctime = zctime;
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

	public String getZctime() {
		return zctime;
	}

	public void setZctime(String zctime) {
		this.zctime = zctime;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password + ", phone="
				+ phone + ", zctime=" + zctime + "]";
	}
	
	

}
