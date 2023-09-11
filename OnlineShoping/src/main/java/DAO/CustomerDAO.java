package DAO;

import java.util.List;

import DTO.Customer;

public interface CustomerDAO {
	public Customer findBycustName(String cname)throws Exception;
	public int createCustomer(Customer cm)throws Exception;
	public int updateFlag(int flag,String cname ) throws Exception;

	
}
