package DAODemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import DTODemo.ItemMaster;

public class ItemMasterDAOImpl implements ItemMasterDAO{
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	public ItemMasterDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ItemMaster findByItemID(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ItemMaster findByItemname(String itemName) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ItemMaster> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int createItemMaster(ItemMaster im) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateItemMaster(ItemMaster im) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteItemMasterByItemID(int id) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteItemMasterByItemName(String itemName) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
