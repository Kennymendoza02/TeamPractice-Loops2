import java.util.Scanner;

public class DobiasAct {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int choice = 1;
		while (choice <= 6) {
			System.out.println("Please select function: ");
			System.out.println();
			System.out.println("1-Right Triangle Test");
			System.out.println("2-powers");
			System.out.println("3-Square Root");
			System.out.println("4-Round up");
			System.out.println("5-round down");
			System.out.println("6-Quit Calc program");
			choice = input.nextInt();
			if (choice > 6 || choice <= 0) {
				System.out.println();
				System.out.println("That isn't a function, please select valid Number");
				choice = 0;
			}
			while (choice != 0 && choice <= 6) {
				if (choice == 1) {
					System.out.println("Right Triangle program");
					System.out.println();
					System.out.println("Enter length of one leg");
					double leg1 = input.nextInt();
					System.out.println("Enter length of other leg");
					double leg2 = input.nextInt();
					System.out.println("Enter Hypotenus");
					double hyp = input.nextInt();
					double sides = Math.pow(leg1, 2) + Math.pow(leg2, 2);
					double c = Math.pow(hyp, 2);
					if (sides == c) {
						System.out.println("Triange is a right triangle");
					} else {
						System.out.println("Not a right Triangle");
					}
					System.out.println();
					break;
				}
				if (choice == 2) {
					System.out.println("Powers");
					System.out.println("Enter a Number");
					double number7 = input.nextDouble();
					System.out.println("Enter a Power");
					double power = input.nextDouble();
					double solution = Math.pow(number7, power);
					System.out.println("Result: " + solution);
					break;
				}
				if (choice == 3) {
					System.out.println("Square roots");
					System.out.println("Enter a Number");
					double number7 = input.nextDouble();
					double square = Math.sqrt(number7);
					System.out.println("Result: " + square);
					break;
				}
				if (choice == 4) {
					System.out.println("Round up");
					System.out.println("Enter a Number");
					double number7 = input.nextDouble();
					double round = Math.ceil(number7);
					System.out.println("Result: " + round);
					break;
				}
				if (choice == 5) {
					System.out.println("Round down");
					System.out.println("Enter a Number");
					double number7 = input.nextDouble();
					double round = Math.floor(number7);
					System.out.println("Result: " + round);
					break;
				}
				if (choice == 6) {
					System.out.println("Quitting");
					choice = 7;
				}
			}
		}
		System.out.println("Ending Program");
	}
}


