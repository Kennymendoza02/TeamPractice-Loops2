import java.util.Scanner;

public class LowMan {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your test average: ");
		double testAvg = input.nextDouble();

		System.out.println("Enter your homework average: ");
		double homeworkAvg = input.nextDouble();

		input.nextLine();
		System.out.println("Is your teacher nice?");
		String answer = input.nextLine();

		if ((answer.toLowerCase().contains("yes")) && (testAvg > homeworkAvg)) {
			System.out.println("Your grade is " + testAvg + "%");
		} else if ((answer.toLowerCase().contains("yes") && homeworkAvg > testAvg)) {
			System.out.println("Your grade is " + homeworkAvg + "%");
		} else if ((answer.toLowerCase().contains("no")) && (testAvg > homeworkAvg)) {
			System.out.println("Your grade is " + homeworkAvg + "%");
		} else if ((answer.toLowerCase().contains("no") && homeworkAvg > testAvg)) {
			System.out.println("Your grade is " + testAvg + "%");
		} else {
			System.out.println("Your grade is " + testAvg + "%");
		}

	}
}
