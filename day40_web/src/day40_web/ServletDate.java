package day40_web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDate
 */
@WebServlet("/ServletDate")
public class ServletDate extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletDate() {
        super();
     }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		 process(request,response);
	 }

	private void process(HttpServletRequest request, HttpServletResponse response) {

		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		{
			response.setContentType("text/html");
			response.setCharacterEncoding("urf-8");
			
			System.out.println("console mode print");
			Calendar cal=Calendar.getInstance();
			int hour =cal.get(Calendar.HOUR_OF_DAY);
			int minute=cal.get(Calendar.MINUTE);
			int sec=cal.get(Calendar.SECOND);
			
			PrintWriter out=response.getWriter();
			out.write("<html><head><title>Servlet Date </title></head></body>");
			out.write("<h1> 현재 시간은 ");
			out.write(Integer.toString(hour) + "시");
			out.write(Integer.toString(minute)+ "분");
			out.write(Integer.toString(sec)+"초 입니다");
			out.write("</h1></body</html/>");
			out.close();
		}
		doGet(request, response);
	}

}
