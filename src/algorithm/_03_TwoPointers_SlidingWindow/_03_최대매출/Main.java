package algorithm._03_TwoPointers_SlidingWindow._03_최대매출;

import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int solution = main.solution(n, k, arr);
        System.out.println(solution);
    }

    public int solution(int n, int k, int[] arr) {
        int answer = 0;
        int sum = 0;

        for(int i = 0; i < k; i++) {
            sum += arr[i];
            answer = sum;
        }

        for(int i = k; i < n; i++) {
            sum += arr[i] - arr[i - k];
            answer = Math.max(answer, sum);
        }

        return answer;
    }
}
