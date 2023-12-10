package algorithm._01_String._10_가장짧은문자거리;
import java.util.Scanner;

class Main {
    public int[] solution(String test, char ch) {
        int[] answer = new int[test.length()];
        int a = 1000;

        for(int i = 0; i < test.length(); i++) {
            if(test.charAt(i) == ch) {
                a = 0;
                answer[i] = a;
            } else {
                a++;
                answer[i] = a;
            }
        }

        a = 1000;
        for(int i = test.length() - 1; i >= 0; i--) {
            if(test.charAt(i) == ch) {
                a = 0;
            } else {
                a++;
                answer[i] = Math.min(answer[i], a);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int[] solution = main.solution(sc.next(), sc.next().charAt(0));

        for(int a : solution) {
            System.out.print(a + " ");
        }
    }
}
