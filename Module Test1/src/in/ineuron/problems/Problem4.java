package in.ineuron.problems;

public class Problem4 {

	public static void main(String[] args) {
		int a = 10;
		int b = 30;
		int c = 5;
		
		findLargest(a, b, c);

	}

	public static void findLargest(int a,int b,int c) {
		
		if (a>b)
		{
			if (a>c) 
			{
				System.out.println("a is greatest :"+ a);
			}
			else
			{
				System.out.println("c is greatest :"+c);
			}
			
		}
		else if (b>c)
		{
			if (b>a) 
			{
				System.out.println("b is greatest :"+ b);
			}
		}
		else 
		{
			System.out.println("c is greatest :"+c);
		}
	}

}
