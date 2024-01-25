package algorithm.test.교육과정설계;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner (System.in);
		String need = sc.next();
		String plan = sc.next();
		
		
		System.out.print(main.solution(need, plan));
	}
	
	public String solution(String need, String plan) {
		String answer = "YES";
		
		Queue<Character> q = new LinkedList<>();
		
		for(Character x : need.toCharArray()) {
			q.offer(x);
		}
		
		for(Character x : plan.toCharArray()) {
			if(q.contains(x)) {
				if(x != q.poll()) {
					return "NO";
				}
			}
			
		}
		if(!q.isEmpty() ) {
			return "NO";
		}
		
		

		
			
		return answer;
	}
}
