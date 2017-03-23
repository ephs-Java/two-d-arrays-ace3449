import java.util.Random;

public class TwoDArrayBasics {

	public static void main(String[] args) {
		// Create a 3 x 5 array of ints
		
		int [][] nums = new int[3][5];
		int [] summer = new int [nums.length];
		int [] array = {1, 2, 3, 4, 4};
		
		// Fill the array with random numbers using fillRandom
		
		fillRandom(nums, 10, 20);
		printArray(nums);
		
		int row1 = 0;
		int row2 = 1;
		int row3 = 2;
		
		summer = sumOfRowArray(nums);
		
		System.out.println();
		System.out.println("The sum of row " + (row1 + 1) + " = " + summer[row1]);
		System.out.println("The sum of row " + (row2 + 1) + " = " + summer[row2]);
		System.out.println("The sum of row " + (row3 + 1) + " = " + summer[row3]);
		
		System.out.println();
		System.out.println(areRepeats(array));
		
		System.out.println();
		System.out.println("The maximum value is " + minValue(nums));
		System.out.println("The minimum value is " + maxValue(nums));
		
		
		
		// test each method you create below.

	}
	/*
	 * given the lower and upper bounds of the random numbers
	 * fill an array of random numbers 
	 */
	
	public static void fillRandom(int[][] nums, int lowBound, int highBound) {
		Random random = new Random();
		
		for(int row = 0; row < nums.length; row++) {
			for(int column = 0; column < nums[0].length; column++) {
				nums[row][column] = random.nextInt(highBound) + lowBound;
			}
		}
	}
	
	/*
	 * create a method that prints a 2D array
	 */
	
	public static void printArray(int[][] nums) {
		for(int row = 0; row < nums.length; row++) {
			
			for(int column = 0; column < nums[0].length; column++) {
				System.out.print(nums[row][column] + " ");
			}
			
			System.out.println(" ");
		}
	}
	
	
	
	/*
	 * return the sum of a row (r) in a 2D array (nums)
	 */
	
	public static int sumOfRow(int[][] nums, int row) {
		int adder = 0;
		for(int column = 0; column < nums[0].length; column++) {
			adder += nums[row][column];
		}
		
		return adder;
	}
	

	
	/*
	 * return an array of row sums of a 2D array (nums)
	 */
	
	public static int[] sumOfRowArray(int[][] nums) {
		int [] sumArray = new int [nums.length];
		for(int row = 0; row < nums.length; row++) {
			sumArray[row] = sumOfRow(nums, row);
		}
		return sumArray;
	}
	

	
	
	/*
	 * check an 1D array for repeats, return true if all 
	 * elements of the array are unique
	 */
	
	public static boolean areRepeats(int[] nums) {
		int counter = 0;
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums.length; j++) {
				if(nums[j] == nums[i]) {
					counter++;
				}
			}
			
			if(counter >= 2) {
				return true;
			} else {
				counter = 0;
			}
			
		}
		
		return false;
		
		
	}
	
	
	/*
	 * given an array
	 * return the index of the target value, 
	 * return -1 if it is not found
	 */
	
	public static int indexOfTarget(int[][] nums, int target) {
		int index = -1;
		
		for(int row = 0; row < nums.length; row++) {
			for(int column = 0; column < nums[0].length; column++) {
				if(nums[row][column] == target) {
					return row;
				}
			}
		}
		
		return index;
	}
	

	
	
	/*
	 * return the min value in a 2D array
	 */
	
	public static int minValue(int[][] nums) {
		int min = nums[0][0];
		
		for(int row = 0; row < nums.length; row++) {
			for(int column = 0; column < nums[0].length; column++) {
				if(nums[row][column] < min) {
					min = nums[row][column];
				}
			}
		}
		
		return min;
		
	}
	

	
	
	
	/*
	 * return the max value in a 2D array
	 */
	
	public static int maxValue(int[][] nums) {
		int max = nums[0][0];
		
		for(int row = 0; row < nums.length; row++) {
			for(int column = 0; column < nums[0].length; column++) {
				if(nums[row][column] > max) {
					max = nums[row][column];
				}
			}
		}
		
		return max;
		
	}
	
	
	
}
