
public class No2 {

	public static void main(String[] args) {
		
		int no2 = 7951;
		
		if (no2 < 1000) {
			System.out.println("not high enough");
		}
		else if (no2 >1000) {
			System.out.println("A");
			if (no2 > 5000 & no2 > 1000) {
				System.out.println("B");
				if (no2 > 5000 & no2 < 7000) {
					System.out.println("C");
				}if (no2 >=7000) {
					System.out.println("D");
				}
			}else {
				System.out.println("E");
			}
		}

	}

}
