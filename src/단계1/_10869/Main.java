package 단계1._10869;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String[] str = bufferedReader.readLine().split(" ");
		int A = Integer.parseInt(str[0]);
		int B = Integer.parseInt(str[1]);

		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		bufferedWriter.write((A + B) + "\n");
		bufferedWriter.write((A - B) + "\n");
		bufferedWriter.write((A * B) + "\n");
		bufferedWriter.write((A / B) + "\n");
		bufferedWriter.write((A % B) + "\n");

		bufferedWriter.flush();
		bufferedWriter.close();

	}

}