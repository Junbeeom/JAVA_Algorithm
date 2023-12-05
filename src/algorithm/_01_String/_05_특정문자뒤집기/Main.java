package algorithm._01_String._05_특정문자뒤집기;

import java.util.Scanner;

class Main {
	public String solution(String text) {
		String answer = "";
		char[] ch = text.toCharArray();
		int lt = 0;
		int rt = text.length() - 1;
		char tmp = ' ';
		
		while(lt<rt) {
			if(!Character.isAlphabetic(ch[lt])) {
				lt ++;
			} else if(!Character.isAlphabetic(ch[rt])) {
				rt --;
			} else {
				tmp = ch[lt];
				ch[lt] = ch[rt];
				ch[rt] = tmp;
				lt ++;
				rt --;
			}
		}
		answer = String.valueOf(ch);
		return answer;

	}

	public static void main(String[] args) {
		Main main = new Main();
		
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		System.out.print(main.solution(text));
	}

}
