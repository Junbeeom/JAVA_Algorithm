package algorithm._01_String._12_암호;

import java.util.Scanner;

class Main {
    public String solution(int x, String test) {
        String answer = "";

        for(int i = 0; i < x; i++) {
            String tmp = test.substring(0, 7).replace('#','1').replace('*', '0');
            char ch = (char) Integer.parseInt(tmp,2);
            answer += String.valueOf(ch);
            test = test.substring(7);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        String solution = main.solution(sc.nextInt(), sc.next());

        System.out.println(solution);
    }
}
