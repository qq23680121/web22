package com.web.server;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.tomcat.jdbc.pool.DataSource;

import com.mchange.v2.async.RoundRobinAsynchronousRunner;
import com.web.domain.User;
import com.web.utils.DataSourceUtils;

import sun.security.util.Password;

public class Test2 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().write("wwwTEST2hello haohao...");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String attribute = (String) this.getServletContext().getAttribute("name");
		System.out.println("attr"+attribute);
		System.out.println("welcom"+name+password);
		   QueryRunner datasource = new QueryRunner(DataSourceUtils.getDataSource());
		   String sql="select * from user1 where name=? and password=?";
		   User user=null;
		   
		  try {
			user=datasource.query(sql, new BeanHandler<User>(User.class), name,password);
		  System.out.println(user.toString());
		  response.getWriter().write("hao"+user.toString());
		  } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}