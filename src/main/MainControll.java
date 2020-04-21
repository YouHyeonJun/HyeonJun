package main;

import algorithmSorce.FindingInArray;
import algorithmSorce.NumberSum;

public class MainControll {
	public static void main(String[] args) {
		

		String[] seoul = {"you", "park", "su", "Kim", "gu"};
		FindingInArray fia = new FindingInArray();
		System.out.println(fia.findingInArray(seoul));
		
		int number = 123;
		NumberSum ns = new NumberSum();
		System.out.println(ns.numberSum(number));
		
	}
}
