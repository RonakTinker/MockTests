package in.ineuron.problems;

public class Problem3 {

	public static void main(String[] args) {
		int [] ar= {1,2,3,4,5,6,7,8,9};
		printAverage(ar);
	}
	
	public static void printAverage(int []ar) {
		
		int n=ar.length;
		int i=0;
		int sum=0;
		do {
			sum=sum+ar[i];
			i++;
			
		}while(i<n);
		
		System.out.println(sum/n);
	}

}
