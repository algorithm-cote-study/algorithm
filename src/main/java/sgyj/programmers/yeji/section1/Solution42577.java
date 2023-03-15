package sgyj.programmers.yeji.section1;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.stream.Collectors;

// 전화번호 목록
public class Solution42577 {

    private static int m = 5;
    private static int[] num = new int[] {1,2,3,4,5};
    private static final boolean[] visited = new boolean[6];
    public static void dfs(int[] number) {

        Arrays.stream( number ).boxed().sorted(Comparator.reverseOrder()).collect( Collectors.toList());

    }
    public static void main ( String[] args ) {
        String s= "-+1";
        System.out.println(solution( s ));
        //        dfs(1);
    }
    static int solution(String s) {
        if(s.length() == 0) return 0;
        int result = 0;
        s = s.replace(" ", "");
        Deque<Character> deque = new ArrayDeque<>();
        deque.add(s.charAt( 0 ));
        for(int i=1; i<s.length(); i++) {
            char c = s.charAt(i);
            if(!Character.isDigit( c ) || c != '.') break;
            deque.add( c );
        }

        int size = deque.size();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<size; i++) {
            char c = deque.pop();
            if(c == '.') break;
            stringBuilder.append(c);
        }
        s = stringBuilder.toString();
        if(!"".equals(s)) {
            try {
                result = Integer.parseInt(s);
            }catch (NumberFormatException e) {
                result = Integer.MIN_VALUE;
            }
        }
        return result;
    }
}
