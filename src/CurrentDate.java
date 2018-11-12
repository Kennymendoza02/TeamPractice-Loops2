import java.util.Scanner;

public class CurrentDate {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please list the current year ####, month ##, and day ##.");
		int year=input.nextInt();
		int month=input.nextInt();
		int day=input.nextInt();
		System.out.println("it is "+month+" / "+day+" / "+ year);
	}

}
