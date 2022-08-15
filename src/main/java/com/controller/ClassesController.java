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

import com.bean.Classes;
import com.service.ClassesService;



/**
 * Servlet implementation class ClassesController
 */
public class ClassesController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClassesController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ClassesService cs = new ClassesService();
		List<Classes> listOfClasses = cs.getAllClasses();
		HttpSession hs= request.getSession();
		hs.setAttribute("listOfClasses", listOfClasses);
		response.setContentType("text/html");
		response.sendRedirect("viewClasses.jsp");
		
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
	        int section = Integer.parseInt(request.getParameter("section"));
	        int trainer = Integer.parseInt(request.getParameter("trainer"));
	        int subject = Integer.parseInt(request.getParameter("subject"));
	        
	        
	        
	        Classes c = new Classes();
	        c.setId(id);
	        c.setSection(section);
	        c.setTrainer(trainer);
	        c.setSubject(subject);
	        
	        ClassesService cs = new ClassesService();
	        String result = cs.storeClassesDetails(c);
	        pw.print(result);
	        RequestDispatcher rd = request.getRequestDispatcher("storeClasses.jsp");
	        rd.include(request, response);
		
		//doGet(request, response);
	}

}
