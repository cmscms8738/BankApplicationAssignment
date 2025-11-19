package bankApplication;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		PrintFormat format = new PrintFormat();
		Scanner scan = new Scanner(System.in);
		
	quit:	while(true)
		{
			format.printFormat();
			int choice = Integer.parseInt(scan.nextLine());
			switch(choice) {
			
				case 1:
					format.printAccountCreateFormat();
					break;
				case 2:
					format.printAccountListFormat();
					break;
				case 3:
					format.printDepositFormat();
					break;
				case 4:
					format.printWithdrawalFormat();
					break;
				case 5:
					format.printExit();
					break quit;
			}
			
		}
	}

}
