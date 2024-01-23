package algorithm._03_TwoPointers_SlidingWindow._06_최대_길이_연속부분수열;

import java.util.ArrayList;
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

        System.out.print(main.solution(n, k, arr));


    }

    //rt가 이동하면서 바꾼것 0 -> 1
    //lt는 이동하면서 rt가 바꾼 1 -> 0으로 바꿈
   public int solution(int n, int k, int[] arr) {
        int cnt = 0;
        int answer = 0;
        int lt = 0;

        for(int rt = 0; rt < n; rt++) {
            if(arr[rt] == 0) {
                cnt++;
            }
            while(cnt > k) {
                if(arr[lt] == 0) {
                    cnt--;
                }
                lt++;
            }
            answer = Math.max(answer, rt - lt + 1);
        }
        return answer;
    }
}
