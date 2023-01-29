package sgyj.inflearn.yeji.section4;

import java.util.Scanner;
import java.util.HashMap;

class Solution1 {

    public static String solution(int input1, String input2){
        String answer = "";
        int max = 0;
        HashMap<String,Integer> compareGroup = new HashMap<>();
        for(int i = 0; i<input1; i++){
            String key = String.valueOf(input2.charAt(i));
            if(compareGroup.containsKey(key)){
                compareGroup.put(key, compareGroup.get(key)+1);
            }else{
                compareGroup.put(key,1);
            }
        }

        for(String key : compareGroup.keySet()){
            if(compareGroup.get(key) > max){
                answer = key;
                max = compareGroup.get(key);
            }
        }

        return answer;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.nextLine();
        String input2 = sc.nextLine();
        System.out.println(solution(input, input2));
    }
}
