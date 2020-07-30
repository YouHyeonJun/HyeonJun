package 단계6._8958;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		int testNum = Integer.parseInt(bufferedReader.readLine());
		String str[] = new String[testNum];

		for (int i = 0; i < testNum; i++) {

			int count = 0;
			int sum = 0;

			str[i] = bufferedReader.readLine();

			for (int j = 0; j < str[i].length(); j++) {

				if (str[i].charAt(j) == 'O') {
					count++;
				} else {
					count = 0;
				}
				sum += count;
			}

			bufferedWriter.write(sum + "\n");
		}

		bufferedWriter.flush();
		bufferedWriter.close();
	}
}