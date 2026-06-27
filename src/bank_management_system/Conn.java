package bank_management_system;
import java.sql.*;

public class Conn {
	
	Connection c;
	Statement s ;

	public Conn() {
		try {
//			Class.forName(com.mysql.cj.jdbc.Drive); // we no need to rejister the driver beacous we add file in classpath so java will automatically peak this...
			  
			c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "123456789");//jdbc:mysql://localhost:3306
			s = c.createStatement();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	

}
