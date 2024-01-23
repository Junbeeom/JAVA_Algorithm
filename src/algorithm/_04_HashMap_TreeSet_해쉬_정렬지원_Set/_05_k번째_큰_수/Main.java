package algorithm._04_HashMap_TreeSet_해쉬_정렬지원_Set._05_k번째_큰_수;

import java.util.*;

class Main {
    public static void main(String[] agrs) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        main.solution(n, k, arr);
    }

    public int solution(int n, int k, int[] arr) {
        int answer = -1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                for(int l = j + 1; l < n; l++) {
                    Tset.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        int cnt = 0;
        for(int x : Tset) {
            cnt++;
            if(cnt == k) {
                return x;
            }
        }



        return answer;
    }
}
