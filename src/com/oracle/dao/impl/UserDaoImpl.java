package com.oracle.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.oracle.dao.UserDao;
import com.oracle.domin.User;
import com.oracle.utils.DBUtilsPlus;

public class UserDaoImpl implements UserDao {

	
	@Override
	public int add(User s) {
		// TODO Auto-generated method stub

		int i = 0;

		Connection conn = null;

		PreparedStatement ps = null;

		try {
			conn = DBUtilsPlus.getConnection();

			ps = conn.prepareStatement("insert into user(id,name,username,password,phone,zctime) values(?,?,?,?,?,?)");

			ps.setInt(1, s.getId());

			ps.setString(2, s.getName());

			ps.setString(3, s.getUsername());
			
			ps.setString(4, s.getPassword());

			ps.setString(5, s.getPhone());

			ps.setString(6, s.getZctime());

			i = ps.executeUpdate();

		} catch (SQLException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {

			DBUtilsPlus.close(conn, ps);
		}
		return i;

	}

//	@Override
//	public User ShowAll(User s) {
//		// TODO Auto-generated method stub
//
//		List list = new ArrayList();
//
//		User User = null;
//
//		Connection conn = null;
//
//		PreparedStatement ps = null;
//
//		ResultSet rs = null;
//
//		try {
//			conn = DBUtilsPlus.getConnection();
//
//			ps = conn.prepareStatement("select * from User");
//
//			rs = ps.executeQuery();
//
//			while (rs.next()) {
//
//				User.getStuNo();
//
//				User.getName();
//
//				User.getAge();
//
//				User.getPhone();
//
//				User.getRxtime();
//
//				User.getXueyuan();
//
//				User.getZhuanye();
//
//				User.getBanji();
//
//				list.add(User);
//
//			}
//
//		} catch (SQLException e) {
//
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//
//		} finally {
//
//			DBUtilsPlus.close(conn, ps, rs);
//		}
//		return User;
//
//	}
	
	@Override
	public List<User> ShowAll() {
			// TODO Auto-generated method stub
		
			Connection conn = null;

			PreparedStatement ps = null;

			ResultSet rs = null;
			
			List<User> list=new ArrayList<User>();
			try {
				conn = DBUtilsPlus.getConnection();


				ps = conn.prepareStatement("select * from user");


				rs = ps.executeQuery();


				while (rs.next()) {
					
					User s=new User();
					
					int id=rs.getInt(1);
					
					s.setId(id);
					
					String name=rs.getString(2);
					
					s.setName(name);
					
                    String username=rs.getString(3);
					
					s.setUsername(username);
					
                    String password=rs.getString(4);
					
					s.setPassword(password);
	         
					String phone=rs.getString(5);
					
					s.setPhone(phone);
					
					String zctime=rs.getString(6);
					
					s.setZctime(zctime);
					
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
	public User showOne(int id) {
		
		Connection conn = null;

		PreparedStatement ps = null;

		ResultSet rs = null;
	
		User s=null;
		
		try {
			conn = DBUtilsPlus.getConnection();


			ps = conn.prepareStatement("select * from user where id=?");
			
			ps.setInt(1, id);


			rs = ps.executeQuery();


			if(rs.next()) {
				
				s=new User();
				
				int id2=rs.getInt(1);
				
				s.setId(id2);
				
				String name=rs.getString(2);
				
				s.setName(name);
				
                String username=rs.getString(3);
				
				s.setUsername(username);
				
                String password=rs.getString(4);
				
				s.setPassword(password);
         
				String phone=rs.getString(5);
				
				s.setPhone(phone);
				
				String zctime=rs.getString(6);
				
				s.setZctime(zctime);
				

			}


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {


			DBUtilsPlus.close(conn, ps, rs);


		}
		return s;
	}

	@Override
	public int update(User s) {
     
		int a=0;
		
		Connection conn = null;

		PreparedStatement ps = null;

		try {
			conn = DBUtilsPlus.getConnection();

			ps = conn.prepareStatement(
					
					"update user set id=?,name=?,username=?,password=?,phone=?,zctime=? where id=?");

			ps.setInt(1, s.getId());

			ps.setString(2, s.getName());

			ps.setString(3, s.getUsername());
			
			ps.setString(4, s.getPassword());

			ps.setString(5, s.getPhone());

			ps.setString(6, s.getZctime());

			int i = ps.executeUpdate();

			if (i > 0) {

				a=1;
			} else {

                a=0;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			DBUtilsPlus.close(conn, ps);

		}

		return a;
	}

//	@Override
//	public User add(int stuNo) {
//		
//        User User=null;
//		
//        Connection conn = null;
//		
//		PreparedStatement ps = null;
//		
//		ResultSet rs = null;
//		
//		try {
//			conn = DBUtilsPlus.getConnection();
//			
//			ps = conn.prepareStatement("select stuNo from admin where stuNo=?");
//			
//			ps.setInt(1, User.getStuNo());
//			
//			rs = ps.executeQuery();
//			
//			if (rs.next()) {
//				
//				int stuNo2 = rs.getInt(1);
//					
//				User=new User();
//				
//				User.setStuNo(stuNo);
//			}
//		} catch (SQLException e) {
//			
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			
//		} finally {
//			
//			DBUtilsPlus.close(conn, ps, rs);
//		}
//		
//		return User;
//	}

	@Override
	public int[] delete(String[] ids) {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		
		PreparedStatement ps = null;

		ResultSet rs = null;
		
		int[] arr=null;
		
		try {
			conn = DBUtilsPlus.getConnection();
			
			conn.setAutoCommit(false);
			
			for(int i=0;i<ids.length;i++){

			ps = conn.prepareStatement("delete from user where id=?");

//          第一种
			ps.setInt(1, Integer.parseInt(ids[i]));
//
//			ps.executeUpdate();
			
			ps.addBatch();
			
			if(i==1){
				
				throw new SQLException();
				
			}
			
			arr=ps.executeBatch();
			
			conn.commit();
			
			}
			
			ps.executeBatch();
			
		} catch (SQLException e) {
		    
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			e.printStackTrace();
		}finally{
			
			DBUtilsPlus.close(conn, ps, rs);
		}
		
		return arr;
	}

}
