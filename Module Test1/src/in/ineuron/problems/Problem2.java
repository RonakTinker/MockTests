package in.ineuron.problems;

public class Problem2 {

	public static void main(String[] args) {
		int n=3;
		printFibonacci(n);

	}
	public static void printFibonacci(int n) {
		int elem1=0;
		int elem2=1;
		
		if(n==1) {
			System.out.println(elem1);
		}
		if(n==2) {
			System.out.println(elem1);
			System.out.println(elem2);
		}
		
		if(n>2) {
			System.out.println(elem1);
			System.out.println(elem2);
			for(int i=3;i<=n;i++) {
				System.out.println(elem1+elem2);
				
				int temp=elem1;
				elem1=elem2;
				elem2=elem2+temp;
			}
		}
		
	}

}
