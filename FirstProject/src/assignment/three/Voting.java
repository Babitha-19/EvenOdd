package assignment.three;
import java.util.Scanner;
public class Voting {
	static int age;

	static void vote(int age) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Candidate's Age");
		int num=sc.nextInt();
		
		if(num>=18) {
			
			System.out.println("The candidate is eligible for voting");
			return;
		
		}
		else
			System.out.println("The candidate is not eligible for voting");
	}
	public static void main(String[] args) {
		Voting.vote(age);
	

	}

}
