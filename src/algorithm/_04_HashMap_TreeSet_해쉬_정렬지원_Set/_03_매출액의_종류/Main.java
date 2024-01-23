package algorithm._04_HashMap_TreeSet_해쉬_정렬지원_Set._03_매출액의_종류;

import java.util.ArrayList;
import java.util.HashMap;
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

        ArrayList<Object> solution = main.solution(n, k, arr);
        for (Object x : solution) {
            System.out.print(x + " ");
        }


    }
    // k-1바퀴를 돌면서 먼저 셋팅 해놓고, rt가 돌면서 lt가 따라돈다.
    public ArrayList<Object> solution(int n, int k, int[] arr) {
        int rt = 0;
        int cnt = 0;
        ArrayList<Object> answer = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();

        //k-1까지 연속.. 미리 세팅..
        for(int i = 0; i < k - 1; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }

        //rt를 이용하여 창문 만들기
        int lt = 0;
        for(rt = k - 1; rt < n; rt++) {
            hm.put(arr[rt], hm.getOrDefault(arr[rt], 0) + 1);
            answer.add(hm.size());

            hm.put(arr[lt], hm.get(arr[lt]) - 1);
            if(hm.get(arr[lt]) == 0) {
                hm.remove(arr[lt]);
            }
            lt++;
        }

        return answer;




    }
}
