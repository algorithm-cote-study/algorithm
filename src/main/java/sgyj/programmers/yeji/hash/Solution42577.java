package sgyj.programmers.yeji.hash;

import java.util.Arrays;

// 전화번호 목록
public class Solution42577 {

    private static boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for(int i=0; i<phone_book.length-1; i++){
            if(phone_book[i+1].startsWith(phone_book[i])) return false;
        }
        return answer;
    }

    public static void main ( String[] args ) {
        String[] phone_book = {"12","123","1235","567","88"};
        System.out.println(solution(phone_book));
    }
}
