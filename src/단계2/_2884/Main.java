package 단계2._2884;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String[] str = bufferedReader.readLine().split(" ");
		int H = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);

		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		if (M < 45) {
			H--;
			M = M + 60 - 45;

			if (H < 0) {
				H = H + 24;
			}
			bufferedWriter.write(H + " " + M);
		} else {
			bufferedWriter.write(H + " " + (M - 45));
		}

		bufferedWriter.flush();
		bufferedWriter.close();

	}

}