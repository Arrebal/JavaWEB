package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DBUtil.DBUtil;
import entity.Book;
import entity.Lendbook;
import entity.Reader;




public class Dao {
	public Book getbyname(String bname) {
        String sql = "select * from Book where bname ='" + bname + "'";
        Connection conn = DBUtil.getConn();
        Statement state = null;
        ResultSet rs = null;
        Book book = null;
        
        try {
            state = conn.createStatement();
            rs = state.executeQuery(sql);
            while (rs.next()) {
            	int id = rs.getInt("id");
				String bianhao = rs.getString("bianhao");
				String bname2 = rs.getString("bname");
				String wname = rs.getString("wname");
				String bhome=rs.getString("bhome");
				int num = rs.getInt("num");
				book = new Book(id, bianhao,bname2,wname,bhome,num);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(rs, state, conn);
        }
        
        return book;
    }
//添加读者基本信息
	public boolean addReader(Reader reader) {
		Connection conn = DBUtil.getConn();
		PreparedStatement pstmt = null;
		boolean f = false;
		int a = 0;
		try {
			String sql = "insert into Reader(xuehao,rname,sex,xueyuan) value(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, reader.getXuehao());
			pstmt.setString(2, reader.getRname());
			pstmt.setString(3, reader.getSex());
			pstmt.setString(4, reader.getXueyuan());
			a = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(pstmt, conn);
		}
		if (a > 0)
			f = true;

		return f;
	}

	/*public boolean adduser(String tpid, String password, int pid) {
		Connection conn = DBUtil.getConn();
		PreparedStatement pstmt = null;
		boolean f = false;
		int a = 0;
		try {
			String sql = "insert into user(username,password,pid) value(?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, tpid);
			pstmt.setString(2, password);
			pstmt.setInt(3, pid);
			a = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(pstmt, conn);
		}
		if (a > 0)
			f = true;

		return f;
	}*/
//添加新书信息
	public boolean addBook(Book stu) {
		Connection conn = DBUtil.getConn();
		PreparedStatement pstmt = null;
		boolean f = false;
		int a = 0;
		try {
			String sql = "insert into Book(bianhao,bname,wname,bhome,num) value(?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, stu.getBianhao());
			pstmt.setString(2, stu.getBname());
			pstmt.setString(3, stu.getWname());
			pstmt.setString(4, stu.getBhome());
			pstmt.setLong(5, stu.getNum());
			a = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(pstmt, conn);
		}
		if (a > 0)
			f = true;

		return f;
	}

	/*public String searchteaname(String tpid) {
		Connection conn = DBUtil.getConn();
		Statement state = null;
		ResultSet rs = null;
		String teaname = null;
		try {
			String sql = "select teaname from teacher where tpid= '" + tpid + "'";
			state = conn.createStatement();
			rs = state.executeQuery(sql);
			while (rs.next()) {
				teaname = rs.getString("teaname");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(state, conn);
		}
		return teaname;
	}*/

	
	public boolean updateReader(Reader teacher) {
		String sql = "update Reader set xuehao='" + teacher.getXuehao() + "', rname='" + teacher.getRname() + "', sex='"
				+ teacher.getSex() + "',xueyuan='" + teacher.getXueyuan() + "'";
		Connection conn = DBUtil.getConn();
		Statement state = null;
		boolean f = false;
		int a = 0;
		try {
			state = conn.createStatement();
			System.out.println("看看是不是执行了");
			a = state.executeUpdate(sql);
			System.out.println(a);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(state, conn);
		}

		if (a > 0) {
			f = true;
		}
		System.out.println(f);
		return f;
	}

	public boolean updateBook(Book stu) {
		String sql = "update Book set bianhao='" + stu.getBianhao() + "', bname='" + stu.getBname() + "', wname='"
				+ stu.getWname() + "',bhome='" + stu.getBhome() + "',num='" + stu.getNum() + "'";
		Connection conn = DBUtil.getConn();
		Statement state = null;
		boolean f = false;
		int a = 0;
		try {
			state = conn.createStatement();
			System.out.println("看看是不是执行了");
			a = state.executeUpdate(sql);
			System.out.println(a);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(state, conn);
		}

		if (a > 0) {
			f = true;
		}

		System.out.println(f);
		return f;
	}
//浏览图书信息
	public List<Book> liulanbook() {
		String sql = "select * from Book";
		List<Book> list = new ArrayList<>();
		Connection conn = DBUtil.getConn();
		Statement state = null;
		ResultSet rs = null;

		try {
			state = conn.createStatement();
			rs = state.executeQuery(sql);
			Book bean = null;
			while (rs.next()) {
				int id = rs.getInt("id");
				String bianhao = rs.getString("bianhao");
				String bname = rs.getString("bname");
				String wname = rs.getString("wname");
				String bhome=rs.getString("bhome");
				int num = rs.getInt("num");
				bean = new Book(id, bianhao,bname,wname,bhome,num);
				list.add(bean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, state, conn);
		}

		return list;
	}
	//模糊查询图书
	public List<Book> searchBook(String bname,String wname)
    {
        String sql = "select * from Book where ";
        if (bname != "") {
            sql += "bname like '%" +bname+ "%'";
        }
        if (wname != "") {
            sql += "wname like '%" +wname+ "%'";
        }
        
        List<Book> list = new ArrayList<>();
        Connection conn = DBUtil.getConn();
        Statement state = null;
        ResultSet rs = null;
        Book bean = null;
        try {
            state = conn.createStatement();
            rs = state.executeQuery(sql);
            while (rs.next()) {
            	String bianhao = rs.getString("bianhao");
				String bname2 = rs.getString("bname");
				String wname2 = rs.getString("wname");
				String bhome=rs.getString("bhome");
				int num = rs.getInt("num");
				bean = new Book(bianhao,bname,wname,bhome,num);
               
                list.add(bean);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(rs, state, conn);
        }
        
        return list;
    }
	//借阅
	public boolean lend_book(Lendbook book) {
		Connection conn = DBUtil.getConn();
		PreparedStatement pstmt = null;
		boolean f = false;
		int a = 0;
		try {
			String sql = "insert into Lend_book(bainhao,bname,wname,username,startdate,enddate) value(?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, book.getBianhao());
			pstmt.setString(2, book.getBname());
			pstmt.setString(3, book.getWname());
			pstmt.setString(4, book.getUsername());
			pstmt.setString(5, book.getStartdate());
			pstmt.setString(6, book.getEnddate());
			a = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(pstmt, conn);
		}
		if (a > 0)
			f = true;

		return f;
	}
	
	
	//催还
	//归还
	//浏览
	/*public Book searchByid(int id) {
		String sql = "select * from Book where id= '" + id + "'";
		Book book = null;
		Connection conn = DBUtil.getConn();
		Statement state = null;
		ResultSet rs = null;

		try {
			state = conn.createStatement();
			rs = state.executeQuery(sql);
			while (rs.next()) {
				// int id = rs.getInt("id");
				String bianhao = rs.getString("bianhao");
				String bname2 = rs.getString("bname");
				String wname2 = rs.getString("wname");
				String bhome=rs.getString("bhome");
				int num = rs.getInt("num");
				book = new Book(bianhao,bname2,wname2,bhome,num);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, state, conn);
		}

		return book;
	}*/

}
