package com.oracle.dao;

import java.util.List;

import com.oracle.domin.Book;

public interface BookDao {

	List<Book> ShowAllBook();

	int addbook(Book s);

	Book showOnebook(int id);

	int updatebook(Book s);

	int[] deletebook(String[] ids);

}
