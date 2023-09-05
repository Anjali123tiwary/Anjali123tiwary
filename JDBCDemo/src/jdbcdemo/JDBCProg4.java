package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCProg4 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//step 2 - Establish the connection
		String url="jdbc:mysql://localhost:3306/vastpro";
		String username="root";
		String password="Annu@9955";
		Connection con=DriverManager.getConnection(url,username,password);
		Statement stmt=con.createStatement();
		String sql="Select * From employee";
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getInt("eid"));
			System.out.println(rs.getString(2));
		}
	}
	
}