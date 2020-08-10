package 단계8._1316;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

	static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		int count = 0;
		int N = Integer.parseInt(bufferedReader.readLine());

		for (int i = 0; i < N; i++) {
			if (check()) {
				count++;
			}
		}
		System.out.print(count);
	}

	public static boolean check() throws IOException {
		boolean[] check = new boolean[26];
		int prev = 0;
		String str = bufferedReader.readLine();

		for (int i = 0; i < str.length(); i++) {
			int now = str.charAt(i);

			if (prev != now) {
				if (!check[now - 'a']) {
					check[now - 'a'] = true;
					prev = now;
				} else {
					return false;
				}
			}
		}
		return true;
	}
}
