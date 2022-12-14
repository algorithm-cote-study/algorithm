package sgyj.inflearn.yeji.week2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Solution1Test {

    @Test
    @DisplayName( " 문자열 압축 - 테스트케이스1" )
    void solution () {
        String input = "KKHSSSSSSSE";
        Solution1 solution1 = new Solution1();
        String solution = solution1.solution( input );
        assertEquals("K2HS7E",solution);

    }
}