package sgyj.inflearn.yeji.week2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution11 {
    // KKHSSSSSSSE
    // K2HS7E
    public String solution(String value){
        StringBuilder answer = new StringBuilder();
        List<ValueMap> valueMapList = new ArrayList<>();
        int target = 0;
        int index = 1;
        for(int i = 1; i<value.length(); i++){
            if(value.charAt( target ) == value.charAt( i )){
                index++;
            }else{
                valueMapList.add( new ValueMap( value.charAt( target ),index ) );
                index = 1;
            }
            target++;
        }
        valueMapList.add( new ValueMap( value.charAt( target ),index ) );
        for(ValueMap map : valueMapList){
            answer.append( map.getKey() );
            if(map.getValue() != 1){
                answer.append( map.getValue() );
            }

        }
        return answer.toString();
    }

    public static void main(String[] args){
        Scanner in=new Scanner( System.in);
        Solution11 solution11 = new Solution11();
        System.out.println( solution11.solution( in.nextLine() ) );

    }

    class ValueMap{
        private Character key;
        private Integer value;

        ValueMap(char key, int value){
            this.key = key;
            this.value = value;
        }

        public char getKey () {
            return key;
        }

        public int getValue(){
            return value;
        }
    }

}
