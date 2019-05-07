package com.oracle.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.oracle.dao.AdminDao;
import com.oracle.domin.Admin;
import com.oracle.utils.DBUtilsPlus;

public class AdminDaoImpl implements AdminDao {
	
	@Override
	public Admin login(Admin a) {
		
		Admin admin=null;
		
        Connection conn = null;
		
		PreparedStatement ps = null;
		
		ResultSet rs = null;
		
		try {
			conn = DBUtilsPlus.getConnection();
			
			ps = conn.prepareStatement("select username,password from Admin where username=?");
			
			ps.setString(1, a.getUsername());
			
			rs = ps.executeQuery();
			
			if (rs.next()) {
				
				String username = rs.getString(1);
				
				String password=rs.getString(2);
				
				admin=new Admin();
				
				admin.setUsername(username);
				
				admin.setPassword(password);
			}
		} catch (SQLException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} finally {
			
			DBUtilsPlus.close(conn, ps, rs);
		}
		
		return admin;
	}

	@Override
	public int register(Admin a) {
		// TODO Auto-generated method stub
	
		int i = 0;

		Connection conn = null;

		PreparedStatement ps = null;

		// ResultSet rs = null;

		try {
			conn = DBUtilsPlus.getConnection();

			// ps=conn.prepareStatement("select *from student");

			// rs=ps.executeQuery();

			ps = conn.prepareStatement("insert into admin (name,phone,userName,password) values (?,?,?,?)");

			ps.setString(1, a.getName());

			ps.setString(2, a.getPhone());

			ps.setString(3, a.getUsername());

			ps.setString(4, a.getPassword());

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
	public Admin showAdmin(String uname) {
		
        Admin admin=null;
		
        Connection conn = null;
		
		PreparedStatement ps = null;
		
		ResultSet rs = null;
		
		try {
			conn = DBUtilsPlus.getConnection();
			
			ps = conn.prepareStatement("select * from admin where username=?");
			
			ps.setString(1, uname);
			
			rs = ps.executeQuery();
			
			if (rs.next()) {
				
				int id=rs.getInt(1);
				
				String name=rs.getString(2);
				
				String username = rs.getString(3);
				
				String password=rs.getString(4);
				
				String phone=rs.getString(5);
				
				admin=new Admin(id, name, username, password, phone);
			}
		} catch (SQLException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} finally {
			
			DBUtilsPlus.close(conn, ps, rs);
		}
		
		return admin;
	}

}
