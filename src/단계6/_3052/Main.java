package 단계6._3052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> hashSet = new HashSet<Integer>(42);

		for (int i = 0; i < 10; i++) {
			hashSet.add(Integer.parseInt(bufferedReader.readLine()) % 42);
		}
		System.out.println(hashSet.size());
	}
}