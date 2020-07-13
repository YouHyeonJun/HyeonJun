package 단계2._2753;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int year = Integer.parseInt(bufferedReader.readLine());

		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		if (year % 4 == 0) {
			if (year % 400 == 0)
				bufferedWriter.write("1");
			else if (year % 100 == 0)
				bufferedWriter.write("0");
			else
				bufferedWriter.write("1");
		} else
			bufferedWriter.write("0");

		bufferedWriter.flush();
		bufferedWriter.close();

	}
}