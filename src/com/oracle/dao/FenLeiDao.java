package com.oracle.dao;

import java.util.List;

import com.oracle.domin.FenLei;

public interface FenLeiDao {

	int addFenlei(FenLei fl);

	List<FenLei> showFenlei();

	int changeFenlei(FenLei f);

}
