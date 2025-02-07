package assignemt.two;
public class EvenOdd {
	public static void main(String[] args) {

		
		
		int odd=0;
		int even=0;
			for(int i=10;i<=20;i++) {
				
				if(i%2==0)
				{
					
					even=even+1;
				}
				else
					odd=odd+1;
			}

			System.out.println("Even numbers 10 and 20 is="+ even);
			System.out.println("Odd numbers 10 and 20 is="+ odd);

		}
		
	

}
