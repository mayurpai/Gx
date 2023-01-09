import java.util.*;

public class CustomerPurchase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Item Code : ");
		String itemCode = sc.nextLine();
		System.out.print("Enter Item Description : ");
		String itemDescription = sc.nextLine();
		System.out.print("Enter Quantity : ");
		double quantity = sc.nextDouble();
		System.out.print("Enter Item Price : ");
		double itemPrice = sc.nextDouble();
		boolean payByCard = false;
		double grandTotal = 0.0;
		grandTotal = grandTotal + quantity * itemPrice;

		if (grandTotal > 10000)
			grandTotal = grandTotal * 0.9;

		if (grandTotal < 1000 && payByCard)
			grandTotal = grandTotal + (2.5 * grandTotal);

		System.out.println("Item Code : " + itemCode);
		System.out.println("Item Description : " + itemDescription);
		System.out.println("Grand Total : " + grandTotal);

	}

}
