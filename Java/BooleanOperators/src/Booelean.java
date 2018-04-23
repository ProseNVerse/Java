
public class Booelean {

	public static void main(String[] args) {
		
		int salary;
		float vat;
		
		salary = 4000;
		
		System.out.println("Salary: £" + salary);
		
		if (salary<1000) {
			vat = ((salary * 0) / 100);
			System.out.println("VAT is £" +  vat + " due to salary being under 1000");
			System.out.println("The net salary will be £" +(salary - vat));
		}
		
		else if ((salary >= 1000) & (salary <2000)) {
			vat = ((salary * 10)/100);
			System.out.println("VAT is £" + vat + " due to salary being between 1000 and 2000");
			System.out.println("The net salary will be £" +(salary - vat));
		}
		
		else if ((salary >= 2000) & (salary <3000)) {
			vat = ((salary * 15) /100);
			System.out.println("VAT is £" + vat + " due to salary being between 2000 and 3000");
			System.out.println("The net salary will be £" +(salary - vat));
		}
		
		else if ((salary >=3000) & (salary <4000)) {
			vat = ((salary * 17) / 100);
			System.out.println("VAT is £" + vat + " due to salary being between 3000 and 4000");
			System.out.println("The net salary will be £" +(salary - vat));
		}
		
		else if (salary >=4000) {
			vat = ((salary * 19) / 100);
			System.out.println("VAT is £" + vat + " due to salary being 4000 and above");
			System.out.println("The net salary will be £" +(salary - vat));
			System.out.println("Mind if I get some of that for food?");
		}
		
	}

}
