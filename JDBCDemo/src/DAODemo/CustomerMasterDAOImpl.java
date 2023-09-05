package DAODemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import DTODemo.CustomerMaster;

public class CustomerMasterDAOImpl implements CustomerMasterDAO {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	public CustomerMasterDAOImpl(Connection con) {
		super();
		this.con = con;
	}

	@Override
	public CustomerMaster findBycustomerId(int cid) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerMaster findBycustName(String cname) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CustomerMaster> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int createCustomerMaster(CustomerMaster cm) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateCustomerMaster(CustomerMaster cm) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteBycustomerId(int cid) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteBycustName(String custName) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
