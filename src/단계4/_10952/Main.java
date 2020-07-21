package 단계4._10952;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder stringBuilder = new StringBuilder();

		while (true) {

			String str = bufferedReader.readLine();

			int A = str.charAt(0) - 48;
			int B = str.charAt(2) - 48;

			if (A == 0 && B == 0) {
				break;
			}
			stringBuilder.append((A + B)).append('\n');
		}
		System.out.println(stringBuilder);
	}
}
