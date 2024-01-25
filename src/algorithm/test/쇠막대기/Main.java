package algorithm.test.쇠막대기;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
	
		
		int solution = main.solution(str);
		System.out.print(solution);

	}
	
	public int solution(String str ) {
		int answer = 0;
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '(') {
				stack.push('(');
			} else {
				stack.pop();
				if(str.charAt(i - 1) == '(' ) {
					answer += stack.size();
				} else {
					answer++;
				}
			}
		}
		return answer;
		
		
		//1. () 레이저를 만났을때 stack에 들어있는 괄호는 막대기의 개수라고 본다.
		//2. () 괄호가 만났을때 레이저인지, 막대의 끝인지 확인해야 한다.
		
		//1. stack에 넣기
		//2. 바로 앞꺼랑 확인해서, () 레이저, )) 막대기, 레이저를 만나면 잘린 막대 개수 세기
		//3. 막대기의 끝이면 짝꿍까지 같이 pop해준다. + 1을 해줘야함..
	}
// () () (((  )(())()))(())
}
