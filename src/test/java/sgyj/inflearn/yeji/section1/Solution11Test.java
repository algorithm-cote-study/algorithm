package sgyj.inflearn.yeji.section1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sgyj.inflearn.yeji.section1.Solution11;

class Solution11Test {

    @Test
    @DisplayName( " 문자열 압축 - 테스트케이스1" )
    void solution () {
        String input = "KKHSSSSSSSE";
        Solution11 solution11 = new Solution11();
        String solution = solution11.solution( input );
        assertEquals("K2HS7E",solution);

    }
}