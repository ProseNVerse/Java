
public class JVPractice1 {

	public static void main(String[] args) {
		
		int a, b, c;
		
		a = 10;
		b = 1;
		c = 1;
		
		while (a <20) {
			System.out.println("value of a: " + a);
			a++;
			}
		System.out.println("\n");
		
		while (a > 0 & a <20) {
			System.out.println(" value of a: " + a);
			a--;
			}
		System.out.println("\n");
		
		for (b = 1; b < 20; b = b + 1) {
			System.out.println("value of b: " + b);
			}
		System.out.println("\n");
		
		for (b = 19; b > 0; b = b - 1) {
			System.out.println("value of b: " + b);
			}
		System.out.println("\n");
		
		do {
			System.out.println("value of c: " + c);
			c++;
			}while(c <20);
		System.out.println("\n");
		
		do {
			System.out.println("value of c: " + c);
			c--;
			}while(c >0);
	}

}
