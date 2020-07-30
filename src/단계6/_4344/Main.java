package 단계6._4344;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int C = Integer.parseInt(bufferedReader.readLine());

		for (int i = 0; i < C; i++) {

			StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

			int N = Integer.parseInt(stringTokenizer.nextToken());
			int arr[] = new int[N];
			int sum = 0;
			int count = 0;

			for (int j = 0; j < N; j++) {
				int value = Integer.parseInt(stringTokenizer.nextToken());
				arr[j] = value;
				sum += value;
			}

			sum = sum / N;

			for (int j = 0; j < N; j++) {
				if (arr[j] > sum) {
					count++;
				}
			}

			double var = (double) count / N;
			System.out.printf("%.3f%%\n", var * 100.0);
		}

	}
}