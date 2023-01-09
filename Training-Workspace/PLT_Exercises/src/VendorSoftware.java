import java.util.*;

public class VendorSoftware {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Resource Billing Rate : ");
		double resourceBillingRate = sc.nextDouble();
		System.out.print("Enter The Time Contributed : ");
		double timeContributed = sc.nextDouble();
		System.out.print("Enter The Hardware Input Rate : ");
		double hardwareInputCosts = sc.nextDouble();
		System.out.print("Enter The Selling Cost : ");
		double sellingCost = sc.nextDouble();
		System.out.print("Enter The Selling Cost Of Vendor : ");
		double sellingCostVendor = sc.nextDouble();
		System.out.print("Enter The External Consultant Cost : ");
		double externalConsultantCost = sc.nextDouble();

		boolean hardwareInputUsed = false;
		boolean frequency = false;
		boolean externalConsultancyUsed = false;
		double profit;
		double loss;

		double costPrice = resourceBillingRate * timeContributed;

		if (hardwareInputUsed) {
			hardwareInputCosts = 0.7 * hardwareInputCosts;
			costPrice = costPrice + hardwareInputCosts;
		}
		if (frequency) {
			sellingCost = 0.5 * sellingCost;
			costPrice = costPrice + sellingCost;
		} else {
			sellingCost = 0.0;
			costPrice = costPrice + sellingCost;
		}

		if (externalConsultancyUsed) {
			externalConsultantCost = resourceBillingRate * timeContributed;
			costPrice = costPrice + externalConsultantCost;
		}

		if (frequency) {
			sellingCostVendor = 0.5 * sellingCostVendor;
		}

		double sellingPrice = (resourceBillingRate * timeContributed) + (0.3 * hardwareInputCosts) + sellingCostVendor;

		if (sellingPrice > costPrice) {
			profit = sellingPrice - costPrice;
			System.out.println("Profit : " + profit);
		} else {
			loss = costPrice - sellingPrice;
			System.out.println("Loss : " + loss);
		}

	}

}
