package com.oracle.domin;

public class Book {

	private int id;
	
	private String name;
	
	private String jiage;
	
	private String chuban;
	
	private String zhuangtai;
	
	private String jieshuren;

	public Book(int id, String name, String jiage, String chuban, String zhuangtai, String jieshuren) {
		super();
		this.id = id;
		this.name = name;
		this.jiage = jiage;
		this.chuban = chuban;
		this.zhuangtai = zhuangtai;
		this.jieshuren = jieshuren;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String name, String jiage, String chuban, String zhuangtai, String jieshuren) {
		super();
		this.name = name;
		this.jiage = jiage;
		this.chuban = chuban;
		this.zhuangtai = zhuangtai;
		this.jieshuren = jieshuren;
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

	public String getJiage() {
		return jiage;
	}

	public void setJiage(String jiage) {
		this.jiage = jiage;
	}

	public String getChuban() {
		return chuban;
	}

	public void setChuban(String chuban) {
		this.chuban = chuban;
	}

	public String getZhuangtai() {
		return zhuangtai;
	}

	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}

	public String getJieshuren() {
		return jieshuren;
	}

	public void setJieshuren(String jieshuren) {
		this.jieshuren = jieshuren;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", jiage=" + jiage + ", chuban=" + chuban + ", zhuangtai="
				+ zhuangtai + ", jieshuren=" + jieshuren + "]";
	}
}
