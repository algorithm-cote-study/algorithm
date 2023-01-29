package sgyj.inflearn.yeji.section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution2 {

    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            System.out.println(solution( reader ));
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    public static String solution(BufferedReader reader) throws IOException {
        StringBuilder answer = new StringBuilder();
        reader.readLine();
        int[] aArray = Arrays.stream( reader.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
        reader.readLine();
        int[] bArray = Arrays.stream( reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(aArray);
        Arrays.sort(bArray);
        List<Integer> sortedAnswer = new ArrayList<>();
        Map<Integer,Integer> arrayMap = new LinkedHashMap<>();
        for(int a : aArray){
            if(arrayMap.containsKey( a )){
                arrayMap.put(a,arrayMap.get(a)+1);
            }else{
                arrayMap.put(a,1);
            }
        }
        for(int b : bArray){
            if(arrayMap.containsKey( b )){
                arrayMap.put(b,arrayMap.get(b)+1);
            }else{
                arrayMap.put(b,1);
            }
        }

        for(int key : arrayMap.keySet()){
            if(arrayMap.get(key) > 1){
                sortedAnswer.add(key);
            }
        }

        Arrays.sort(sortedAnswer.toArray());

        for(int a : sortedAnswer){
            answer.append(a).append(" ");
        }

        return answer.toString();
    }
}
