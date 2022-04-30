package imprimir;

import negocio.Pessoa;

public class Main {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setCodigo(1);
		p.setNome("Philippe Maia");
		
		System.out.println(p.getCodigo());
		System.out.println(p.getNome());
	}
	
}
