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

import com.bean.Student;
import com.service.StudentService;

/**
 * Servlet implementation class StudentController
 */
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		StudentService ss = new StudentService();
		List<Student> listOfStudent = ss.getAllStudent();
		HttpSession hs= request.getSession();
		hs.setAttribute("listOfStudent", listOfStudent);
		response.setContentType("text/html");
		response.sendRedirect("viewStudent.jsp");
		
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
	        int age = Integer.parseInt(request.getParameter("age"));
	        int classes = Integer.parseInt(request.getParameter("classes"));
	        
	        Student s = new Student();
	        s.setId(id);
	        s.setName(name);
	        s.setAge(age);
	        s.setClasses(classes);
	        
	        StudentService ss = new StudentService();
	        String result = ss.storeStudentDetails(s);
	        pw.print(result);
	        RequestDispatcher rd = request.getRequestDispatcher("storeStudent.jsp");
	        rd.include(request, response);
		
		//doGet(request, response);
	}

}
