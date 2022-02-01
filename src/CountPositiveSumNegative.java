import java.util.ArrayList;

public class CountPositiveSumNegative {

	 public static int[] countPositivesSumNegatives(int[] input){
	   
	    
	    int count = 0;//a variable count that will hold the value of the number of positives
	    int sum = 0;//a variable sum that will hold the value of the sum of negatives
	    
	if(input == null || input.length == 0) {//if the array is null or empty then
		return new int[] {};//return an empty array
	}else {
		for(int a : input) {//go through the array
			if (a > 0) {//if the value that we are at is a positive number
				count++;//increment the value of count by 1
			}else if(a < 0){//if its a negative number
				sum = sum + a;// sum is whatever it held before plus the value of the negative element we are at
			}
		}
	}
	
	int [] result = new int [] {count, sum};//result will hold the sum and the count 
	        return result;  //return an array with count of positives and sum of negatives
	    }
	
	public static void main(String[] args) {
		int [] arr = {1,4, 7, -9,-9, -8, 5, 34};
System.out.println(countPositivesSumNegatives(arr));//test
	}

}
