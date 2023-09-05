package jdbcdemo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCProg5 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/vastpro";
		String username="root";
		String password="Annu@9955";
		Connection con=DriverManager.getConnection(url, username, password);
		Scanner sc=new Scanner(System.in);
		String sql="insert into employee values (?,?,?,?,?,?)";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setInt(1, 2);
		pstmt.setString(2, "Anjali");
		pstmt.setString(3, "superman");
		pstmt.setInt(4, 2000);
		pstmt.setString(5, "banglore");
		pstmt.setInt(6, 0);
		
		int n=pstmt.executeUpdate();
		
		System.out.println("Number of rows updated...:"+n);
	}
}

