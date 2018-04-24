package resultsPractice;

public class Results2 {

	public static void main(String[] args) {
		
		Results1 Matt;
		Matt = new Results1();
		Matt.phy = 120;
		Matt.che = 100;
		Matt.math = 20;
		System.out.println("Matt's Results");
		Matt.ShowResults();
		Matt.Grading();
		System.out.println("\n");
		
		Results1 Sam;
		Sam = new Results1();
		Sam.phy = 120;
		Sam.che = 150;
		Sam.math = 130;
		System.out.println("Sam's Results");
		Sam.ShowResults();
		Sam.Grading();

	}

}
