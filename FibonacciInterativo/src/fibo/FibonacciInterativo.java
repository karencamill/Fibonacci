package fibo;

import java.util.Scanner;

public class FibonacciInterativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o número de termos de sequências: ");
		int termos = teclado.nextInt();
		
		int anterior = 0;
		int atual = 1;
		
			 System.out.println("Sequência de Fibonacci:");
		        for (int i = 0; i < termos; i++) {
		            System.out.print(anterior + " ");
		            int proximo = anterior + atual;
		            anterior = atual;
		            atual = proximo;		
			
		}
			
		
	}

}
