package algorithm._02_Array._12_멘토링;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] arr = new int[y][x];
        for(int i = 0; i < y; i++) {
            for(int j = 0; j < x; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int solution = main.solution(x, y, arr);
        System.out.println(solution);
    }

    public int solution(int x, int y, int[][] arr) {
        int answer = 0;
        int lt = 0;
        int rt = 0;

        //첫번쨰, 두번째 for문은 멘토, 멘티가 될 수 있는 모든경우의 수 ex) 16가지 경우의 수.
        //여기서 x는 학생 수
        for(int i = 1; i <= x; i++) {
            for(int j = 1; j <= x; j++) {
                int cnt = 0;
                //각 학생수의 등수를 비교하기 위한 for문, y는 문제 개수(테스트번호)
                for(int k = 0; k < y; k++) {
                    //학생 a의 등수
                    int pi = 0;
                    //학생 b의 등수
                    int pj = 0;

                    //x는  등수
                    for (int s = 0; s < x; s++) {
                        if (arr[k][s] == i) {
                            pi = s;
                        }
                        if (arr[k][s] == j) {
                            pj = s;
                        }
                    }
                    if (pi < pj) {
                        cnt++;
                    }
                }
                if(cnt==y) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
