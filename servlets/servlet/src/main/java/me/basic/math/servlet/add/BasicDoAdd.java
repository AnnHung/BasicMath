package me.basic.math.servlet.add;

import java.io.IOException;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import me.ejb.alphaservices.AlphaServicesRemote;

/**
 * Servlet implementation class BasicDoAdd
 */
public class BasicDoAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB(lookup="java:global/ear-1.0/ejbs-1.0/AlphaServices!me.ejb.alphaservices.AlphaServicesRemote")
	private AlphaServicesRemote alphaServicesRemote;
	
    /**
     * Default constructor. 
     */
    public BasicDoAdd() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().append("Result of 1 + 2 = ").append(String.valueOf(alphaServicesRemote.offerSum(1, 2)));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
