package com.tomsl.dbalive;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.opencms.main.OpenCms;


public class DbAlive {
	
	/**
	 * No parameters neccessary
	 * cause using Standart Tables of Ocms
	 * like .. dbo.CMS_USERS
	 */
	
	// is DesignPattern Singleton
	private static DbAlive instance = new DbAlive(); 
	private static final String DB_TABLE = "CMS_USERS";
	
	// include Logger
	
	
	// private Constructor
	private DbAlive(){
		//LOG.debug("in private Constructor");
		//foo;
	}
	
	
	//
	public static DbAlive getInstance(){
		//LOG.debug("Returned Instance");
		return instance;
	}
	
	public String getState(){
		//LOG.info("DB Checked");
		String ret = "0";
		if(this.fetchDB()){
			ret = "1";
		}
		
		return ret;
	}
	
	private boolean fetchDB(){
		//LOG.debug("DB fetched");
		boolean ret = false;
		//String err="";
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		String SQL = "";
		
		try{
			con = OpenCms.getSqlManager().getConnection("default");
			stmt = con.createStatement();
			SQL = "SELECT * FROM "+DB_TABLE;	// No Prepared Statement, cause this is fix
												// only checked if resultset != null
			rs = stmt.executeQuery(SQL);
			ret=rs.next();
			
			
		}catch(SQLException e){
			e.printStackTrace();
			//err += e.toString();
			//LOG.error(err);
		}finally{
			try{if(rs!=null)rs.close();}catch (Exception e){};
			try{if(stmt!=null)stmt.close();}catch (Exception e){};
			try{if(con!=null)con.close();}catch (Exception e){};
			
		}
		return ret;
	}
	
}
