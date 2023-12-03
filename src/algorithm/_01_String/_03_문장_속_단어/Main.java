package algorithm._01_String._03_문장_속_단어;

import java.util.Scanner;

class Main {
    public String solution(String text) {
        String[] word = text.split(" ");
        int max = 0;
        String answer = "";

        for(String x : word) {
            if(max < x.length()) {
                max = x.length();
                answer = x;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        Main main = new Main();
        System.out.println(main.solution(text));
    }
}
