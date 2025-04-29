package base;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/cook")
public class cook extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		Cookie[] cookies = request.getCookies();
		
		String name = null;
		
		for(Cookie cook : cookies) {
			// .getName() return keys
			if("userName".equals(cook.getName())) {
				name = cook.getValue();
			}
		}
		
		
		out.print("<h1> This is cookie Page </h1>");
		out.print("<h1> Welcome : "+ name +" </h1>");
	}


}
