package com.parcial2.controler;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.parcial2.DAO.historialDao;
import com.parcial2.DAO.usuarioDao;

import model.TbHistorial;
import model.Usuario;


/**
 * Servlet implementation class servelte
 */
public class servelte extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servelte() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		
		
		String usu = request.getParameter("nombre");
		String contra = request.getParameter("contra");
		String cerrarSeccion = request.getParameter("btncerrar");
		
		if (cerrarSeccion!=null) { 	
			if (cerrarSeccion.equals("CERRAR")) {
				
				HttpSession cerrarSeciones = (HttpSession) request.getSession();
				cerrarSeciones.invalidate();
				
				response.sendRedirect("index.jsp");
				
				
			}
			
		}else {
			
			
		
		
		
		Usuario usuario = new Usuario();
		
		usuarioDao usuDao = new usuarioDao(); 
		
		usuario.setNombre(usu);
		usuario.setContrasenia(contra);
		
		int verificarusuario = usuDao.ingresoUsuario(usuario).size();
		
		if (verificarusuario == 1 ) {
			
			TbHistorial histo = new TbHistorial();
			historialDao histodao = new historialDao();
			Date fecha = new Date();
				
			
		
			
			HttpSession seccion	= request.getSession(true);
			seccion.setAttribute("usuario", usu);
			
			response.sendRedirect("index.jsp"); 
			
		} else {
			
			response.sendRedirect("erroringreso.jsp");

		}
				
	}
	}
	}


