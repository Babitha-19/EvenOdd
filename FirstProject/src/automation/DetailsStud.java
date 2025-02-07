package automation;
import java.util.Scanner;
public class DetailsStud {
	String name;   //instance variable
	int age;
	public static void main(String[] args) {
		DetailsStud ob1=new DetailsStud();   // constructer call
		//ob1.detail();
		//System.out.println("Details of Student 1");

		ob1.display();

		DetailsStud ob2=new DetailsStud();
		//ob2.detail();

		
		System.out.println("Details of Student 2");
		ob2.display();

		
	}
void detail() {
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Student Name");
	name =sc.nextLine();  // instance variable can be used inside instance methods
	
	
	System.out.println("Enter the age of the Student");
	age=sc.nextInt();
	
}

void display() {
	
	System.out.println("Name  is "+ name ); // instance variable can be used inside instance methods
	System.out.println("Grade  is "+ age );

}
public DetailsStud() {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Student Name");
	name =sc.nextLine();  // constructor initialize value to the instance variables
	
	
	System.out.println("Enter the age of the Student");
	age=sc.nextInt();
	
}
}
