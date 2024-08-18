package view;

import controller.SomaDigitos;

public class Principal {

	public static void main(String[] args) {
		SomaDigitos soma = new SomaDigitos();
		int n = 40028922;
		int resultado = soma.somaDigitos(n);
		System.out.println(resultado);
		
	}

}
