package 단계6._2577;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		int A = Integer.parseInt(bufferedReader.readLine());
		int B = Integer.parseInt(bufferedReader.readLine());
		int C = Integer.parseInt(bufferedReader.readLine());
		int val = A * B * C;

		int[] arr = new int[10];

		while (val != 0) {
			arr[val % 10]++;
			val /= 10;
		}

		for (int i = 0; i < 10; i++) {
			bufferedWriter.write(arr[i] + "\n");
		}
		bufferedWriter.flush();
		bufferedWriter.close();

	}
}