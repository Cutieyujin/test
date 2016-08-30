package day40_web;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//@WebServlet("/")
@WebServlet(name="DateServlet", urlPatterns="/hello")
public class DateServlet extends HttpServlet { // HttpServlet 클래스 상속 받아야함.

   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
      process(request, response);
   }

   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
      process(request, response);
   }

   private void process(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
      System.out.println("Hello Servlet");
      PrintWriter out = response.getWriter();
      out.write("<html><head><title>Servlet Test</title></head>");
      out.write("<body><h1><font color = 'blue'> Hello Servlet</font></h1></body></html>");
   }
}