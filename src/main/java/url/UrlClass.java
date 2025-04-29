package url;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/url")
public class UrlClass extends HttpServlet {
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
		
		String email =  request.getParameter("email");
		String pass = request.getParameter("pass");
		
		if(pass.equals("123")) response.sendRedirect("u2?userName="+email);
	}

}
