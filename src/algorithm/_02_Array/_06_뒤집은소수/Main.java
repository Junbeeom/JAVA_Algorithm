package algorithm._02_Array._06_뒤집은소수;

import java.util.Scanner;

class Main {
   static public boolean isPrime(int x) {
        boolean prime = true;

        if(x == 1) {
            return false;
        }
        for(int i = 2; i < x; i++) {
            if(x % i == 0) {
                prime = false;
            }
        }

        return prime;
    }

    static public void solution(int n, int[] arr) {
       for(int i = 0; i < n; i++) {
           int tmp = arr[i];
           int res = 0;
           while(tmp>0) {
               int t = tmp % 10;
               res = res * 10 + t;
               tmp=tmp/10;
           }
           if(isPrime(res)) {
               System.out.print(res + " ");
           }
       }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        solution(n, arr);
    }
}
