package aula05;

import java.util.Scanner;

public class Fatoriais {

	public static void main(String[] args) {
		int n, x;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número inteiro positivo");
		n = entrada.nextInt();
		
		for(int i = 0; i < n; i++) {
			x = entrada.nextInt();
			int j = 1;
			while(x >= 1) {
				j *= x;
				x--;
			}
			System.out.println(j);
		}

	}

}
