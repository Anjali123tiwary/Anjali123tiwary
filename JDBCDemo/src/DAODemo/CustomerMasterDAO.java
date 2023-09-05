package DAODemo;
import java.util.List;
import DTODemo.CustomerMaster;
public interface CustomerMasterDAO {
	public CustomerMaster findBycustomerId(int cid)throws Exception;
	public CustomerMaster findBycustName(String cname)throws Exception;
	public List<CustomerMaster> findAll()throws Exception;
	public int createCustomerMaster(CustomerMaster cm)throws Exception;
	public int updateCustomerMaster(CustomerMaster cm)throws Exception;
	public int deleteBycustomerId(int cid)throws Exception;
	public int deleteBycustName(String custName)throws Exception;
}
