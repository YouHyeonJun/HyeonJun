package 프로그래머스.가운데_글자_가져오기;

/*
문제 설명
단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

재한사항
s는 길이가 1 이상, 100이하인 스트링입니다.

입출력 예
s		return
abcde	c
qwer	we
*/
class Solution {
	public String solution(String s) {

		int i = s.length();

		String answer = s.substring((i - 1) / 2, (i / 2) + 1);

		return answer;
	}
}