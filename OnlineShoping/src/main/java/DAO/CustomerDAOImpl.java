package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Com.ConnectionUtility;
import DTO.Customer;

public class CustomerDAOImpl implements CustomerDAO{
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	public CustomerDAOImpl(Connection con) {
		this.con = con;
	}

	@Override
	public Customer findBycustName(String cname) throws Exception {
		ps=con.prepareStatement("select * from employee where username=?");
		ps.setString(1, cname);
		rs=ps.executeQuery();
		Customer cust=new Customer();
		if(rs.next()) {
			cust.setCustName(rs.getString("CustName"));
			cust.setAddress(rs.getString("Address"));
			cust.setEmail(rs.getString("email"));
			cust.setPassword(rs.getString("password"));
		}
		else {
			System.out.println("No Record found.....");
		}
		ps.close();rs.close();
		ConnectionUtility.closeconnection(null, null);
		return cust;
	}

	@Override
	public int createCustomer(Customer cm) throws Exception {
		try {
			ps=con.prepareStatement("insert into employee(username,password,Address,email,Flag) values (?,?,?,?,?)");
			ps.setString(1, cm.getCustName());
			ps.setString(2,cm.getPassword());
			ps.setString(3, cm.getAddress());
			ps.setString(4,cm.getEmail());
			ps.setInt(5, cm.getFlag());
			int i=ps.executeUpdate();
			return i;
		}
		catch(SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}
	@Override
	public int updateFlag(int flag,String cname) throws Exception {
		try {
			ps=con.prepareStatement("update employee set flag=? where username=?");			
			ps.setInt(1, flag);
			ps.setString(2, cname);
			int i=ps.executeUpdate();
			return i;
		}catch(Exception e) {
			try{ps.close();rs.close();
			}
			catch(Exception ee) {}
			ConnectionUtility.closeconnection(e, null);
			return 0;
		}
	}

}
