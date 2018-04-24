
public class No2 {

	public static void main(String[] args) {
		
		int no2 = 400;
		
		
		if (no2 < 1000) {
			System.out.println("1");
			if (no2 >= 500) {
				System.out.println("6");
				if (no2 >= 600) {
					System.out.println("8");
				}else{
					System.out.println("7");
				}
			}else {
				System.out.println("9");
			}
		}if (no2 < 1000) {
			System.out.println("2");
			if (no2 >= 100) {
				System.out.println("4");
			}else {
				System.out.println("3");
			}
		}
		if (no2 >1000) {
			System.out.println("A");
			if (no2 > 5000 & no2 > 1000) {
				System.out.println("B");
				if (no2 > 5000 & no2 < 7000) {
					System.out.println("D");
				}
				if (no2 >=7000) {
					System.out.println("C");
				}
			}else {
				System.out.println("E");
			}
		}

	}

}
