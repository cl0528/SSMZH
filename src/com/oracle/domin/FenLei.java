package com.oracle.domin;

public class FenLei {
	
	private int id;
	
	private String name;

	public FenLei(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public FenLei() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FenLei(String name) {
		super();
		this.name = name;
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

	@Override
	public String toString() {
		return "fenlei [id=" + id + ", name=" + name + "]";
	}

	
	

}
