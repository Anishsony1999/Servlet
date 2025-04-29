package session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/session")
public class Sessions extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.print("<form method='post' >");
		out.print("<input name='name' > <br />");
		out.print("<input name='pass' > <br />");
		out.print("<input type='submit' >");
		out.print("</form >");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		
		HttpSession session = request.getSession();
		session.setAttribute("name", name );
		response.sendRedirect("welcome");
		
		
		// 9442016203
		
	}

}
