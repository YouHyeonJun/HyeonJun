package 단계3._15552;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(bufferedReader.readLine());

		StringTokenizer stringTokenizer;
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		for (int i = 0; i < T; i++) {
			stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
			bufferedWriter.write(Integer.parseInt(stringTokenizer.nextToken())
					+ Integer.parseInt(stringTokenizer.nextToken()) + "\n");
		}

		bufferedWriter.flush();
		bufferedWriter.close();

	}

}