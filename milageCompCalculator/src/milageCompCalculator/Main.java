package milageCompCalculator;
import java.util.Scanner;
public class Main {
		
	public static void main(String args[]) { 	 
		
		
			
			double carMPG;
			double gasPrice;
			double distance;
			double compensation;
			double compensationRate;
			double profit;
			double gallonsUsed;
			double totalCost;
			double tripCostGross;
			double tripCostNet;
			String answer;
			do {
			System.out.println("Enter the MPG of your car:");
			Scanner scnr = new Scanner(System.in);
			carMPG = scnr.nextFloat();
			System.out.println("Enter the price of gas:");
			gasPrice = scnr.nextFloat();
			System.out.println("Enter the driving distance:");
			distance = scnr.nextFloat();
			System.out.println("Enter how much you are paid per mile:");
			compensationRate = scnr.nextFloat();
			
			gallonsUsed = (distance / carMPG);
			tripCostGross = (gallonsUsed * gasPrice);
			compensation = (compensationRate * distance);
			profit = (compensation - tripCostGross);
			
			System.out.println("======================================================================");
			System.out.println("Gallons used to drive this distance (avg): " + gallonsUsed);
			System.out.printf("Cost to drive this distance: $%.2f \n", tripCostGross);
			System.out.printf("Compensation before paying for gas: $%.2f \n ", compensation);
			System.out.printf("Profit from drive: $%.2f \n", profit);
			System.out.println("======================================================================");
			System.out.println("Do you wish to calculate another trip? Y/N");
			answer = scnr.next();
			}
			while (answer.equals("Y"));
			
			
			
		
	}

}
