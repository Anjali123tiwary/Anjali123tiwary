package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;

public class ConnectionUtility {

	private static ThreadLocal<Connection> tlocal = new ThreadLocal<Connection>();

	public ConnectionUtility() {
		// TODO Auto-generated constructor stub
	}

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	synchronized public static Connection getconnection() throws Exception {

		Connection con = tlocal.get();
		if (con == null) {
			String url = "jdbc:mysql://localhost:3306/vastpro";
			String username = "root";
			String password = "Annu@9955";
			con = DriverManager.getConnection(url, username, password);
			tlocal.set(con);
			return con;
		} else {
			return con;
		}
	}

	synchronized public static void closeconnection(Exception exp,Savepoint sp) throws SQLException {
		Connection con = tlocal.get();
		if (con == null) {
			System.out.println("there is no connection to close");
		} else {
			con.close();
		}
	}
}
