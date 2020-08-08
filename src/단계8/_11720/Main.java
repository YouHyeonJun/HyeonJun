package 단계8._11720;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		bufferedReader.readLine();

		int sum = 0;

		for (byte value : bufferedReader.readLine().getBytes()) {
			sum += (value - '0');
		}

		System.out.print(sum);

	}
}