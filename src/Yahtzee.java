import java.util.Random;

public class Yahtzee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		int[] data = new int[5];
		int counter = 0;
		int num = 0;
		int min = 1;
		int max = 6;
		int pos = 0;
		for(counter = 1; ((data[0] == 0) || (data[0] != data[1] && data[1] != data[2] && data[2] != data[3] && data[3] != data[4])); counter++) {
			for (pos = 0; pos <= 4; pos++) {
				int randomNum = min + generator.nextInt(max - min + 1);
				data[pos] = randomNum;
			}
			if (data[0] != data[1] || data[1] != data[2] || data[2] != data[3] || data[3] != data[4]) {
				for (pos = 0; pos <= 4; pos++) {
					data[pos] = 0;
				}
			}
		}
		System.out.println(counter);

	}

}
