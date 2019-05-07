package com.oracle.service;

import java.util.List;

import com.oracle.domin.FenLei;


public interface FenLeiService {

	int addFenlei(FenLei fl);

	List<FenLei> showFenlei();

	int changeFenlei(FenLei f);

}
