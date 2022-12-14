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

import com.bean.Trainer;
import com.service.TrainerService;

/**
 * Servlet implementation class TrainerController
 */
public class TrainerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TrainerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		TrainerService ts = new TrainerService();
		List<Trainer> listOfTrainer = ts.getAllTrainer();
		HttpSession hs= request.getSession();
		hs.setAttribute("listOfTrainer", listOfTrainer);
		response.setContentType("text/html");
		response.sendRedirect("viewTrainer.jsp");
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
//		int tid = Integer.parseInt(request.getParameter("tid"));
//		String tname = request.getParameter("tname");
//		String tech = request.getParameter("tech");
		
		int id = Integer.parseInt(request.getParameter("id"));
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		int age = Integer.parseInt(request.getParameter("age"));
		
		Trainer t = new Trainer();
		t.setId(id);
		t.setFname(fname);
		t.setLname(lname);
		t.setAge(age);
		
		TrainerService ts = new TrainerService();
		String result = ts.storeTrainer(t);
		pw.print(result);
		RequestDispatcher rd = request.getRequestDispatcher("storeTrainer.jsp");
		rd.include(request, response);
		
		//doGet(request, response);
	}

}
