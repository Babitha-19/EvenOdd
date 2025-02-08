package assignment.three;

public class NameAge {

			static String name;
			static int age;

			public static void main(String[] args) {

			details("Abhi", 8);
			display();

			}
			static void details(String detail1,int detail2) {
			name= detail1;
			age=detail2;

			}
			static void display() {
			System.out.println(name);
			System.out.println(age);

			}
			
	}


