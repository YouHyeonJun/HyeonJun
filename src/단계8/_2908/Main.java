package 단계8._2908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(bufferedReader.readLine(), " ");

		int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

		System.out.print(A > B ? A : B);

	}
}