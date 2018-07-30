import java.util.Arrays;


public class BubbleSort {
	
	static int currentNum;
	static int nextNum;
	static int biggerNum;
	static int smallerNum;

	static int numbers[] = {11, 5, 9, 1};
	static int size = (numbers.length) - 2;
	static int step = 1;
	
	static boolean swapped = true;
	
	public static void main(String[] args) {
    
		for(int i = 0; i <= size; i++) {
			
			currentNum = numbers[i];
			nextNum = numbers[i+1];
			
			if(swapped == true) {
				System.out.println("\nStep : " + step);
				System.out.println(Arrays.toString(numbers));
			}
			
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
			numbers[i] = smallerNum;
			numbers[i + 1] = biggerNum;
			
			if(i == size) {
				i = -1;
			}
		}
	}
}