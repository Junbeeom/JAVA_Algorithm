package algorithm._01_String._02_대소문자변환;

import java.util.*;

class Main {
    public String solution(String Text) {
        String answer = "";

        for(char x : Text.toCharArray()) {
            if(Character.isUpperCase(x)) {
                answer += Character.toLowerCase(x);
            } else {
                answer += Character.toUpperCase(x);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Text = sc.nextLine();

        Main main = new Main();
        System.out.println(main.solution(Text));
    }
}
