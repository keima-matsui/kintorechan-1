package com.kintore.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import com.kintore.bean.FavMenu;
import com.kintore.bean.User;

public class UserDao {

	public void regist(User user){

		try {
			 Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();

			return;
		}

		try(
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost/kintorechan?user=root");
			){

			PreparedStatement ps = con.prepareStatement("insert into user (username,password) values(?,?)");
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ps.executeUpdate();
			
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	

	public String Login(ArrayList<String> userData) {

		ResultSet rs = null;
		String name = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try(
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost/kintorechan?user=root");
			){

			PreparedStatement ps = con.prepareStatement("select name from t_user where user_id = ? and pass = ?");
			ps.setString(1, userData.get(0));
			ps.setString(2, userData.get(1));
			rs = ps.executeQuery();
			rs.next();
			if(rs.getString(1) != null){
				name = rs.getString(1);
			}

		}catch(SQLException e){
			e.printStackTrace();
		}

		return name;
	}

	public static int GetId(String username) {

		ResultSet rs = null;
		int id = 0;

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try(
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost/kintorechan?user=root");
			){

			PreparedStatement ps = con.prepareStatement("select id from user where username = ?");
			
			ps.setString(1, username);
			rs = ps.executeQuery();
			rs.next();
			if(rs.getString(1) != null){
				id = rs.getInt(1);
			}

		}catch(SQLException e){
			e.printStackTrace();
		}

		return id;
	}
	
	public int SignIn(String user,String pass) {
		
		int flag = 0;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try(
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost/kintorechan?user=root");
			){
			
			PreparedStatement ps = con.prepareStatement("select count(*) as flg from user where username = ? and password = ?");
			
			ps.setString(1, user);
			ps.setString(2, pass);
			rs = ps.executeQuery();
			
			rs.next();
			flag = rs.getInt("flg");

		}catch(SQLException e){
			e.printStackTrace();
		}

		return flag;
	}

	
}
