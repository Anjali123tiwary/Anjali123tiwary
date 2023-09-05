package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
public class JDBCProg1 {
	public static void main(String[] args)throws Exception {
		//Step 1 - Load or register the driver
		//Step 2 - Establish the connection
		
		//step1-loading the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//step 2 - Establish the connection
		String url="jdbc:mysql://localhost:3306/vastpro";
		String username="root";
		String password="Annu@9955";
		Connection con=DriverManager.getConnection(url,username,password);
		System.out.println(con);
	}
}
