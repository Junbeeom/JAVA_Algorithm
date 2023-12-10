package algorithm._01_String._07_회문문자열;

import java.util.Scanner;

class Main {
    public String solution(String test) {
        int i = 0;
        int end = test.length() - 1;
        char[] ch = test.toLowerCase().toCharArray();

        while (i < end) {
            char lt = ch[i];
            char rt = ch[end - i];

            if(lt != rt) {
                return "NO";
            }
            i++;
        }

        return "YES";
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.println(main.solution(sc.next()));
    }
}
