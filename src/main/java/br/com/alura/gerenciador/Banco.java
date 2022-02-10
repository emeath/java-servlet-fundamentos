package br.com.alura.gerenciador;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<>();
	
	public void adiciona(Empresa empresa) {
		lista.add(empresa);
		System.out.println("Empresa " + empresa.getNome() + " add.");
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}

}
