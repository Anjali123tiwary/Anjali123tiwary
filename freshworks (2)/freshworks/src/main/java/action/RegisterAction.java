package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CustomerDAO;
import dao.CustomerDAOImpl;
import dao.CustomerDTO;

public class RegisterAction extends Action{
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String uname=request.getParameter("uname");
		String upass=request.getParameter("upass");
		CustomerDAO cdao=new CustomerDAOImpl();
		CustomerDTO dto=new CustomerDTO();
		dto.setCust_name(uname);
		dto.setCust_pwd(upass);
		dto.setFlag(0);
		int i=cdao.insertCustomer(dto);
		if(i==1) {
			return "register.sucess";
		}
		else {
			return "register.fail";
		}
	}
}
