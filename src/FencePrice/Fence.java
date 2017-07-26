package FencePrice;

import java.util.Scanner;

public class Fence {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Initialize variables 
		String option = null; Double perimeter = 0.0; 
		int GateCounts = 1; Double FinalPrice = 0.0;
		
		//Prompt User for the Perimeter in feet
		System.out.println("Perimeter of the yard in feet:");
		Scanner scan1 = new Scanner(System.in);
		perimeter= scan1.nextDouble();
		
		
		//Prompt User for the choice of fence, if not w and not c, repeat prompt and get 
		System.out.println("Choice of Fence (w/c)? w represents Wooden fencing; c represents Chain-link fencing");
		Scanner scan2 = new Scanner(System.in);
		option = scan2.nextLine();
		
		while(!option.equalsIgnoreCase("w")&&!option.equalsIgnoreCase("c")) {
			System.out.println("The input should be w/c, try again:");	
			Scanner scan3 = new Scanner(System.in);
			option = scan3.nextLine();
		}	
		
		//Prompt User for the number of doors, if not 1, not 2, not 3, repeat prompt and get
		System.out.println("Number of Gates intended to install (choose between 1-3):");
		Scanner scan4 = new Scanner(System.in);
		GateCounts = scan4.nextInt();
		
		while(GateCounts!=1&&GateCounts!=2&&GateCounts!=3) {
			System.out.println("You should have at least one Gate, but no more than 3, try again:");	
			Scanner scan5 = new Scanner(System.in);
			GateCounts = scan5.nextInt();
		}			
		
		//Calculate the price based on two scenarios
		if(option.equalsIgnoreCase("w")){
		    FinalPrice = (perimeter *  25 + GateCounts * 150) * 1.06 + 50;
		}
		
		if(option.equalsIgnoreCase("c")){
		    FinalPrice = (perimeter *  15 + GateCounts * 150) * 1.06 + 50;
		}
		
		System.out.println("The total Cost is: " + FinalPrice);
	
		
	}

}
