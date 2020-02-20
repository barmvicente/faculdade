package aula05;

public class CalculaMontante {

	public static void main(String[] args) {
		double p = 1000;
		double r = 0.05;
		
		for(int i = 1; i <= 10; i++) {
			p *= (1 + r);
			System.out.println(p);
		}

	}

}
