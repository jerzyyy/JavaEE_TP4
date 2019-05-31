package dev.sgp.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class EditerCollaborateurController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		String  matriculeParam = req.getParameter("matricule");
		
		if(matriculeParam== null ) {
			resp.setContentType("text/html");
			resp.sendError(400, "Un matricule est attendu");
		}else {
			resp.setStatus(200);
			resp.setContentType("text/html");
			resp.getWriter().write("code="+matriculeParam);
		}
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		String matriculeParam = req.getParameter("matricule");
		String titreParam =req.getParameter("titre");
		String nomParam = req.getParameter("nom");
		String prenomParam = req.getParameter("prenom");
		
		if(matriculeParam == null || titreParam==null || nomParam==null || prenomParam==null) {
			resp.setContentType("text/html");
			String error = "Les paramètres suivants sont incorrects : ";
			if(matriculeParam==null){
				error += " matricule,";	
			}
			if(titreParam == null) {
				error+=" titre,";
			}
			if(nomParam == null) {
				error+=" name,";
			}
			if(prenomParam == null) {
				error+=" prénom";
			}
			resp.sendError(400, error) ;
		}else {
			resp.setContentType("text/html");
			resp.setStatus(201);
			resp.getWriter().write("Creation d’un collaborateur avec les informations suivantes : matricule= "+ matriculeParam +"titre= "+ titreParam + "nom = "+ nomParam + "prenom = " + prenomParam);
		}
	}
}
