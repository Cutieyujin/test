package edu.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public final class LoginServlet extends HttpServlet {

   public String user = "jyj5281";
   public String password = "oracle";
   
   protected void process(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
         response.setContentType("text/html; charset=utf-8");
         
         String id = request.getParameter("id");
         String pwd = request.getParameter("pw");
         
         PrintWriter pw = response.getWriter();
         pw.print("<html><head><title>Login Servlet Test</title></head><body><b><br>");
         if(user.equalsIgnoreCase(id) && password.equalsIgnoreCase(pwd)) {
            pw.println("�ݰ��� <br>");
            pw.println("����� ���̵�� " + id + " �̱���.<br>");
            pw.println("��ȣ�� " + pwd + " �Դϴ�.<br>");
            
         } else if(user.equals(id) && !password.equals(pwd)) {
            pw.println("��ȣ�� Ʋ�Ƚ��ϴ�. <br>");
            pw.println("<a href = 'view/login.html'> Login </a> ");
         } else {
            pw.println("��ϵ��� ���� ������Դϴ�. <br>");
            pw.println("<a href = 'view/Login.html'> Login </a> ");
         }
         
         pw.println("</b></body></html>");
         pw.close();
   }
   
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
   
}