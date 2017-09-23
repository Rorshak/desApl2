package da2.jmrg.u1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import da2.jmrg.u1.EcuacionU1;

/**
 * Servlet implementation class EcuacionU1Servlet
 */
@WebServlet("/EcuacionU1Servlet")
public class EcuacionU1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EcuacionU1Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int valor1 = Integer.parseInt(request.getParameter("valor1"));
		int valor2 = Integer.parseInt(request.getParameter("valor2"));
		
		EcuacionU1 ecuacion = new EcuacionU1();//creacion de objeto de useBean
		ecuacion.setValor1(valor1);
		ecuacion.setValor2(valor2);
		
		request.setAttribute("ecu", ecuacion); //se lleva el objeto operacion
		RequestDispatcher dispatcher = request.getRequestDispatcher("resultado_final.jsp");
		dispatcher.forward(request, response); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
