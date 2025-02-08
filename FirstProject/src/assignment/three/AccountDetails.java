package assignment.three;

import java.util.Scanner;

public class AccountDetails {
	static int balanceamount=10000;
	static int w;
	static int d;
	static int b;
	
	static void balance(int w) {
		
		
		if(w<b) {
			
			System.out.println("The amount "+ w +" has been withdrawed ");
			System.out.println("Available Balance: "+ (b-w)) ;

			
		}
		else {
			System.out.println("Limit exceeded");	}
		
	}
	static void deposit() {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Amount to be deposited");
		int d=sc.nextInt();
		System.out.println("The amount "+ d +" has been deposited in your account");
		b=balanceamount+d;
		System.out.println("Available Balance is: "+ b);

		
	}
	static void withdraw() {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Amount to withdraw");
		w=sc.nextInt();
		AccountDetails.balance(w);

	}

	public static void main(String[] args) {
		AccountDetails.deposit();
		AccountDetails.withdraw();
		

	}

}
