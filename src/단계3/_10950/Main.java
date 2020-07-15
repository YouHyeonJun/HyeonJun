package 단계3._10950;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int count = Integer.parseInt(bufferedReader.readLine());
		StringTokenizer stringTokenizer;

		for (int i = 0; i < count; i++) {
			stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
			System.out.println(
					Integer.parseInt(stringTokenizer.nextToken()) + Integer.parseInt(stringTokenizer.nextToken()));

		}
	}
}