package algorithm._02_Array._11_임시반장정하기;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main main = new Main();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n + 1][n + 1];

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int result = main.solution(n, arr);
        System.out.println(result);


    }

    public int solution(int n, int[][] arr) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 1; i <= n; i++) {
            int cnt = 0;
            for(int j = 1; j <= n; j++) {
                for(int k = 1; k <= n; k++) {
                    if(arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt>max) {
                max=cnt;
                answer=i;
            }
        }
        return answer;
    }
}
