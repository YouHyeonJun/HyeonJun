package 단계1._2588;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(bufferedReader.readLine());
		int b = Integer.parseInt(bufferedReader.readLine());

		bufferedReader.close();

		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		bufferedWriter.write(a * (b % 10) + "\n");
		bufferedWriter.write(a * ((b % 100) / 10) + "\n");
		bufferedWriter.write(a * (b / 100) + "\n");
		bufferedWriter.write(a * b + "\n");

		bufferedWriter.flush();
		bufferedWriter.close();

	}
}
