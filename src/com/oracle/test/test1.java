package com.oracle.test;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import com.oracle.utils.DBUtilsPlus;

public class test1 {

	@Test
	public void Test1() throws SQLException{
		
		Connection connection=DBUtilsPlus.getConnection();
		
           if(connection!=null){
			
			System.out.println("链接成功！");
		}
	}
}
