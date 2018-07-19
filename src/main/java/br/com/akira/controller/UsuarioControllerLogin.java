package br.com.akira.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.akira.dao.UsuarioDAO;
import br.com.akira.entidade.Usuario;

public class UsuarioControllerLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UsuarioControllerLogin() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// finalliza a sessao ao sair
		HttpSession session = request.getSession();
		if (session != null) {
			session.invalidate();
		}
		response.sendRedirect("login.jsp");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String login = request.getParameter("login");
		String senha = request.getParameter("senha");

		UsuarioDAO dao = new UsuarioDAO();
		Usuario usuAutenticado = dao.autentica(login, senha);

		// Usuario nulo retorna para a pagina de login
		if (usuAutenticado == null) {
			request.getRequestDispatcher("usuarioErro.jsp").forward(request, response);
		} else {
			//Cria a Session
			HttpSession session = request.getSession();

			// seta o obj logado
			session.setAttribute("usuAutenticado", usuAutenticado);

			// redireciona para o Servlet com a lista de Usuario
			response.sendRedirect("usuController");
		}
	}

}
