package com.oracle.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.oracle.dao.BookDao;
import com.oracle.domin.Book;
import com.oracle.utils.DBUtilsPlus;

public class BookDaoImpl implements BookDao {
	
	@Override
	public int addbook(Book s) {
		// TODO Auto-generated method stub

		int i = 0;

		Connection conn = null;

		PreparedStatement ps = null;

		try {
			conn = DBUtilsPlus.getConnection();

			ps = conn.prepareStatement("insert into book(id,name,jiage,chuban,zhuangtai,jieshuren,zhuanye,banji) values(?,?,?,?,?,?)");

			ps.setInt(1, s.getId());

			ps.setString(2, s.getName());

			ps.setString(3, s.getJiage());
			
			ps.setString(4, s.getChuban());

			ps.setString(5, s.getZhuangtai());

			ps.setString(6, s.getJieshuren());

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
//	public Book ShowAll(Book s) {
//		// TODO Auto-generated method stub
//
//		List list = new ArrayList();
//
//		Book Book = null;
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
//			ps = conn.prepareStatement("select * from Book");
//
//			rs = ps.executeQuery();
//
//			while (rs.next()) {
//
//				Book.getStuNo();
//
//				Book.getName();
//
//				Book.getAge();
//
//				Book.getPhone();
//
//				Book.getRxtime();
//
//				Book.getXueyuan();
//
//				Book.getZhuanye();
//
//				Book.getBanji();
//
//				list.add(Book);
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
//		return Book;
//
//	}
	
	@Override
	public List<Book> ShowAllBook() {
			// TODO Auto-generated method stub
		
			Connection conn = null;

			PreparedStatement ps = null;

			ResultSet rs = null;
			
			List<Book> list=new ArrayList<Book>();
			try {
				conn = DBUtilsPlus.getConnection();


				ps = conn.prepareStatement("select * from book");


				rs = ps.executeQuery();


				while (rs.next()) {
					
					Book s=new Book();
					
					int id=rs.getInt(1);
					
					s.setId(id);
					
					String name=rs.getString(2);
					
					s.setName(name);
					
					String jiage=rs.getString(3);
					
					s.setJiage(jiage);
					
					String chuban=rs.getString(4);
					
					s.setChuban(chuban);
					
					String zhuangtai=rs.getString(5);
					
					s.setZhuangtai(zhuangtai);
					
					String jieshuren=rs.getString(6);
					
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
	public Book showOnebook(int id) {
		
		Connection conn = null;

		PreparedStatement ps = null;

		ResultSet rs = null;
	
		Book s=null;
		
		try {
			conn = DBUtilsPlus.getConnection();


			ps = conn.prepareStatement("select * from book where id=?");
			
			ps.setInt(1, id);


			rs = ps.executeQuery();


			if(rs.next()) {
				
				s=new Book();
				
				int id2=rs.getInt(1);
				
				s.setId(id2);
			
				String name=rs.getString(2);
				
				s.setName(name);
				
				String jiage=rs.getString(3);
				
				s.setJiage(jiage);
				
				String chuban=rs.getString(4);
				
				s.setChuban(chuban);
				
				String zhuangtai=rs.getString(5);
				
				s.setZhuangtai(zhuangtai);
				
				String jieshuren=rs.getString(6);
				
				

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
	public int updatebook(Book s) {
     
		int a=0;
		
		Connection conn = null;

		PreparedStatement ps = null;

		try {
			conn = DBUtilsPlus.getConnection();

			ps = conn.prepareStatement(
					
					"update book set id=?,name=?,jiage=?,chuban=?,zhuangtai=?,jieshuren=? where id=?");

			ps.setInt(1, s.getId());

			ps.setString(2, s.getName());

			ps.setString(3, s.getJiage());
			
			ps.setString(4, s.getChuban());

			ps.setString(5, s.getZhuangtai());

			ps.setString(6, s.getJieshuren());

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
//	public Book add(int stuNo) {
//		
//        Book Book=null;
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
//			ps.setInt(1, Book.getStuNo());
//			
//			rs = ps.executeQuery();
//			
//			if (rs.next()) {
//				
//				int stuNo2 = rs.getInt(1);
//					
//				Book=new Book();
//				
//				Book.setStuNo(stuNo);
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
//		return Book;
//	}

	@Override
	public int[] deletebook(String[] ids) {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		
		PreparedStatement ps = null;

		ResultSet rs = null;
		
		int[] arr=null;
		
		try {
			conn = DBUtilsPlus.getConnection();
			
			conn.setAutoCommit(false);
			
			for(int i=0;i<ids.length;i++){

			ps = conn.prepareStatement("delete from book where id=?");

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
