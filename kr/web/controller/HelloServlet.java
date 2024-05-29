package kr.web.controller;

// JavaEE->Servlet(서블릿)의 골격
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import kr.web.util.Myutil;
@WebServlet("/hs.do") // <-web.xml

//http://127.0.0.1:8087/web/[WEB-INF/classed/kr.web.controller.HelloServlet] (mapping 작업)
public class HelloServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse resp) 
													throws ServletException, IOException{
		// 1~100까지의 총합=?
		Myutil my = new Myutil();
		int sum = my.hap();
		
		// 요청한 클라이언트에게 응답하기?
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println(sum);
		out.println("</body>");
		out.println("</html>");
	}
}
