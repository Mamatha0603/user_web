package Test;

public class FindSum {
	
	public static int sum(int n,int a,int b) {
		int sumNumber=0;
		for(int i=0;i<n;i++) 
			if(i%a==0||i%b==0) {
				System.out.println("i value;"+i);
				System.out.println("sum:"+sumNumber);
				sumNumber+=i;
			}
		
		
		return sumNumber;
	}

	public static void main(String[] args) {
		System.out.println(FindSum.sum(10, 3, 5));
		System.out.println(FindSum.sum(20, 5, 4));
		
	}

}
