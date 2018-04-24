
public class JVPractice1 {

	public static void main(String[] args) {
		
		int a, b, c;
		
		a = 10;
		b = 1;
		c = 1;
		
		while (a <50) {
			System.out.println("value of a: " + a);
			a++;
		}
		for (b = 1; b < 50; b = b + 1) {
			System.out.println("value of b: " + b);
		}
		
		do {
			System.out.println("value of c: " + c);
			c++;
		}while(c <20);
	}

}
