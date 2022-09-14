package servlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity.User;;

public class userServlet {
private Connection conn;
private PreparedStatement pstmt;
@SuppressWarnings("static-access")
public userServlet()
{
	conn=new DBUtil.DBUtil().getConn();
}
public boolean Hefa1(User user)
{
	try {
		pstmt=conn.prepareStatement("select * from user1 where user= '"+user.getUser()+"' and password=? and job=?");
	/*pstmt.setString(1, user.getUser());*/
	pstmt.setString(1, user.getPassword());
	pstmt.setString(2, user.job1);
	ResultSet rs=pstmt.executeQuery();
	if(rs.next()) return true;
	else return false;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return false;
	}
}
public boolean Hefa2(User user)
{
	try {
		pstmt=conn.prepareStatement("select * from user1 where user= '"+user.getUser()+"' and password=? and  job=?");
	/*pstmt.setString(1, user.getUser());*/
	pstmt.setString(1, user.getPassword());
	pstmt.setString(2, user.job2);
	ResultSet rs=pstmt.executeQuery();
	if(rs.next()) return true;
	else return false;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return false;
	}
}
}
