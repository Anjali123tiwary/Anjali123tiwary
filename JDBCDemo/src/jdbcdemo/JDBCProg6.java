package jdbcdemo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
public class JDBCProg6 {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//step 2 - Establish the connection
		String url="jdbc:mysql://localhost:3306/vastpro";
		String username="root";
		String password="Annu@9955";
		Connection con=DriverManager.getConnection(url,username,password);
		
		CallableStatement cs= con.prepareCall("{call myproc1()}");
		cs.executeUpdate();
		
//		cs=con.prepareCall("{call updateFlag(?,?)}");
//		cs.setString(1, "somu");
//		cs.setInt(2, 1);
//		
//		int i=cs.executeUpdate();
//		System.out.println("no of rows updated...:"+i);
//		
//		cs=con.prepareCall("{call countEmployees(?)}");
//		cs.registerOutParameter(1, Types.INTEGER);
//		
//		cs.execute();
//		
//		int no=cs.getInt(1);
//		
//		System.out.println("No Of Rows...:"+no);
//		
//		cs=con.prepareCall("{call getFlagValue(?,?)}");
//		
//		cs.setString(1,"somu");
//		cs.registerOutParameter(2, Types.INTEGER);
//		
//		cs.execute();
//		
//		int flagvalue=cs.getInt(2);
//		System.out.println("flag value of ramu is...:"+flagvalue);
	}
}