package 단계3._11022;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer;
		int A, B;

		int T = Integer.parseInt(bufferedReader.readLine());
		for (int i = 1; i <= T; i++) {
			stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
			A = Integer.parseInt(stringTokenizer.nextToken());
			B = Integer.parseInt(stringTokenizer.nextToken());

			bufferedWriter.write("Case #" + i + ": " + A + " + " + B + " = " + (A + B) + "\n");
		}
		bufferedWriter.flush();
		bufferedWriter.close();
	}
}