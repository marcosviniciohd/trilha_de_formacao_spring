package br.com.alura.gerenciador.servlet.model;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<Empresa>();
	
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("Alura");
		
		Empresa empresa1 = new Empresa();
		empresa1.setNome("Caelum");
		
		lista.add(empresa);
		lista.add(empresa1);
	}
	
	public void adiciona(Empresa empresa) {
		Banco.lista.add(empresa);
	}
	
	public List<Empresa>  getEmpresas(){
		return Banco.lista;
	}

}
