package algorithm._01_String._11_문자열압축;

import java.util.Scanner;

class Main {
    public String solution(String test) {

        test = test + " ";
        String answer = "";
        int cnt = 1;

        for(int i = 0; i < test.length() - 1; i++) {
            if(test.charAt(i) == test.charAt(i + 1)) {
                cnt++;
            } else {
                answer += test.charAt(i);
                if(cnt > 1) {
                    answer += cnt;
                }
                cnt = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        String solution = main.solution(sc.next());

        System.out.println(solution);
    }
}
