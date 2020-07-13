package 단계2._9498;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int score = Integer.parseInt(bufferedReader.readLine());

		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		if (score >= 90)
			bufferedWriter.write("A");
		else if (score >= 80)
			bufferedWriter.write("B");
		else if (score >= 70)
			bufferedWriter.write("C");
		else if (score >= 60)
			bufferedWriter.write("D");
		else
			bufferedWriter.write("F");

		bufferedWriter.flush();
		bufferedWriter.close();

	}

}
