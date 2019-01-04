package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlets.DefaultServlet;

public class FrontServlet extends DefaultServlet 
{
	private static final long serialVersionUID = 1L;

    public FrontServlet() 
    {
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().append("\n Also here is a random number :" + (Math.random() * 100));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
