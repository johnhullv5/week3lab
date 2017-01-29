
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String userID = "centennial";
	String password = "12345";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String user = request.getParameter("username");
		String pass = request.getParameter("password");
		
		System.out.println(request.getContextPath().toString());
		
//		response.sendRedirect("/index.html");
		 //RequestDispatcher view = request.getRequestDispatcher("/Login.html");
	        // don't add your web-app name to the path

	       // view.forward(request, response); 
		
		//RequestDispatcher rd = getServletContext().getRequestDispatcher("/index.html");
//		PrintWriter out = response.getWriter();
//		out.println("Invalid user name or password");
//		rd.include(request, response);
		

		if (userID.equals(user) && password.equals(pass)) {
			Cookie loginCookie = new Cookie("user", user);
			loginCookie.setMaxAge(30 * 60);
			response.addCookie(loginCookie);
			response.sendRedirect("DirectServlet");
		} else {
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/Login.html");
			//PrintWriter out = response.getWriter();
			//out.println("Invalid user name or password");
			rd.include(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		 doGet(request, response);
//		String user = request.getParameter("username");
//		String pass = request.getParameter("password");
//
//		if (userID.equals(user) && password.equals(pass)) {
//			Cookie loginCookie = new Cookie("user", user);
//			loginCookie.setMaxAge(30 * 60);
//			response.addCookie(loginCookie);
//			response.sendRedirect("DirectServlet");
//		} else {
//			RequestDispatcher rd = getServletContext().getRequestDispatcher("/Login.html");
//			PrintWriter out = response.getWriter();
//			out.println("Invalid user name or password");
//			rd.include(request, response);
//		}
	}

}
