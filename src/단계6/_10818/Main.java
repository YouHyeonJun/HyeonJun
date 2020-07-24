package 단계6._10818;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(bufferedReader.readLine());
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

		int max = -1000001;
		int min = 1000001;

		for (int i = 0; i < N; i++) {
			int val = Integer.parseInt(stringTokenizer.nextToken());

			if (val > max) {
				max = val;
			}
			if (val < min) {
				min = val;
			}

		}

		System.out.println(min + " " + max);
	}
}