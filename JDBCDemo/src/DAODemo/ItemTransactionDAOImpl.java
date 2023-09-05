package DAODemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import DTODemo.ItemTransaction;

public class ItemTransactionDAOImpl implements ItemTransactionDAO{
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	public ItemTransactionDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ItemTransaction findByInvoiceId(int invoiceId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ItemTransaction findByItemId(int itemId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ItemTransaction> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int createItemTransaction(ItemTransaction it) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateItemTransaction(ItemTransaction it) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteItemTransactionByInvoiceId(int invoiceId) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteItemTransactionByItemId(int ItemId) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
