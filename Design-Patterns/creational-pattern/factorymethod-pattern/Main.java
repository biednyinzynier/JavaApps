package designpatterns.creatpatterns.factorymethod;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GetPlanFactory planFactory = new GetPlanFactory();
		
		System.out.println("Select the name of plan for which bill will be generated: ");
		String plans = " 1. House Plan\n"
					 + " 2. Commercial Plan\n"
					 + " 3. University Plan";
		System.out.println(plans);
		System.out.print("Your plan: ");
		int planType = scanner.nextInt();
		System.out.print("Enter the number of units for bill will be calculated: ");
		int units = scanner.nextInt();
		
		Plan plan = planFactory.getPlan(planType);
		
		String planName;
		if(planType == 1) {
			planName = "House Plan";
		}
		else if (planType == 2) {
			planName = "Commercial Plan";
		}
		else if (planType == 3) {
			planName = "University Plan";
		}
		else {
			planName = "Error";
		}
		
		System.out.println("Bill amount for " + planName + " of " + units + " units is: ");
		
		plan.getRate();		// getting proper rate for calculateBill method
		plan.calculateBill(units);
		
	}
}
