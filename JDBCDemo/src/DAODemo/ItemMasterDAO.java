package DAODemo;
import java.util.List;
import DTODemo.ItemMaster;
public interface ItemMasterDAO {
	public ItemMaster findByItemID(int id)throws Exception;
	public ItemMaster findByItemname(String itemName)throws Exception;
	public List<ItemMaster> findAll()throws Exception;
	public int createItemMaster(ItemMaster im)throws Exception;
	public int updateItemMaster(ItemMaster im)throws Exception;
	public int deleteItemMasterByItemID(int id)throws Exception;
	public int deleteItemMasterByItemName(String itemName)throws Exception;
}
