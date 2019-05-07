package com.oracle.dao;

import java.util.List;

import com.oracle.domin.User;

public interface UserDao {

	int add(User s);

	List<User> ShowAll();

	int[] delete(String[] ids);

	int update(User s);

	User showOne(int id);

}
