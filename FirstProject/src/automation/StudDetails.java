package automation;
import java.util.Scanner;
public class StudDetails {
	String name;   //instance variable
	int age;
	public static void main(String[] args) {
		StudDetails ob1=new StudDetails();
		ob1.detail();
		System.out.println("Details of Student 1");

		ob1.display();

		StudDetails ob2=new StudDetails();
		ob2.detail();

		
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
}
