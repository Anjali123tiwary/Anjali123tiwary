package Com;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class WebInitContextListener
 *
 */
@WebListener
public class WebInitContextListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public WebInitContextListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         System.out.println("context destroyed...");
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
    	try {
         ServletContext application=sce.getServletContext();
         String path=application.getRealPath("/WEB-INF/config.properties");         
         Properties prop=new Properties();
         prop.load(new FileInputStream(path));
         application.setAttribute("prop", prop);
         
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
	
}
