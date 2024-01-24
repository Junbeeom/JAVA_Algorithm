package algorithm._02_Array._07_점수계산;

import java.util.Scanner;

class Main {
    public static int solution(int n, int[] arr) {
        int answer = 0;
        int cnt = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] == 1) {
                cnt++;
            } else {
                cnt = 0;
            }
            answer += cnt;
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, arr));
    }

}
