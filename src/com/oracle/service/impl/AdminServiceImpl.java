package com.oracle.service.impl;

import com.oracle.dao.AdminDao;
import com.oracle.dao.impl.AdminDaoImpl;
import com.oracle.domin.Admin;
import com.oracle.service.AdminService;

public class AdminServiceImpl implements AdminService {
	
	AdminDao ad=new AdminDaoImpl();

	@Override
	public Admin login(Admin a) {
		// TODO Auto-generated method stub
		return ad.login(a);
	}

	@Override
	public int register(Admin a) {
		// TODO Auto-generated method stub
		return ad.register(a);
	}

	@Override
	public Admin showAdmin(String uname) {
		// TODO Auto-generated method stub
		return ad.showAdmin(uname);
	}

}
