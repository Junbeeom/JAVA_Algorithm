package algorithm._01_String._06_중복문자제거;

import java.util.Scanner;

class Main {
    public String solution(String text) {
        String answer = "";

        for(int i = 0; i < text.length(); i++) {
            if(text.indexOf(text.charAt(i)) == i) {
                answer += text.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        Main main = new Main();
        System.out.println(main.solution(text));
    }
}
