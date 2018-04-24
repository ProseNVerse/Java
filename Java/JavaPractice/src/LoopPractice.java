
public class LoopPractice {

	public static void main(String[] args) {
		int [] num = {10 , 20 , 30 , 40 , 50};
		
		for (int x : num) {
			if (x == 50) {
				break;
			}
			System.out.println(x);
		}

	}

}
