package algorithm._04_HashMap_TreeSet_해쉬_정렬지원_Set._04_모든_아나그램_찾기;

import java.util.*;

class Main {
    public static void main(String[] args) {
        Main main = new Main();

        Scanner sc = new Scanner(System.in);
        String a  = sc.nextLine();
        String b = sc.nextLine();

        int solution = main.solution(a, b);
        System.out.println(solution);


    }

    public int solution(String a, String b) {
        int answer = 0;

        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();

        //예시의 abc map에 넣어놓기
        for(char x : b.toCharArray()) {
            bm.put(x, bm.getOrDefault(x, 0) + 1);
        }

        int l = b.length() - 1;
        //rt,lt가 포함된 am의 k-1(하나 전)까지 셋팅 해놓기
        for(int i = 0; i < l; i++) {
            am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0) + 1);
        }

        int lt = 0;
        //2pointer algorithm
        for(int rt = l; rt < a.length(); rt++) {
           am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0 ) + 1);
           if(am.equals(bm)) {
               answer++;
           }
           am.put(a.charAt(lt), am.get(a.charAt(lt)) - 1);
           if(am.get(a.charAt(lt)) == 0) {
               am.remove(a.charAt(lt));
           }
           lt++;
        }




        return answer;

    }
}
