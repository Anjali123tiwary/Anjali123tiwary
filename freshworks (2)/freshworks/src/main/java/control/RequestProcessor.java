package control;

import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import action.Action;

public class RequestProcessor {
	public void process(HttpServletRequest request,HttpServletResponse response) {
		try {
		HttpSession session=request.getSession();
		session.setMaxInactiveInterval(60);
		ServletContext ctx=request.getServletContext();
		Properties prop=(Properties)ctx.getAttribute("prop");
		String formid=request.getParameter("formid");
		String actionclass=prop.getProperty(formid);
		Action action=(Action)Class.forName(actionclass).getConstructor().newInstance();
		
		String result=action.execute(request, response);
		
		String nextpage=prop.getProperty(result);
		
		RequestDispatcher rd=request.getRequestDispatcher(nextpage);
		rd.forward(request, response);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
