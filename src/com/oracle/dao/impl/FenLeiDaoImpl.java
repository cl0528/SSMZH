package com.oracle.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.oracle.dao.FenLeiDao;
import com.oracle.domin.FenLei;
import com.oracle.utils.DBUtilsPlus;

public class FenLeiDaoImpl implements FenLeiDao {

	@Override
	public int addFenlei(FenLei fl) {
		
		int i = 0;

		Connection conn = null;

		PreparedStatement ps = null;

		try {
			conn = DBUtilsPlus.getConnection();

			ps = conn.prepareStatement("insert into fenlei (name) values (?)");

			ps.setString(1, fl.getName());

			i = ps.executeUpdate();

		} catch (SQLException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {

			DBUtilsPlus.close(conn, ps);
		}
		return i;
	}

	@Override
	public List<FenLei> showFenlei() {
		
		Connection conn = null;

		PreparedStatement ps = null;

		ResultSet rs = null;
		
		List<FenLei> list=new ArrayList<FenLei>();
		
		try {
			conn = DBUtilsPlus.getConnection();


			ps = conn.prepareStatement("select * from fenlei");


			rs = ps.executeQuery();


			while (rs.next()) {
				
				FenLei s=new FenLei();
				
				int id=rs.getInt(1);
				
				s.setId(id);
				
				String name=rs.getString(2);
				
				s.setName(name);
								
				list.add(s);
			}


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {


			DBUtilsPlus.close(conn, ps, rs);


		}
		return list;
	}

	@Override
	public int changeFenlei(FenLei f) {
		// TODO Auto-generated method stub
		return 0;
	}

}
