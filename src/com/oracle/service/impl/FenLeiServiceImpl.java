package com.oracle.service.impl;

import java.util.List;

import com.oracle.dao.FenLeiDao;
import com.oracle.dao.impl.FenLeiDaoImpl;
import com.oracle.domin.FenLei;
import com.oracle.service.FenLeiService;

public class FenLeiServiceImpl implements FenLeiService {

	FenLeiDao fd=new FenLeiDaoImpl();
	
	@Override
	public int addFenlei(FenLei fl) {
		// TODO Auto-generated method stub
		return fd.addFenlei(fl);
	}

	@Override
	public List<FenLei> showFenlei() {
		// TODO Auto-generated method stub
		return fd.showFenlei();
	}

	@Override
	public int changeFenlei(FenLei f) {
		// TODO Auto-generated method stub
		return fd.changeFenlei(f);
	}



}
