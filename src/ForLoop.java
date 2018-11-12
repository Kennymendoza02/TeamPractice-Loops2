import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3 digit positive integer");
		int number = input.nextInt();
		int evennum = 0;
		int sum = 0;
		for (int counter = number; counter <= 1000; counter++) {
			if (counter % 2 == 0) {
				evennum = counter;
				sum = sum + evennum;
			}

		}
		System.out.println(sum);
	}

}
