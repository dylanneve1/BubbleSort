// Written by Dylan Neve.

public class BubbleSort {
	
	// Variables needed for algorithm.
	static int currentNum;
	static int nextNum;
	static int biggerNum;
	static int smallerNum;
	
	// Array to sort.
	static int numbers[] = {11, 5, 9, 1};
	
	// Get size for for loop.
	static int size = (numbers.length) - 2;
	
	// Set step value as 1.
	static int step = 1;
	
	// Create boolean for whether or not the arrangement of numbers was changed.
	static boolean swapped = true;
	
	public static void main(String[] args) {
    
		for(int i = 0; i <= size; i++) {
			
			// Set current number and next number values.
			currentNum = numbers[i];
			nextNum = numbers[i+1];
			
			// If arrangement has been changed print step and +1 to step value.
			OutputHandler.printerToConsole(swapped, step, numbers);
			
			// Check whether current or next value is bigger.
			if(currentNum > nextNum) {
				biggerNum = currentNum;
				smallerNum = nextNum;
				swapped = true;
				step += 1;
			} else if(nextNum > currentNum) {
				biggerNum = nextNum;
				smallerNum = currentNum;
				swapped = false;
			}
			
			// Write result to array.
			numbers[i] = smallerNum;
			numbers[i + 1] = biggerNum;
			
			// Loop back if end of array is reached.
			if(i == size) {
				i = -1;
			}
		}
	}
}