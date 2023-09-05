package myservletclientpack;

import java.net.URL;
import java.net.URLConnection;
public class WebClient {
	public static void main(String[] args)throws Exception {
		URL url=new URL("http://localhost:2020/vastpro/anjali.mat");
		URLConnection urlcon=url.openConnection();
		urlcon.getInputStream();
	}
}
