package 단계2._14681;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(bufferedReader.readLine());
		int y = Integer.parseInt(bufferedReader.readLine());

		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		if (x > 0) {
			if (y > 0) {
				bufferedWriter.write("1");
			} else {
				bufferedWriter.write("4");
			}
		} else {
			if (y > 0) {
				bufferedWriter.write("2");
			} else {
				bufferedWriter.write("3");
			}
		}

		bufferedWriter.flush();
		bufferedWriter.close();
	}
}
