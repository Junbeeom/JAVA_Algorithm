package algorithm._03_TwoPointers_SlidingWindow._04_연속_부분수열;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int solution = main.solution(n, m, arr);
        System.out.println(solution);
    }

    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt = 0;
        int sum = 0;
                                //증가하고
        for(int rt = 0; rt < n; rt++) {
            //더하고
            sum += arr[rt];
            //확인(sum은 lt부터 rt의 합.
            if(sum == m) {
                answer++;
            }

            //더했는데 sum이 m 보다 클 경우
            //lt를 빼고 lt를 증가시키면서 따라온다.
            //sum이 m보다 크거나 같으면 계속 빼준다.
            while(sum >= m) {
                sum -= arr[lt++];
                if(sum == m) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
