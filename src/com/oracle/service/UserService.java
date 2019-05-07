package com.oracle.service;

import java.util.List;

import com.oracle.domin.User;

public interface UserService {

	List<User> ShowAll();

	int add(User s);

	int[] delete(String[] ids);

	User showOne(int id);

	int update(User s);

}
