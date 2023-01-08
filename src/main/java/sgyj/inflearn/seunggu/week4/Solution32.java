package sgyj.inflearn.seunggu.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Solution32 {

    /**
     * @title : 아나그램(해쉬)
     * @description : Anagram이란 두 문자열이 알파벳의 나열 순서를 다르지만 그 구성이 일치하면 두 단어는 아나그램이라고 합니다.
     *                예를 들면 AbaAeCe 와 baeeACA 는 알파벳을 나열 순서는 다르지만 그 구성을 살펴보면 A(2), a(1), b(1), C(1), e(2)로
     *                알파벳과 그 개수가 모두 일치합니다. 즉 어느 한 단어를 재 배열하면 상대편 단어가 될 수 있는 것을 아나그램이라 합니다.
     *                길이가 같은 두 개의 단어가 주어지면 두 단어가 아나그램인지 판별하는 프로그램을 작성하세요. 아나그램 판별시 대소문자가 구분됩니다.
     * @input : 첫 줄에 첫 번째 단어가 입력되고, 두 번째 줄에 두 번째 단어가 입력됩니다.
     *          단어의 길이는 100을 넘지 않습니다.
     * @output : 두 단어가 아나그램이면 “YES"를 출력하고, 아니면 ”NO"를 출력합니다.
     */
    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            System.out.println(solution(reader));
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    static String solution ( BufferedReader reader ) throws IOException {
        String firstWord = reader.readLine();
        String secondWord = reader.readLine();
        Map<String, Integer> firstMap = new HashMap<>();
        Map<String, Integer> secondMap = new HashMap<>();
        setMap( firstMap, firstWord.split( "" ) );
        setMap( secondMap, secondWord.split( "" ) );
        for ( Entry<String, Integer> entry : firstMap.entrySet() ) {
            int firstValue = entry.getValue();
            int secondValue = secondMap.getOrDefault( entry.getKey(),0 );
            if(firstValue != secondValue) {
                return "NO";
            }
        }
        return "YES";
    }

    private static void setMap ( Map<String, Integer> map, String[] words ) {
        for ( String word : words ) {
            map.put( word, map.getOrDefault( word, 0 ) + 1 );
        }
    }

}
