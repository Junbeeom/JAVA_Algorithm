package algorithm._04_HashMap_TreeSet_해쉬_정렬지원_Set._02_아나그램;


import java.util.HashMap;
import java.util.Scanner;

class Main {
    public static void main(String[] agrs) {
        Main main = new Main();

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = sc.nextLine();


        String solution = main.solution(str, str2);
        System.out.println(solution);

    }

    public String solution(String str, String str2) {
        HashMap<Character, Integer> hm  = new HashMap<>();
        String answer = "YES";

        for(char x : str.toCharArray()) {
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }

        for(char x : str2.toCharArray()) {
            if(hm.containsKey(x)) {
                hm.put(x, hm.getOrDefault(x, 0) - 1);
            }
        }

        for(Integer x : hm.values()) {
            if(x != 0) {
                answer = "NO";
            }
        }
        return answer;
    }
}
