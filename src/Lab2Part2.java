import java.util.Scanner;

public class Lab2Part2 {

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double sharePrice,  Number_of_shares, Purchase_price, Sale_price, commissionTotal, Purchase_commission; 
		double Sale_commission, net_Price;
		

		//user input to get values
		System.out.print("Shares: ");
		Number_of_shares = input.nextDouble();
		
		System.out.print("Purchase Price: $");
		Purchase_price = input.nextDouble();
		
		System.out.print("Purchase Commission: ");
		Purchase_commission = input.nextDouble();
		
		System.out.print("Sale Price: $");
		Sale_price = input.nextDouble();
		
		System.out.print("Sale commission: ");
		Sale_commission = input.nextDouble();
		
		//close scanner
		input.close();
		
		//formulae
		sharePrice = (Number_of_shares * Purchase_price ) - (Number_of_shares * Sale_price);
		commissionTotal = (Number_of_shares * Purchase_price * Purchase_commission )+ (Number_of_shares * Sale_price * Sale_commission );
		net_Price = commissionTotal + sharePrice;
		

		
		if(net_Price > 0) {
			System.out.print("Net loss of $" + net_Price);
		}else {
			System.out.print("Net gain of $" + net_Price);
		}
	}
}
