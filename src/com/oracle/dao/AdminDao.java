package com.oracle.dao;

import com.oracle.domin.Admin;

public interface AdminDao {

	Admin login(Admin a);

	int register(Admin a);

	Admin showAdmin(String uname);

}
