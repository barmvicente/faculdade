package aula05;

public class IgualarNatalidade {

	public static void main(String[] args) {
		int pop_a = 5000;
		int pop_b = 7000;
		double taxa_a = 0.03;
		double taxa_b = 0.02;
		int anos = 0;
		
		while(pop_a < pop_b) {
			pop_a *= (1 + taxa_a);
			pop_b *= (1 + taxa_b);
			anos++ ;
		}
		
		System.out.println(12*anos);
	}

}
