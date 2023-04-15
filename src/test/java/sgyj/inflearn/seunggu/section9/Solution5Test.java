package sgyj.inflearn.seunggu.section9;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sgyj.common.TestFileUtil;

@DisplayName( "다익스트라 알고리즘" )
class Solution5Test {

    @Test
    @DisplayName( "다익스트라 알고리즘 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        String solution = getSolution();

        // then
        assertEquals( """
                          2 : 11
                          3 : 4
                          4 : 9
                          5 : 14
                          6 : impossible
                          """, solution );

    }

    private String getSolution ( ) throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/section9/solution5/test_case1.txt" );
        // when
        return Solution5.solution( reader );
    }
}