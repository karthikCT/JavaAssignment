package week1.day1;

public class Assignment_FibonacciSeries {

	public static void main(String[] args) {
	
	int range = 8, firstNum = 0, secNum = 1, sum;
	
			System.out.println(firstNum);
			
			for (int i = 1; i < range; i++) {
				
			sum = firstNum + secNum;
			secNum = firstNum;
				firstNum = sum;
			
				System.out.println(sum);
			
			}
	}
}
			
	
	


