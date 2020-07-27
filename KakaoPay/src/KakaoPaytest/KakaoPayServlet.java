package KakaoPaytest;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.GetData;
import data.InsertData;



/**
 * Servlet implementation class SampleServlet
 */
@WebServlet("/KakaoPayServlet")
public class KakaoPayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		//request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String phoneNum = request.getParameter("phoneNum");
		//response.setContentType("text/html:charset=UTF-8");
		//PrintWriter out = response.getWriter();
		//out.println("<HTML>");
		//out.println("<HEAD><TITLE>:: resultData - POST ::</TITLE><HEAD>");
		//out.println("<BODY>");
		//out.println("Your name is "+ name + ".");
	    //out.println("</BODY>");
	    //out.println("</HTML>");
	    //out.close();
		String couponNum = "";
		int resultCode = 0;
		
	    //쿠폰생성을 위한 테이블 생성
	    try {
	    	InsertData createData = new InsertData();
	    	CreateCoupon getCouponNum = new CreateCoupon();
	    	
	    	couponNum = getCouponNum.getCouponNum();
	    	resultCode = createData.execute(couponNum, name, phoneNum);
	    	
		} catch (ClassNotFoundException e) {
		    response.setContentType("text/html:charset=euc-kr");
			PrintWriter out = response.getWriter();
			out.println(name +"'s coupon number!");
		    out.println(couponNum.substring(0,4)+"-"+couponNum.substring(4,9)+"-"+couponNum.substring(10,18));
			out.close();
		}
	    
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String name = request.getParameter("name");
		String telNo = request.getParameter("phoneNum");
		String[] str = new String[5];
		
		//쿠폰생성을 위한 테이블 생성
	    try {
	    	GetData getInfo = new GetData();
	    	str = getInfo.getData(name, telNo);
	        
	    	
		} catch (ClassNotFoundException e) {
		    response.setContentType("text/html:charset=euc-kr");
			PrintWriter out = response.getWriter();
			
			if(str[0] != null) {
				out.println("COUPON_NUM : "+str[0]);
				out.println("NAME : "+str[1]);
				out.println("TELNO : "+str[2]);
				out.println("CREATE_YM : "+str[3]);
				out.println("CREATE_YM : "+str[4]);
				out.close();
				
			} else {
				out.println("No result!");
				out.close();
			}
			
		}
		
	}

	
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
}
