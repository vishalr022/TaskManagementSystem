package AppJdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Db {
	static Connection conn = null;

	 public static Connection connect() {
     try {
    	 String url ="jdbc:mysql://localhost:3306/employee" ;
    	 String Username ="root" ;
    	 String Password ="Vishal@123" ;
    	 
    	 conn= DriverManager.getConnection(url,Username,Password);	 
    	 //DriverManager.getConnection("jdbc:mysql//localhost:3306/employee","root","vishal@123")
     }
     catch(Exception e) {}
    return conn;
	}

}
