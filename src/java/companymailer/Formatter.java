/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companymailer;

import java.text.SimpleDateFormat;

/**
 *
 * @author User
 */
public class Formatter {
 public static java.sql.Date getSqlDate(String strDate){
		java.sql.Date sqlDate=null;
		try{
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date utilDate=format.parse(strDate);
		sqlDate=new java.sql.Date(utilDate.getTime());
		}catch(Exception e){System.out.println(e);}
		return sqlDate;
	}
	
	public static java.sql.Date getCurrentDate(){
		java.sql.Date sqlCurrentDate=null;
		try{
			java.util.Date utilDate=java.util.Calendar.getInstance().getTime();
			sqlCurrentDate=new java.sql.Date(utilDate.getTime());
			
		}catch(Exception e){System.out.println(e);}
		return sqlCurrentDate;
	}   
}
