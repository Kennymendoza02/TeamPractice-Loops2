import java.util.Scanner;

public class AverageSongLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of the song in minutes and seconds.");
		System.out.println("Minutes: ");
		int minutes = input.nextInt();
		System.out.println("Seconds: ");
		int seconds = input.nextInt();
		
		System.out.println("Enter the total number of songs on the device.");
		int songs = input.nextInt();
		
		int totalS = (minutes * 60) + seconds;
		int avgSec = totalS / songs;
		int remainderSec = avgSec % 60;
		int avgM = (avgSec - remainderSec) / 60;
		
		System.out.println("The average song length is " + avgM + " minutes and " + remainderSec + " seconds.");
	}
	
}
