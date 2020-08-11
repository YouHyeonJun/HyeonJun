package 단계1._10430;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
		int A = Integer.parseInt(stringTokenizer.nextToken());
		int B = Integer.parseInt(stringTokenizer.nextToken());
		int C = Integer.parseInt(stringTokenizer.nextToken());

		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		bufferedWriter.write(((A + B) % C) + "\n");
		bufferedWriter.write(((A % C + B % C) % C) + "\n");
		bufferedWriter.write(((A * B) % C) + "\n");
		bufferedWriter.write(((A % C * B % C) % C) + "\n");

		bufferedWriter.flush();
		bufferedWriter.close();

	}
}