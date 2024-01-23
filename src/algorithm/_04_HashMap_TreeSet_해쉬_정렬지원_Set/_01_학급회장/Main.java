package algorithm._04_HashMap_TreeSet_해쉬_정렬지원_Set._01_학급회장;

import java.util.HashMap;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        System.out.print(main.solution(n, str));
    }

    public char solution(int n, String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        char answer = ' ';

        for(char x : str.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        for(char key : map.keySet()) {
            if(map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }


}
