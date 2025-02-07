package assignemt.two;
import java.util.Scanner;
public class Reverse {
public static void main(String args[]) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	int num=sc.nextInt();
	String value=Integer.toString(num);
	int l=value.length();
	int rev[]=new int[l];
	for(int i=0;i<l;i++) {
		rev[i]=num%10;
		num=num/10;	
	}
	int reversednumber=0;
	for(int i=0;i<l;i++) {
	reversednumber=reversednumber*10+rev[i];
	}
	
	System.out.println("The reversed number is " + reversednumber);
	
	
	
	
}
}
