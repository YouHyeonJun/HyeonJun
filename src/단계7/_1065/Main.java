package 단계7._1065;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print(arithmetic_sequence(Integer.parseInt(br.readLine())));

	}

	public static int arithmetic_sequence(int num) {
		int count = 0;

		if (num < 100) {
			return num;
		}

		else {
			count = 99;
			
			if (num == 1000) {
				num = 999;
			}

			for (int i = 100; i <= num; i++) {
				int hun = i / 100;
				int ten = (i / 10) % 10; 
				int one = i % 10;

				if ((hun - ten) == (ten - one)) {
					count++;
				}
			}
		}

		return count;
	}

}