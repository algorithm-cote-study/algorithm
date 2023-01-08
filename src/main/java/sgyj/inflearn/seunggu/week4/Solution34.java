package sgyj.inflearn.seunggu.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution34 {

    /**
     * @title : 모든 아나그램 찾기
     * @description : S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.
     *                아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.
     * @input : 첫 줄에 첫 번째 S문자열이 입력되고, 두 번째 줄에 T문자열이 입력됩니다.
     *          S문자열의 길이는 10,000을 넘지 않으며, T문자열은 S문자열보다 길이가 작거나 같습니다.
     * @output : S단어에 T문자열과 아나그램이 되는 부분문자열의 개수를 출력합니다.
     */
    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            System.out.println(solution(reader));
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    static int solution ( BufferedReader reader ) throws IOException {
        char[] words = reader.readLine().toCharArray();

        String anagram = reader.readLine();
        char[] anagrams = anagram.toCharArray();
        Map<Character, Integer> originMap = new HashMap<>();
        for ( char ana : anagrams ) {
            originMap.put( ana, originMap.getOrDefault( ana, 0 ) + 1 );
        }
        int result = 0;
        int lt = 0;
        while(lt+anagram.length() <= words.length) {
            Map<Character, Integer> map = new HashMap<>();
            for(int i=lt; i<lt+anagrams.length; i++) {
                map.put( words[i], map.getOrDefault( words[i], 0 ) + 1 );
            }
            boolean flag = true;
            for ( char ana : anagrams ) {
                if( !Objects.equals( map.getOrDefault( ana, 0 ), originMap.getOrDefault( ana, 0 ) ) ) {
                    flag = false;
                    break;
                }
            }
            if(flag) result ++;
            lt++;
        }
        return result;
    }

}
