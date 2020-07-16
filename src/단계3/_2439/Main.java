package 단계3._2439;

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
		
		int N = Integer.parseInt(bufferedReader.readLine());
		
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if(j>N-i) {
					bufferedWriter.write("*");
				} else {
					bufferedWriter.write(" ");
				}
				
			}
			bufferedWriter.newLine();
		}
		
		bufferedWriter.flush();
		bufferedWriter.close();
		
	}
}