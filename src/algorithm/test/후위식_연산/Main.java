package algorithm.test.후위식_연산;

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
	
	public int solution(String str) {
		int answer = 0;
		
		Stack<Integer> stack = new Stack<>();
		
		for(char x : str.toCharArray()) {
			if(Character.isDigit(x)) {
				stack.push(x - 48);
			} else {
				int rt = stack.pop();
				int lt = stack.pop();
				if(x == '+' ) {
					stack.push(lt + rt);
				} else if(x == '-') {
					stack.push(lt-rt);
				}  else if(x == '*') {
					stack.push(lt*rt);
				}  else if(x == '/') {
					stack.push(lt/rt);
				}
			}
		}
		
		answer = stack.get(0);
		return answer;
	}

}
