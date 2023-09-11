package service;

public interface CustomerService {
	public boolean checkUser(String uname,String pwd);
	public int updateFlag(int flag,String cust_name);
	public boolean checkFlag(String uname);
}
