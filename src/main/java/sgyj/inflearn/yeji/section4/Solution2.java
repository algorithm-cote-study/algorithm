package sgyj.inflearn.yeji.section4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution2 {

    protected static final Map<String,Integer> compareResult = new HashMap<>();

    public static void checkExistKey(String input){
        for(int i = 0; i<input.length(); i++){
            String target = String.valueOf(Character.toLowerCase(input.charAt(i)));
            if(compareResult.containsKey(target)){
                compareResult.put(target,compareResult.get(target)+1);
            }else{
                compareResult.put(target,1);
            }
        }
    }

    public static String solution(String input, String input2){
        String answer = "YES";

        checkExistKey( input );
        checkExistKey( input2 );

        for(String key : compareResult.keySet()){
            if(compareResult.get(key) % 2 != 0) answer = "NO";
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner( System.in);
        String input = sc.nextLine();
        String input2 = sc.nextLine();
        System.out.println(solution(input, input2));
    }

}
