import java.util.*;

public class Salary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name : ");
		String name = sc.nextLine();
		System.out.print("Enter Employee ID : ");
		double empID = sc.nextInt();
		System.out.print("Enter Basic : ");
		double basic = sc.nextInt();
		System.out.print("Enter Special Allowances : ");
		double specialAllowances = sc.nextInt();
		System.out.print("Enter Percentage Of Bonus : ");
		double bonus = sc.nextInt();
		System.out.print("Enter Percentage Of Monthly Tax Saving Investments : ");
		double monthlyTaxSavingInvestments = sc.nextInt();
		double grossMonthlySalary = basic + specialAllowances;
		double annualNetSalary = (grossMonthlySalary * 12) + bonus;
		bonus = annualNetSalary * bonus / 100;
		double taxPayable = 0;

		if (monthlyTaxSavingInvestments <= 150000) {
			taxPayable = 0;
		}

		if (annualNetSalary >= 1000000)
			taxPayable = annualNetSalary * 0.7;
		else if (annualNetSalary >= 500000 && annualNetSalary < 1000000)
			taxPayable = annualNetSalary * 0.8;
		else if (annualNetSalary >= 250000 && annualNetSalary < 500000)
			taxPayable = annualNetSalary * 0.95;

		annualNetSalary -= taxPayable;
		System.out.println("Annual Gross : " + grossMonthlySalary);
		System.out.println("Annual Net : " + annualNetSalary);
		System.out.println("Tax Payable : " + taxPayable);

	}

}
