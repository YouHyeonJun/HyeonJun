package algorithmSorce;

import java.util.Arrays;

public class FindingInArray {
	public String findingInArray(String[] seoul) {
		
		String answer = "김서방은 %d에 있다";
		
		/*
		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				return String.format(answer, i);
			}	
		}
		return "김서방은 없다";
		*/
		
		return String.format(answer, Arrays.asList(seoul).indexOf("Kim"));
				
	}
}