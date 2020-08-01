package 단계7._4673;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		boolean[] check = new boolean[10001];

		for (int i = 1; i < 100001; i++) {
			int n = d(i);

			if (n < 10001) {
				check[n] = true;
			}
		}

		for (int i = 1; i < 10001; i++) {
			if (!check[i]) {
				bufferedWriter.write(i + "\n");
			}
		}
		bufferedWriter.flush();
		bufferedWriter.close();
	}

	public static int d(int number) {
		int sum = number;

		while (number != 0) {
			sum = sum + (number % 10);
			number = number / 10;
		}

		return sum;
	}
}