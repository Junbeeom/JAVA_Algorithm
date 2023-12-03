package algorithm._01_String._04_단어뒤집기;

import java.util.Scanner;

class Main {
    public void solution(String[] words) {
        for(String x : words) {
            System.out.println(new StringBuilder(x).reverse());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String[] words = new String[number];

        for(int i = 0; i < number; i++) {
            words[i] = sc.next();
        }

        Main main = new Main();
        main.solution(words);
    }
}
