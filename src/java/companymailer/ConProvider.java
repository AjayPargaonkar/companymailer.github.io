package companymailer;

import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class ConProvider {
    public static Connection getConnection()
    {
        Connection con = null;
        try 
        {
             Class.forName("com.mysql.cj.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/companymailer", "root", "9347469807");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return con;
    }
}
