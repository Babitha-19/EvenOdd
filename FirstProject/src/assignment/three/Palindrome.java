package assignment.three;
import java.util.Scanner;

public class Palindrome {
	static String s;
	static String reversedtext ;
	
	static void reverse() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the word");
		s=sc.nextLine();
		reversedtext="";
		//s=text;
		for(int i=s.length()-1;i>=0;i--){

			reversedtext=reversedtext+s.charAt(i);

		}
	}
		static void display() {
			if(s.equals(reversedtext)) {
				System.out.println(s +"  is a palindrome"); 
			}
				else {
				System.out.println(s +" is not a palindrome");
		}
		}
	public static void main(String[] args) {

		Palindrome.reverse();
		Palindrome.display();		
		}
		
	}


