package 단계8._2675;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(bufferedReader.readLine());

		for (int i = 0; i < T; i++) {

			String[] str = bufferedReader.readLine().split(" ");

			int R = Integer.parseInt(str[0]);

			for (byte val : str[1].getBytes()) {
				for (int j = 0; j < R; j++) {
					bufferedWriter.write((char) val);
				}
			}
			bufferedWriter.write("\n");
		}
		bufferedWriter.flush();
		bufferedWriter.close();
	}

}