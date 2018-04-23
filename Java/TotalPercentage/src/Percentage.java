
public class Percentage {

	public static void main(String[] args) {
		
		int Physics;
		int Chemistry;
		int Maths;
		int total;
		int max;
		float per;
		
		//Total marks for each section being 150
		
		max = 450;
		Physics = 70;
		Chemistry = 80;
		Maths = 90;
		total = Physics + Chemistry + Maths;
		per = ((Physics + Chemistry + Maths) * 100)/max;
	
		
		System.out.println("The total scored by the student is " + total + ".");
		System.out.println("The percentage is " + per + "%.");
		

	}

}
