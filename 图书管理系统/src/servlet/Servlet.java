package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.Dao;
import entity.Book;
import entity.Reader;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Dao dao=new Dao();
	 protected void service(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException
	    {
	        req.setCharacterEncoding("utf-8");
	        String method = req.getParameter("method");
	       if("addBook".equals(method)) {
	            addBook(req,resp);
	        }else if("addReader".equals(method)) {
	            addReader(req,resp);
	        }else if("liulanbook".equals(method)) {
	            liulanbook(req,resp);
	        }else if("searchBook".equals(method)) {
	            searchBook(req,resp);
	        }else if("getbyname".equals(method)) {
	        	getbyname(req,resp);
	        }
	    }
	  
	    private void addReader(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	        req.setCharacterEncoding("utf-8");
	        String xuehao = req.getParameter("xuehao");
	        String rname = req.getParameter("rname");
	        String sex = req.getParameter("sex");
	        String xueyuan = req.getParameter("xueyuan");
	        
	        Reader reader=new Reader(xuehao,rname,sex,xueyuan);
	        if(dao.addReader(reader)) {
	            req.setAttribute("Reader",reader);
	            req.setAttribute("message","添加成功" );
	            req.getRequestDispatcher("addReader.jsp").forward(req, resp);
	        }else {
	            req.setAttribute("message","读者姓名重复，请重新输入" );
	            req.getRequestDispatcher("addReader.jsp").forward(req, resp);
	        }
	    }
	    
	   

	    private void addBook(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	        req.setCharacterEncoding("utf-8");
	        String bianhao=req.getParameter("bianhao");
	        String bname = req.getParameter("bname");
	        String wname = req.getParameter("wname");
	        String bhome=req.getParameter("bhome");
	        int num = Integer.parseInt(req.getParameter("num"));
	        Book book=new Book(bianhao,bname,wname,bhome,num);
	        if(dao.addBook(book)) {
	            req.setAttribute("book",book);
	            req.setAttribute("message","添加成功" );
	            req.getRequestDispatcher("addBook.jsp").forward(req, resp);
	        }else {
	            req.setAttribute("message","书籍信息重复，请重新输入" );
	            req.getRequestDispatcher("addBook.jsp").forward(req, resp);
	        }
	    }
	    
	    private void searchBook(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
	        req.setCharacterEncoding("utf-8");
	        String bname=req.getParameter("bname");
	        String wname = req.getParameter("wname");
	   
	        List<Book> tens = dao.searchBook(bname, wname);
	        if(tens==null)
	        {
	            req.setAttribute("message", "没有该书");
	            req.getRequestDispatcher("searchbook.jsp").forward(req,resp);
	        }
	        else {
	        req.setAttribute("tens", tens);
	        req.getRequestDispatcher("list.jsp").forward(req,resp);
	        }
	    }
	    private void getbyname(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
	        req.setCharacterEncoding("utf-8");
	        String bname = req.getParameter("bname");
	        Book book = dao.getbyname(bname);
	        if(book==null)
	        {
	            req.setAttribute("message", "未找到该书籍");
	            req.getRequestDispatcher("del.jsp").forward(req, resp);
	        }
	        else 
	        {
	            req.setAttribute("book", book);
	            req.getRequestDispatcher("del2.jsp").forward(req,resp);
	        }
	    }
	    
	    
	    private void liulanbook(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	        req.setCharacterEncoding("utf-8");
	        List<Book> book = dao.liulanbook();
	        req.setAttribute("book", book);
	        req.getRequestDispatcher("liulanbook.jsp").forward(req, resp);
	    
	    }
	    
}
