package algorithm._02_Array._10_봉우리;

import java.util.Scanner;

public class Main {
    int[] dX = {-1, 0, 1, 0};
    int[] dY = {0, 1, 0, -1};

    public static void main(String[] ars) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(main.solution(n, arr));
    }

    public int solution(int n, int[][] arr) {
        int answer = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                boolean flag = true;
                for(int k = 0; k < 4; k++) {
                    int nX = i + dX[k];
                    int nY = j + dY[k];
                    if(nX >= 0 && nX < n && nY >= 0 && nY < n && arr[nX][nY] >= arr[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if(flag) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
