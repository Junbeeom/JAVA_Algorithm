package algorithm._01_String._01_문자찾기;

import java.util.Scanner;
import java.util.*;

class Main {
    public int solution(String text, char search) {
        int cnt = 0;
        for(int i = 0; i < text.length(); i++) {
            if(text.toLowerCase().charAt(i) == Character.toLowerCase(search)) {
                cnt ++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        char search = sc.next().charAt(0);

        Main main = new Main();
        int answer = main.solution(text, search);

        System.out.println(answer);
    }
}


