package algorithm._01_String._01_문자찾기;

import java.util.Scanner;

class Main {
    public int solution(String Text, char search) {
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Text = sc.nextLine();
        char Search = sc.next().charAt(0);

        Main main = new Main();
        int answer = main.solution(Text, Search);

        System.out.println(answer);
    }
}


