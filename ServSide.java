
import javax.servlet.*;
import java.io.*;
import javax.annotation.*;

public class ServSide implements Servlet{
	
	ServletConfig config;
	
	@Override
	public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException{
		
		String u_id=req.getParameter("user_id");
		String ip_add=req.getParameter("ip_add");
		
		
		
		System.out.println("@@@@user logged in\n$$$->user_id:"+u_id+"\t$$$->ip_address:"+ip_add);
		
		
	}
	
	
	@Override
	public void init(ServletConfig conf) throws ServletException{
		
	 config=conf;
	}
	
	@Override
	public void destroy(){
	}
	
	@Override
	public String getServletInfo(){
		
		return "hello";
	}
	@Override
	public ServletConfig getServletConfig(){
		
		return config;
		
		
	
	
}
}