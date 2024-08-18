package controller;

public class SomaDigitos {

	public SomaDigitos() {
		super();
	}
	
	public int somaDigitos(int n) {
		//Condição de parada
		if(n / 10 == 0) {
			return n%10;
		} else {
			return n%10 + somaDigitos(n/10); //Chamada de função
		}
	}

}
