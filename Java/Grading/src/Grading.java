
public class Grading {

	public static void main(String[] args) {
		
		int Physics, Chem, Maths;
		float per;
		int max = 300;
		int total;
		
		
		Physics = 80;
		Chem = 70;
		Maths = 60;
		total = Physics + Chem + Maths;
		per = (((Physics + Chem + Maths)*100)/300);
		
		System.out.println("Student scored " + Physics + " in Physics, " + Chem + " in Chemistry, and " + Maths + " in Mathematics. This gives them a total score of: " + total
				+ " out of " + (max));
		System.out.println("The percentage scored was: " + per + "%");
		
		
		if (per >= 90) {
			System.out.println("The student receives an A");
		}
		else if ((per >= 80) & (per <90)) {
			System.out.println("The student receives a B");
		}
		else if ((per >= 70) & (per <80)) {
			System.out.println("The student receives a C");
		}
		else if (per < 70) {
			System.out.println("The student receives a Fail");
		
		}
		
		
		}
	}





