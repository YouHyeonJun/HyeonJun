package 단계3._10871;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

		int N = Integer.parseInt(stringTokenizer.nextToken());
		int X = Integer.parseInt(stringTokenizer.nextToken());

		StringBuilder stringBuilder = new StringBuilder();

		stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

		for (int i = 0; i < N; i++) {
			int value = Integer.parseInt(stringTokenizer.nextToken());

			if (X > value) {
				stringBuilder.append(value).append(' ');
			}
		}

		System.out.println(stringBuilder);

	}
}