package ServletDemo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet({ "/HelloServlet", "/anjali" ,"*.mat"})
public class HelloServlet extends HttpServlet {
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init method called...");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("do get ....");
		doPost(request,response);
	}
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("do post called....");
		String username=req.getParameter("Entername");
		String password=req.getParameter("Enterpassword");
		System.out.println(username+" "+password);
		ServletOutputStream out=resp.getOutputStream();
		out.println("<h1>"+username+":"+password+"</h1>");
//		resp.sendRedirect("malar.jsp");
		//RequestDispatcher rd=req.getRequestDispatcher("malar.jsp");
		//rd.forward(req, resp);
		}
	@Override
	public void destroy() {
		System.out.println("destroy method called...");
	}
	
}                