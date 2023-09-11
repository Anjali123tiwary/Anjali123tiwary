package Action;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Com.ConnectionUtility;
import DAO.CustomerDAOImpl;
import DTO.Customer;
public class Login extends Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
	try {
		String username=request.getParameter("username");
		String pass=request.getParameter("password");
		CustomerDAOImpl cdi=new CustomerDAOImpl((ConnectionUtility.getconnection()));
		Customer cust=cdi.findBycustName(username);
		if(username.equals(cust.getCustName())) {
			if(pass.equalsIgnoreCase(cust.getPassword())) {
				if(cust.getFlag()==0) {
					cdi.updateFlag(1,cust.getCustName());
		 			return "login.success";
			}
				else {
					System.out.println("Already log in");
				}
			}
			else {
				System.out.println("Password wrong");
			}
		}
		else{
			return "login.register";
		}
	}
	catch(SQLException e) {
		e.printStackTrace();
		return null;
	}
	return null;
	}
	
}
