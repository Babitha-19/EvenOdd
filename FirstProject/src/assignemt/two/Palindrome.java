package assignemt.two;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the word");
		String s=sc.nextLine();
		String str="";

		for(int i=s.length()-1;i>=0;i--){

		str=str+s.charAt(i);

		}
		if(s.equals(str))
		System.out.println(s +"is a palindrome"); 
		else
		System.out.println(s +"is not a palindrome"); 


		}
		
	}


