package DAO;

import Com.ConnectionUtility;
import DTO.Customer;

public class CustomerTestCase {
	public static void main(String[] args) throws Exception {
		CustomerDAO cust=new CustomerDAOImpl(ConnectionUtility.getconnection());
		Customer cus=new Customer();
		cus.setCustName("Anjali");
		cus.setPassword("123");
		cus.setAddress("chennai");
		cus.setEmail("anjalitiwary7878@gmail.com");
		cus.setFlag(0);
		int i=cust.createCustomer(cus);
		System.out.println(i==1?"record inserted..":"not inserted...");
		cust=new CustomerDAOImpl(ConnectionUtility.getconnection());
		int j=cust.updateFlag(1,"Anjali");
		System.out.println(j);
	}
}
