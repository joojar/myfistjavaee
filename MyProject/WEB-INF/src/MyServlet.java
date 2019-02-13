import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest req,HttpServletResponse rep) throws IOException
	{
		PrintWriter output=rep.getWriter();
		
		String name=req.getParameter("urName");
		
		
		output.println("Your name is"+name);
		
		
	}

}
