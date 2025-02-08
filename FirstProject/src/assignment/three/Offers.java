package assignment.three;
import java.util.Scanner;
public class Offers {
	static int t;
	static String a;
	static int a1;
	static int c;
	static int d;
	
	static void items(String a, int a1) {
		System.out.println("Price of " + a+ "is :" +a1);
		
		Offers.total();
		
		
	}
	
	static void total() {
		t=a+b+c;
	}
	static void discount() {
		if (t>=5000) {
			d=(t*20)/100;
			
			System.out.println("Discount amount is " + d);
		}
		else {
			System.out.println("Total amount is: " + t);
		}
	}


	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Item");
		a=sc.nextLine();
		System.out.println("Enter the Price");
		a1=sc.nextInt();

		Offers.items(a, a1);

	}

}
