package 단계3._2742;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(bufferedReader.readLine());

		for (int i = num; i >= 1; i--) {
			bufferedWriter.write(i + "\n");
		}
		bufferedWriter.flush();
		bufferedWriter.close();

	}

}