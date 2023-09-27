package jdbcPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/company";
		String username="root";
		String password="Annu@9955";
		Connection conn=DriverManager.getConnection(url, username, password);
		System.out.println(conn);
//		for execute update , it will only return integer
//		String sql="insert into employee values(3,'kowsi','coke','Tamil Nadu',300)";
		Statement stmt=conn.createStatement();
//		int count=stmt.executeUpdate(sql);
//		System.out.println(count);
//		for execute query, it will return group of data(row or column)
		String sql1="select * from employee";
		ResultSet rs=stmt.executeQuery(sql1);
		while(rs.next()) {
			System.out.println(rs.getInt("eid"));
			System.out.println(rs.getString("ename"));
			System.out.println(rs.getString("epass"));
			System.out.println(rs.getString("ecity"));
			System.out.println(rs.getInt("esalary"));
		}
		String sql="insert into employee values(5,'ramu','spider','chennai',900)";
//		String sql="insert into employee values (?,?,?,?,?)";
		PreparedStatement pstmt=conn.prepareStatement(sql);
//		pstmt.setInt(1, 4);
//		pstmt.setString(2, "Malar");
//		pstmt.setString(3, "vmalar");
//		pstmt.setString(4, "chennai");
//		pstmt.setInt(5, 500);
		int n=pstmt.executeUpdate();
		System.out.println(n);
		
	}
}
