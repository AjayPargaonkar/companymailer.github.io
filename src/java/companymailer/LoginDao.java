package companymailer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
    public static boolean Validate(String email, String password)
    {
        boolean status = false;
          //connection 
            try 
            {
             Class.forName("com.mysql.cj.jdbc.Driver");
            
             Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/companymailer", "root", "9347469807");
            //query 
            //String q = "";
           PreparedStatement ps =  con.prepareStatement("select * from company_mailer_user where email=? and password=? and authorized=?");
                        ps.setString(1,email);
			ps.setString(2,password);
			ps.setString(3,"yes");
			ResultSet rs=ps.executeQuery();
			status = rs.next();
            
            }catch(Exception e)
            {
                System.out.println("error");
            }
        return status;
    }
}
