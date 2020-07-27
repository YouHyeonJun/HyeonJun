package 단계6._1546;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(bufferedReader.readLine()); // 입력 개수

		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

		int max = -1;
		double sum = 0.0;

		for (int i = 0; i < N; i++) {
			int value = Integer.parseInt(stringTokenizer.nextToken());

			if (value > max) {
				max = value;
			}

			sum += value;
		}

		System.out.println(((sum / max) * 100.0) / N);

	}
}