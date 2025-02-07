package automation;

public class Average {

	public static void main(String[] args) {
		Average ob1=new Average();
		ob1.numbers(1, 2, 3);
		ob1.decimals(1.2, 2.3, 3.5);

	}
void numbers(int a, int b, int c) {
	
	int avg=(a+b+c)/3;
	System.out.println("Average of the given integes is "+ avg);

	
}
void decimals(double a, double b, double c) {
	
	double avg=(a+b+c)/3;
	System.out.println("Average of the given integes is "+ avg);

}

}
