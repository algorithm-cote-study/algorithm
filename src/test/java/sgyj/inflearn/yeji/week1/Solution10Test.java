package sgyj.inflearn.yeji.week1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Solution10Test {

    @Test
    @DisplayName( "테스트케이스1" )
    void solution () {
        String input = "teachermode e";
        String[] splitedInput = input.split( " " );
        Solution10 solution10 = new Solution10();
        int[] solution = solution10.solution( splitedInput[0], splitedInput[1] );
        assertArrayEquals( new int[]{ 1, 0, 1, 2, 1, 0, 1, 2, 2, 1, 0 }, solution );
    }

    @Test
    @DisplayName( "테스트케이스2" )
    void solution2 () {
        String input = "fkdgkjdflkgjljslgjkfldjlkfdg f";
        String[] splitedInput = input.split( " " );
        Solution10 solution10 = new Solution10();
        int[] solution = solution10.solution( splitedInput[0], splitedInput[1] );
        assertArrayEquals( new int[]{ 0, 1, 2, 3, 3, 2, 1, 0, 1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1, 0, 1, 2, 3, 2, 1, 0, 1, 2 }, solution );
        // 0 1 2 3 3 2 1 0 1 2 3 4 5 6 5 4 3 2 1 0 1 2 3 2 1 0 1 2
    }
}