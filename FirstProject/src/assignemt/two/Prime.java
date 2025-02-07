package assignemt.two;
import java.util.Scanner;
public class Prime {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		for(int i=2;i<=num;i++)	{	
			if (num%i==0) {
				int b[]=new int[2];
                int l=b.length;
                if (l==0){
                	
				
			System.out.println("The number " + num + "is prime");
			}
		
		else
			System.out.println("The number " + num + "is not prime");

	}

}
}
}