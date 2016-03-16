package com.kintore.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kintore.bean.FavMenu;
import com.kintore.bean.Menu;
import com.kintore.bean.RecMenu;

public class MenuDao {

	public void AddMenu(Menu menu){

		try {
			 Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();

			return;
		}

		try(
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost/kintorechan?user=root");
			){

			PreparedStatement ps = con.prepareStatement("insert into menu (id,menu,spot,times) values(?,?,?,?)");
			ps.setInt(1, menu.getId());
			ps.setString(2, menu.getMenu());
			ps.setString(3, menu.getSpot());
			ps.setInt(4, menu.getTimes());
			ps.executeUpdate();
			
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

	public static List<FavMenu> GetFavMenu(int id) {
		List<FavMenu> favList = new ArrayList<FavMenu>();
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try(
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost/kintorechan?user=root");
			){
			
			PreparedStatement ps = con.prepareStatement("select a.spot,a.menu,a.times from menu a,(SELECT spot, menu,max(times) as tim from menu group by spot) b where a.spot = b.spot and a.times = b.tim and id = ? ORDER by times desc");
			
			ps.setInt(1, id);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				String spot = rs.getString("spot");
				String menu = rs.getString("menu");
				int times = rs.getInt("times");
				favList.add(new FavMenu(spot,menu,times));
			}
		

		}catch(SQLException e){
			e.printStackTrace();
		}

		return favList;
	}

	public static List<RecMenu> GetRecMenu(int id) {
		List<RecMenu> recList = new ArrayList<RecMenu>();
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try(
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost/kintorechan?user=root");
			){
			
			PreparedStatement ps = con.prepareStatement("SELECT * FROM `menu` WHERE id = ? order by time desc limit 6");
			
			ps.setInt(1, id);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				String spot = rs.getString("spot");
				String menu = rs.getString("menu");
				int times = rs.getInt("times");
				String time = rs.getString("time");
				recList.add(new RecMenu(spot,menu,times,time));
			}
		

		}catch(SQLException e){
			e.printStackTrace();
		}

		return recList;
	}
	
	
}
