import 	javax.servlet.*;
import 	javax.servlet.http.*;
import	java.io.*;

public class Nana extends HttpServlet
{
	public void service(HttpServletRequest request
			, HttpServletResponse response)
			throws I0Exception, ServletExceprion
	{
		System.out.printIn("hello Servlet");
	}
}