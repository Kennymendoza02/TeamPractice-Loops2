import java.util.Random;
import java.util.Scanner;

public class Lottery {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random generator = new Random();

		System.out.println("Select a range: ");
		System.out.println("Min: ");
		int min = input.nextInt();
		System.out.println("Max: ");
		int max = input.nextInt();

		System.out.println("Select the four winning numbers:");
		System.out.println("Number 1: ");
		int num1 = input.nextInt();
		System.out.println("Number 2: ");
		int num2 = input.nextInt();
		System.out.println("Number 3: ");
		int num3 = input.nextInt();
		System.out.println("Number 4: ");
		int num4 = input.nextInt();

		int counter = 0;
		int dataCount = 0;
		int[] data = new int[4];
		while (data[0] != num1 && data[1] != num2 && data[2] != num3 && data[3] != num4) {
			for (dataCount = 0; dataCount <= 3; dataCount++) {
				int randomNum = min + generator.nextInt(max - min + 1);
				data[dataCount] = randomNum;
			}
			counter++;
			if (data[0] != num1 || data[1] != num2 || data[2] != num3 || data[3] != num4) {
				for (dataCount = 0; dataCount <= 3; dataCount++) {
					data[dataCount] = max+1;
				}
			}
		}
		System.out.println("It took " + counter + " tries to guess the winning lottery numbers.");
		System.out.println(data[0] + ", " + data[1] + ", " + data[2] + ", " + data[3]);
		
	}
}
