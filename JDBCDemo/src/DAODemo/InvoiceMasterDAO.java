package DAODemo;
import java.sql.Date;
import java.util.List;

import DTODemo.InvoiceMaster;
public interface InvoiceMasterDAO {
	public InvoiceMaster findByinvoice_id(int invoiceId)throws Exception;
	public InvoiceMaster findBycustomerId(int customerId)throws Exception;
	public  List<InvoiceMaster>findByDiscount(int discount)throws Exception;
	public List<InvoiceMaster> findByDate(Date date)throws Exception;
	public List<InvoiceMaster> findAll()throws Exception;
	public int createInvoiceMaster(InvoiceMaster im)throws Exception;
	public int updateInvoiceMaster(InvoiceMaster im)throws Exception;
	public int deleteInvoiceMasterByInvoiceID(int invoiceId)throws Exception;
	public int deleteInvoiceMasterByCustomerId(int custID)throws Exception;
}
