package DAODemo;

import java.util.List;
import DTODemo.ItemTransaction;

public interface ItemTransactionDAO {
	public ItemTransaction findByInvoiceId(int invoiceId)throws Exception;
	public ItemTransaction findByItemId(int itemId)throws Exception;
	public List<ItemTransaction> findAll()throws Exception;
	public int createItemTransaction(ItemTransaction it)throws Exception;
	public int updateItemTransaction(ItemTransaction it)throws Exception;
	public int deleteItemTransactionByInvoiceId(int invoiceId)throws Exception;
	public int deleteItemTransactionByItemId(int ItemId)throws Exception;
}
