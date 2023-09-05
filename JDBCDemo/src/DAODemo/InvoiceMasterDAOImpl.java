package DAODemo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import DTODemo.InvoiceMaster;

public class InvoiceMasterDAOImpl implements InvoiceMasterDAO{
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	public InvoiceMasterDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public InvoiceMaster findByinvoice_id(int invoiceId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InvoiceMaster findBycustomerId(int customerId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<InvoiceMaster> findByDiscount(int discount) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<InvoiceMaster> findByDate(Date date) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<InvoiceMaster> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int createInvoiceMaster(InvoiceMaster im) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateInvoiceMaster(InvoiceMaster im) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteInvoiceMasterByInvoiceID(int invoiceId) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteInvoiceMasterByCustomerId(int custID) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
