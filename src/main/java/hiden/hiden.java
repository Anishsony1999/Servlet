package hiden;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/hiden")
public class hiden extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.print("<form method='post' >");
		out.print("<input name='email' > <br />");
		out.print("<input name='pass' > <br />");
		out.print("<input type='submit' >");
		out.print("</form >");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		if (pass.equals("123")){
			
			out.print("<h2> Welcome Admin </h2>");
			
			out.print("<form action='send' method='post' >");
			out.print("<input type='hidden' name='user' value="+ email + "> <br />");
			out.print("<input type='submit' value='to next Page' >");
			out.print("</form >");	
		}else {
			out.print("<h2> Your not admin </h2>");
		}
		
		
		
		
		
	}

}
