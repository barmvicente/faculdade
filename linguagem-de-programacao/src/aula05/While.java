package aula05;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		int i = 0;
		int n;
		
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número inteiro");
		n = entrada.nextInt();
		
		i = 0;
		while(i <= 10) {
			System.out.println(i*n);
			i++;
		}

	}

}
