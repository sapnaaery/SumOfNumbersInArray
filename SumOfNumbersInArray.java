package day7;

public class SumOfNumbersInArray {

	public static void main(String[] args) {
		// Program to get sum of numbers in array
		int numbers[]= {12, 2, 67, 3, 54, 42};
		
		int sum=0;
		for(int i=0; i<numbers.length; i++)
		{
			sum = sum+numbers[i];
		}
		System.out.println("Sum of all numbers in an array is: "+sum);

	}

}
