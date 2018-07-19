package br.com.akira.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.akira.dao.UsuarioDAO;
import br.com.akira.entidade.Usuario;

public class UsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UsuarioController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String acao = request.getParameter("acao");
		
//		HttpSession session = request.getSession();
		
		//lista todos caso n�o declare a acao
		if (acao == null) {
			listar(request, response);
//			System.out.println(session.getAttribute("usuAutenticado"));
		}else if (acao.equals("atualiza")) {
			atualiza(request, response);
		}else if (acao.equals("insere")) {
			insere(request, response);
		}else if (acao.equals("exclui")) {
			exclui(request, response);
		}else if(acao.equals("buscaPorNome")) {
			buscaPorNome(request, response);
		}
		
		
	}

	private void buscaPorNome(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nome = request.getParameter("nome");
		
		UsuarioDAO dao = new UsuarioDAO();
		List<Usuario> usuNomeBuscado = dao.buscaPorNome(nome);
		
		request.setAttribute("usuNomeBuscado", usuNomeBuscado);
		request.getRequestDispatcher("WEB-INF/usuarioNomeBuscado.jsp").forward(request, response);
	}

	private void exclui(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		
		UsuarioDAO dao = new UsuarioDAO();
		dao.exclui(Integer.parseInt(id));
		
		//Redireciona para a lista de objs
		response.sendRedirect("usuController");
	}

	//Apenas faz redireciona para a pagina de inserir
	private void insere(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("WEB-INF/usuarioInsere.jsp").forward(request, response);
	}

	//Atualiza
	private void atualiza(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
				
		UsuarioDAO dao = new UsuarioDAO();
		Usuario usuBuscado = dao.buscaPorId(Integer.parseInt(id));
		request.setAttribute("usuBuscado", usuBuscado);
		request.getRequestDispatcher("WEB-INF/usuarioAtualiza.jsp").forward(request, response);
	}

	
	//lista todos os objs na lista
	private void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UsuarioDAO dao = new UsuarioDAO();
		List<Usuario> lista = dao.buscaTodos();

		request.setAttribute("lista", lista);
		request.getRequestDispatcher("WEB-INF/usuarioLista.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//Pega os paramentro da tela 
		String id    = request.getParameter("id");
		String nome  = request.getParameter("nome");
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		String nasc  = request.getParameter("nasc");

		
		//Preenche o usuario
		Usuario u = new Usuario();
		if (id != null)
			u.setId(Integer.parseInt(id));
		u.setNome(nome);
		u.setLogin(login);
		u.setSenha(senha);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date;
		try {
			date = sdf.parse(nasc);
			Calendar cal = Calendar.getInstance();
			cal.setTime(date); 
			u.setNascimento(cal);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		//Insere ou atualiza
		UsuarioDAO dao = new UsuarioDAO();
		dao.salvar(u);
		
		//Ap�s Salvar/Atualizar retorna para lista
		response.sendRedirect("usuController");
	}

}
