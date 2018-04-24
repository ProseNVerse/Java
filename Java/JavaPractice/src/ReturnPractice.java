
public class ReturnPractice {

	public static void main(String[] args) {
	int no = 1000;
	
if (no == 200 | no == 500 | no == 1000) {
		System.out.println("We had not planned for this...");
	}else {
		if (no > 500) {
		System.out.println("A");
			if (no > 1000) {
			System.out.println("B");
			}else {
			System.out.println("C");
		}
		}else {
		System.out.println("D");
			if (no > 200) {
			System.out.println("F");
		}
			else {
			System.out.println("E");
		}
	
	}
	}
}
}
