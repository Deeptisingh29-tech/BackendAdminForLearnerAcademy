package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.Subject;
import com.service.SubjectService;



/**
 * Servlet implementation class SubjectController
 */
public class SubjectController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubjectController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		SubjectService sbs = new SubjectService();
		List<Subject> listOfSubject = sbs.getAllSubject();
		HttpSession hs= request.getSession();
		hs.setAttribute("listOfSubject", listOfSubject);
		response.setContentType("text/html");
		response.sendRedirect("viewSubject.jsp");
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter pw = response.getWriter();
		 response.setContentType("text/html");
		 
	        int id = Integer.parseInt(request.getParameter("id"));
	        String name = request.getParameter("name");
	        String shortcut = request.getParameter("shortcut");
	        
	        
	        Subject sb = new Subject();
	        sb.setId(id);
	        sb.setName(name);
	        sb.setShortcut(shortcut);
	        
	        SubjectService sbs = new SubjectService();
	        String result = sbs.storeSubjectDetails(sb);
	        pw.print(result);
	        RequestDispatcher rd = request.getRequestDispatcher("storeSubject.jsp");
	        rd.include(request, response);
		
		//doGet(request, response);
	}

}
