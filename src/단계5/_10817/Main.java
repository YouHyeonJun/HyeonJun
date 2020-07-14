package 단계5._10817;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		String str[] = bufferedReader.readLine().split(" ");
		int arr[] = new int[str.length];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[1]);
		
	}
}