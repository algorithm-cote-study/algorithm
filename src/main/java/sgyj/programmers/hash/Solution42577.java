package sgyj.programmers.hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 전화번호 목록
public class Solution42577 {

    private static boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String ,Integer> map = new HashMap<>();
        Arrays.sort( phone_book,(String s1, String s2)-> s1.length()-s2.length() );
        for(String phone: phone_book){
            for(String key : map.keySet()){
                if(key.length()<=phone.length()){
                    if(phone.startsWith( key )){
                        return false;
                    }
                }
            }
            map.put( phone , 1);
        }

        return answer;
    }

    public static void main ( String[] args ) {
        String[] phone_book = {"12","123","1235","567","88"};
        System.out.println(solution(phone_book));
    }
}
