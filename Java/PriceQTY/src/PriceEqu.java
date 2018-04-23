
public class PriceEqu {

	public static void main(String[] args) {
		
		
		int qty;
		float price;
		
		qty = 15;
		price = 1.75F;
		
		
		System.out.println("Product 7 Up");
		System.out.println("Quantity: " + qty);
		System.out.println("Unit Price: " + price);
		System.out.println("Total amount: " +  (qty * price));
		System.out.println("VAT: " + ((qty * price)*15)/100);
		System.out.println("---------------------");
		System.out.println("Net Amount: " + ((qty * price) + ((qty*price)*15)/100));
		System.out.println("Net Amount: (the wrong way) " + ((qty * price) - ((qty*price)*15)/100));

	}

}
