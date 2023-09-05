package jdbcdemo;

import java.sql.Connection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConnectionUtilityMain {

	public static void main(String[] args) {
		
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(()->{
			try {
				Connection con=ConnectionUtility.getconnection();
				System.out.println("The thread 1 connection is : " + con);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		});
		
		es.execute(()->{
			try {
				Connection con=ConnectionUtility.getconnection();
				System.out.println("The thread 2 connection is : " + con);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		});
		
	}
}
