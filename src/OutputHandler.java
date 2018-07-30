import java.util.Arrays;

public class OutputHandler {
	public static void printerToConsole(boolean swapped, int step, int numbers[]) {
		if(swapped) {
			System.out.println("\nStep : " + step);
			System.out.println(Arrays.toString(numbers));
		}
	}
}
