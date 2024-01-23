package algorithm._03_TwoPointers_SlidingWindow._01_두_배열_합치기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i = 0; i < a; i ++) {
            arr[i] = sc.nextInt();
        }

        int b = sc.nextInt();
        int[] arr2 = new int[b];
        for(int i = 0; i < b; i ++) {
            arr2[i] = sc.nextInt();
        }

        ArrayList<Integer> solution = main.solution(a, b, arr, arr2);
        for(Integer x : solution) {
            System.out.print(x + " ");
        }
    }

    public ArrayList<Integer> solution(int a, int b, int[] arr, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;

        while(p1 < a && p2 < b) {
            if(arr[p1] < arr2[p2]) {
                answer.add(arr[p1++]);
            } else {
                answer.add(arr2[p2++]);
            }
        }

        while(p1 < a) {
            answer.add(arr[p1++]);
        }

        while(p2 < b) {
            answer.add(arr2[p2++]);
        }



        return answer;
    }
}
