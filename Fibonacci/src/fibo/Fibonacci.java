package fibo;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Anumero = 0;
		int Bnumero = 1;
		
		for (int i = 0; i < 7; i++) {
			System.out.println("O resultado é : " + Anumero);
			Bnumero = Anumero + Bnumero;
			Anumero = Bnumero - Anumero;
					
		}
		
	}

}
