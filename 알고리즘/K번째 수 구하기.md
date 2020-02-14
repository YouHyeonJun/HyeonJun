# Java

```java
class Solution {

	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		int[] copy;
		int temp = 0;

		for (int i = 0; i < commands.length; i++) {
			int cutarray = commands[i][1] - commands[i][0];
			copy = new int[cutarray + 1];

			for (int j = 0; j <= cutarray; j++) {
				copy[j] = array[commands[i][0] - 1 + j];
			}

			for (int z = 0; z < cutarray; z++) {
				for (int k = 0; k < cutarray - z; k++) {
					if (copy[k] > copy[k + 1]) {
						temp = copy[k];
						copy[k] = copy[k + 1];
						copy[k + 1] = temp;
					}
				}
			}

			answer[i] = copy[commands[i][2] - 1];
			System.out.println(answer[i]);
		}
		return answer;
	}
}
