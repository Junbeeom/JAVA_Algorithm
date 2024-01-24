//package algorithm._02_Array._03_가위바위보;
//
//import java.util.HashMap;
//
//class Main {
//    public HashMap<Integer, String> kk() {
//        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
//        hashMap.put(1, "가위");
//        hashMap.put(2, "바위");
//        hashMap.put(3, "보");
//
//        return hashMap;
//    }
//
//
//    public void solution(int n, int[] a, int[] b) {
//        for(int i = 0; i < n; i++) {
//
//            HashMap<Integer, String> kk = kk();
//
//            if(kk.get(a[i]) > b[i]) {
//                ;
//
//                System.out.println("A");
//            } else if(a[i] < b[i]) {
//                System.out.println("B");
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//
//    }
//
//}
