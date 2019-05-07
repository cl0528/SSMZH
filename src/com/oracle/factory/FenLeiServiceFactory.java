package com.oracle.factory;

import com.oracle.service.FenLeiService;
import com.oracle.service.impl.FenLeiServiceImpl;

public class FenLeiServiceFactory {

	public static FenLeiService getFenLeiServiceImpl(){
		
		return new FenLeiServiceImpl();
	}
}
