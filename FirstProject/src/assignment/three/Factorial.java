package assignment.three;
import java.util.Scanner;
public class Factorial {
	
	static int num;
	static void fact(int num) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		 num=sc.nextInt();
		int f=1;
		for(int i=1;i<=num;i++) {
			f=f*i;	
		}
		System.out.println("Factorial of " + num + " is " + f);
		
		
	}

	public static void main(String[] args) {
		Factorial.fact(num );
	}

}
