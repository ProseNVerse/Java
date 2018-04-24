package resultsPractice;

public class Results1 {
	int phy, che, math;

	public void ShowResults() {
		int Tot;
		float Per;
		Tot = phy + che + math;
		Per = (float) ((Tot * 100)/450);
		System.out.println("Total: " + Tot);
		System.out.println("Percentage: " + Per);
	}
	
	public void Grading() {
		int Tot;
		float Per;
		Tot = phy + che + math;
		Per = (float) ((Tot * 100)/450);
		if (Per >= 90) {
			System.out.println("A");
		}else if (Per < 90 & Per >= 80) {
			System.out.println("B");
		}else if (Per < 80 & Per >= 70) {
			System.out.println("C");
		}else if (Per < 70 & Per >= 60) {
		System.out.println("D");
		}else {
			System.out.println("Failed");
		}
	}
}
