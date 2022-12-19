package sgyj.inflearn.yeji.week2;

import java.util.Scanner;

public class Solution12 {
//    4
//    #****##
//    #**####
//    #**####
//    #**##**
//    COOL
public String solution ( int n, String input ){
        StringBuilder answer = new StringBuilder();
        int index = 0;
        for(int i=1; i<=n; i++){
            String subInput = input.substring(index ,i*7 ).replaceAll( "\\#","1" ).replaceAll( "\\*" ,"0");
            index+=7;
            int result = 0;
            int count = 1;
            for(int subIndex = subInput.length()-1; subIndex>=0; subIndex--){
                if(subInput.charAt( subIndex ) == '1'){
                    result += count;
                }
                count *= 2;
            }
            answer.append( (char)result );
        }
        return answer.toString();
    }

    public static void main(String[] args){
        Scanner in=new Scanner( System.in);
        Solution12 solution12 = new Solution12();
        int n = in.nextInt();
        in.nextLine();
        String s = in.nextLine();
        System.out.println( solution12.solution( n, s ) );
    }
}
