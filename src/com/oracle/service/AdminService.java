package com.oracle.service;

import com.oracle.domin.Admin;

public interface AdminService {

	Admin login(Admin a);

	int register(Admin a);

	Admin showAdmin(String uname);

}
