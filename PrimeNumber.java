package assignment;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=7;
		boolean isPrime = true;
		for(int num = 2; num<i/2;num++) {
			if(i%num ==0) {
				isPrime = true;
				break;
				
			}
		}
		if(isPrime) {
			System.out.println( i + "is Prime Number");
		}
		else {
			System.out.println(i + "is not a Prime Number");
			
		}
		
		
	}

}
