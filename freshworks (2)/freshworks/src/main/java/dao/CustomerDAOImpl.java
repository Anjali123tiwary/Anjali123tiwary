package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import control.ConnectionUtility;
import service.CustomerServiceImpl;

public class CustomerDAOImpl implements CustomerDAO,Cloneable{
	
	public static void main(String[] args) {
		
		
		CustomerDAO cdao=new CustomerDAOImpl();
		CustomerDTO dto=new CustomerDTO();
		dto.setCust_id(100);
		dto.setCust_name("somu");
		dto.setCust_pwd("secret");
		dto.setFlag(1);
		cdao.updateCustomer(dto);
//		dto=cdao.findByID(100);
//		System.out.println(dto);
//		List<CustomerDTO> list=cdao.findAll();
//		list.stream().forEach(System.out::println);
//		cdao.deleteCustomer(dto);
		
		
	}
	public CustomerDAOImpl() {
//		ConnectionUtility.url="jdbc:mysql://localhost:3306/vastpro";
//		ConnectionUtility.username="root";
//		ConnectionUtility.password="root";
		System.out.println("customers dao impl object created...");
	}
	
	private static CustomerDAOImpl cs;
	
	synchronized public static CustomerDAOImpl getServiceImpl() {
		if(cs==null) {
			cs=new CustomerDAOImpl();
			return cs;
		}
		else {
			return cs.createClone();
		}
	}
	private CustomerDAOImpl createClone() {
		try {
			return (CustomerDAOImpl)super.clone();
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public CustomerDTO findByID(int uid) {
		PreparedStatement ps;
		try {
			Connection con=ConnectionUtility.getConnection();
			ps=con.prepareStatement("select * from customers where cust_id=?");
			ps.setInt(1, uid);
			ResultSet rs=ps.executeQuery();
			CustomerDTO dto=new CustomerDTO();
			if(rs.next()) {
				dto.setCust_id(rs.getInt(1));
				dto.setCust_name(rs.getString(2));
				dto.setCust_pwd(rs.getString(3));
				dto.setFlag(rs.getInt(4));
			}
			ConnectionUtility.closeConnection(null, null);
			return dto;			
		}catch(Exception e) {
			ConnectionUtility.closeConnection(e, null);
			return null;
		}
	}

	@Override
	public List<CustomerDTO> findAll() {
		PreparedStatement ps;
		try {
			Connection con=ConnectionUtility.getConnection();
			ps=con.prepareStatement("select * from customers");
			
			ResultSet rs=ps.executeQuery();
			List<CustomerDTO> list=new ArrayList<CustomerDTO>();
			while(rs.next()) {
				CustomerDTO dto=new CustomerDTO();
				dto.setCust_id(rs.getInt(1));
				dto.setCust_name(rs.getString(2));
				dto.setCust_pwd(rs.getString(3));
				dto.setFlag(rs.getInt(4));
				list.add(dto);
			}
			ConnectionUtility.closeConnection(null, null);
			return list;			
		}catch(Exception e) {
			ConnectionUtility.closeConnection(e, null);
			return null;
		}
	}

	@Override
	public CustomerDTO findByName(String customerName) {
		PreparedStatement ps;
		try {
			Connection con=ConnectionUtility.getConnection();
			ps=con.prepareStatement("select * from customers where cust_name=?");
			ps.setString(1, customerName);
			ResultSet rs=ps.executeQuery();
			CustomerDTO dto=new CustomerDTO();
			if(rs.next()) {
				dto.setCust_id(rs.getInt(1));
				dto.setCust_name(rs.getString(2));
				dto.setCust_pwd(rs.getString(3));
				dto.setFlag(rs.getInt(4));
			}
			else {
				return null;
			}
			ConnectionUtility.closeConnection(null, null);
			return dto;			
		}catch(Exception e) {
			ConnectionUtility.closeConnection(e, null);
			return null;
		}
		
	}

	@Override
	public int insertCustomer(CustomerDTO dto) {
		PreparedStatement ps;
		try {
			Connection con=ConnectionUtility.getConnection();
			ps=con.prepareStatement("insert into customers values (?,?,?,?)");
			ps.setInt(1, dto.getCust_id());
			ps.setString(2, dto.getCust_name());
			ps.setString(3, dto.getCust_pwd());
			ps.setInt(4, dto.getFlag());
			ps.executeUpdate();
			ConnectionUtility.closeConnection(null, null);
		}catch(Exception e) {
			ConnectionUtility.closeConnection(e, null);
			return 0;
		}
		return 1;
	}

	@Override
	public int updateCustomer(CustomerDTO dto) {
		PreparedStatement ps;
		try {
			Connection con=ConnectionUtility.getConnection();
			ps=con.prepareStatement("select * from customers where cust_id=?");
			ps.setInt(1, dto.getCust_id());
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				ps=con.prepareStatement("update customers set cust_name=?, cust_pwd=?, flag=? where cust_id=?");
				ps.setString(1, dto.getCust_name());
				ps.setString(2, dto.getCust_pwd());
				ps.setInt(3, dto.getFlag());
				ps.setInt(4, dto.getCust_id());
				ps.executeUpdate();
			}
			else {
				System.out.println("no record found to update....");
			}
			ConnectionUtility.closeConnection(null, null);
		}catch(Exception e) {
			ConnectionUtility.closeConnection(e, null);
			return 0;
		}
		return 1;
		
	}

	@Override
	public int deleteCustomer(CustomerDTO dto) {
		PreparedStatement ps;
		try {
			Connection con=ConnectionUtility.getConnection();
			ps=con.prepareStatement("delete from customers where cust_id=?");
			ps.setInt(1, dto.getCust_id());
			ps.executeUpdate();
			ConnectionUtility.closeConnection(null, null);
		}catch(Exception e) {
			ConnectionUtility.closeConnection(e, null);
			return 0;
		}
		return 1;
		
	}

}
