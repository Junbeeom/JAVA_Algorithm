package algorithm._02_Array._08_등수구하기;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public HashMap ranked(int[] result) {
        Integer[] arr2 = Arrays.stream(result).boxed().toArray(Integer[]::new);
        Arrays.sort(arr2, Collections.reverseOrder());

        HashMap hm = new HashMap();

        for(int i = 0; i < arr2.length; i++) {
            if(!(hm.containsKey(arr2[i]))) {
                hm.put(arr2[i], i + 1);
            }
        }

        return hm;
    }

    public void solution(int n, int[] arr) {
        int[] rankedArr = Arrays.copyOf(arr, arr.length);
        HashMap result = ranked(rankedArr);
        for(int x : arr) {
            System.out.print(result.get(x) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Main main = new Main();
        main.solution(n, arr);
    }
}
