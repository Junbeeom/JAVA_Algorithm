package algorithm._01_String._09_숫자만추출;
import java.util.Scanner;

class Main {
    public int solution(String test) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < test.length(); i++) {
            if (Character.isDigit(test.charAt(i))) {
                answer = sb.append(test.charAt(i)).toString();
            }
        }


        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.println(main.solution(sc.next()));
    }
}
