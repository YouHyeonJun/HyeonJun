package 단계5._5543;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int burger = 2001;
		int drink = 2001;

		for (int i = 0; i < 3; i++) {
			int choice = Integer.parseInt(bufferedReader.readLine());

			if (choice < burger) {
				burger = choice;
			}
		}

		for (int i = 0; i < 2; i++) {
			int choice = Integer.parseInt(bufferedReader.readLine());

			if (choice < drink) {
				drink = choice;
			}
		}

		System.out.println(burger + drink - 50);
	}
}