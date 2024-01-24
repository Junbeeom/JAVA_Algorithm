package algorithm._03_TwoPointers_SlidingWindow._05_연속된_자연수의_합;

import java.util.Scanner;

class Main {
    public static void main(String[] agrs) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int solution = main.solution(n);
        System.out.println(solution);
    }

    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        int lt = 0;
        int[] arr = new int[n/2 + 1];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        for(int rt = 0; rt < arr.length; rt++) {
            sum += arr[rt];
            if(sum == n) {
                answer++;
            }
            while(sum >= n) {
                sum -= arr[lt++];
                if(sum == n) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
