package base;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.print("<form method='post' >");
		out.print("<input name='name' > <br />");
		out.print("<input type='submit' >");
		out.print("</form >");
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String name = req.getParameter("name");
		
		Cookie cookie = new Cookie("userName",name);
		// cookie.setMaxAge(24 * 7 * 60 * 60);
		response.addCookie(cookie);
		
		out.print("Welcome : "+ name);
		
		out.print("<a href='cook' > click here </a>");
	}


}
