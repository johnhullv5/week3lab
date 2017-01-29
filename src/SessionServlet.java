
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class BlotServlet
 */
@WebServlet("/BlotServlet")
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SessionServlet() {
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
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
		RequestDispatcher view = request.getRequestDispatcher("index.html");
		// don't add your web-app name to the path

		view.forward(request, response);
//		response.setContentType("text/html;charset=UTF-8");
//		 PrintWriter out = response.getWriter();
//		 
//		
//		 HttpSession session = request.getSession();
//		 Integer accessCount;
//		 synchronized(session) {
//		 accessCount = (Integer)session.getAttribute("accessCount");
//		 if (accessCount == null) {
//		 accessCount = 0;
//		 } else {
//		 accessCount = new Integer(accessCount + 1);
//		 }
//		 session.setAttribute("accessCount", accessCount);
//		 }
//
//		 try {
//		 out.println("<!DOCTYPE html>");
//		 out.println("<html>");
//		 out.println("<head><title>Session Test Servlet</title></head><body>");
//		 out.println("<h2>You have access this site " + accessCount + " times in this session.</h2>");
//		 out.println("<p>(Session ID is " + session.getId() + ")</p>");
//		 out.println("<p>(Session creation time is " + new Date(session.getCreationTime()) + ")</p>");
//		 out.println("<p>(Session last access time is " + new Date(session.getLastAccessedTime()) + ")</p>");
//		 out.println("<p>(Session max inactive interval is " +
//		 session.getMaxInactiveInterval() + " seconds)</p>");
//		 out.println("<p><a href='" + request.getRequestURI() + "'>Refresh</a>");
//		 out.println("<p><a href='" + response.encodeURL(request.getRequestURI()) +
//		 "'>Refresh with URL rewriting</a>");
//		 out.println("</body></html>");
//		 }
//		 finally {
//		 out.close();
//		 }
		 }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
