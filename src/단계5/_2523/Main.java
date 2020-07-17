package 단계5._2523;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(bufferedReader.readLine());
		int M = 2 * N - 1;

		for (int i = 0; i < M; i++) {
			if (i < N) {
				for (int j = 0; j <= i; j++) {
					bufferedWriter.write("*");
				}
			} else {
				for (int j = 0; j < M - i; j++) {
					bufferedWriter.write("*");
				}
			}
			bufferedWriter.newLine();
		}
		bufferedWriter.flush();
		bufferedWriter.close();

	}
}