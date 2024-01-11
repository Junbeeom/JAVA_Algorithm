package algorithm._02_Array._02_보이는학생;

import java.util.Scanner;

public class Main {
    public int solution(int[] arr) {
        int cnt = 0;
        int max = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Main main = new Main();
        int solution = main.solution(arr);

        System.out.print(solution);
    }
}
