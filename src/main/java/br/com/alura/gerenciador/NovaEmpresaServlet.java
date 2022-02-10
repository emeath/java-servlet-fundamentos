package br.com.alura.gerenciador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	
	// This method accepts POST and GET HTTP methods
	/*
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando nova empresa...");
		PrintWriter out = response.getWriter();
		
		String nomeEmpresa = request.getParameter("nome");
		
		out.println("<html><body>Empresa " + nomeEmpresa + " cadastrada com sucesso!</body></html>");
		System.out.println("Empresa " + nomeEmpresa + " cadastrada com sucesso...");
	}
	*/
	
	/*
	// Esse metodo trabalha apenas com metodo GET
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando nova empresa, porém aceitando apenas requisições GET...");
		
		PrintWriter out = response.getWriter();
		
		String nomeEmpresaGet = request.getParameter("nome");
		
		out.println("<html><body>Empresa " + nomeEmpresaGet + " cadastrada com sucesso!</body></html>");
		
		System.out.println("[GET] Empresa " + nomeEmpresaGet + " cadastrada com sucesso...");
	}
	*/
	
	// Esse metodo trabalha apenas com metodo POST
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			System.out.println("Cadastrando nova empresa, porém aceitando apenas requisições POST...");
			
			PrintWriter out = response.getWriter();
			
			String nomeEmpresaPost = request.getParameter("nome");
			Empresa empresa = new Empresa();
			empresa.setNome(nomeEmpresaPost);
			
			Banco banco = new Banco();
			banco.adiciona(empresa);
			
			out.println("<html><body>Empresa " + nomeEmpresaPost + " cadastrada com sucesso!</body></html>");
			
			System.out.println("[POST] Empresa " + nomeEmpresaPost + " cadastrada com sucesso...");
		}	

}
