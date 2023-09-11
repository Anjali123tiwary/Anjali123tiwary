package Action;

import java.util.Locale;
import java.util.ResourceBundle;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Lang extends Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String language=request.getParameter("language");
		ResourceBundle rb=ResourceBundle.getBundle("dictionary",new Locale(language));
		ServletContext application=request.getServletContext();
		application.setAttribute("rb", rb);
		return "lang.success";
	}

}
