package assignment;

public class FibbonaicSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int num =6, first =0, second=1;
	System.out.println("Fibbonacci series for first" + num +"terms are");
	for(int i=1; i<=num; i++) {
		System.out.println(first +",");
		int sum = first +second;
		first=second;
		second= sum;
		
	}
	}

}
