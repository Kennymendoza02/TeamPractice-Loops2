import java.util.Scanner;

public class Honors {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double epsilon = 0.001;
		Scanner input = new Scanner(System.in);
		System.out.println("What is ypur GPA and class?");
		System.out.println("GPA: ");
		double gpa = input.nextDouble();
input.nextLine();
		System.out.println("Class: ");
		String gradeLevel = input.nextLine();
		
		if ((gpa >= 3.5) && gradeLevel.toLowerCase().contains("senior")) {

			System.out.println("You can graduate!");
			
		} else {
			System.out.println("ur mom gay");
		}

	}
}
