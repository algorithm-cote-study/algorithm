package sgyj.inflearn.seunggu.section8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sgyj.inflearn.common.TestFileUtil;

@DisplayName( " 최대점수 구하기(DFS)" )
class Solution4Test {

    @Test
    @DisplayName( " 최대점수 구하기(DFS) 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        String solution = getSolution();

        // then
        assertEquals( "1 1 \n1 2 \n1 3 \n" + "2 1 \n2 2 \n2 3 \n3 1 \n3 2 \n3 3", solution );

    }

    private String getSolution ( ) throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/section8/solution4/test_case1.txt" );
        // when
        return Solution4.solution( reader );
    }

}