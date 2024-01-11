package algorithm._02_Array._04_피보나치수열;

import java.util.Scanner;

class Main {
	public int[] solution(int n) {
		int[] arr = new int[n];
		arr[0] = 1;
		arr[1] = 1;
		
		for(int i = 2; i < n; i++) {
			arr[i] = arr[i - 2] + arr[i - 1];
		}
		
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main main = new Main();
		
		int[] arr = main.solution(sc.nextInt());
		
		for(int a : arr) {
			System.out.print(a + " ");
		}
	}

}
