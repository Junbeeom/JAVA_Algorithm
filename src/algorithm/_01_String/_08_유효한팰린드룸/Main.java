package algorithm._01_String._08_유효한팰린드룸;
import java.util.Scanner;

class Main {
    public String solution(String test) {
        String answer = "NO";
        test = test.toUpperCase().replaceAll("[^A-Z]", "");
        String sb = new StringBuilder(test).reverse().toString();

        if(test.equals(sb)) {
            answer = "YES";
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.println(main.solution(sc.nextLine()));
    }
}