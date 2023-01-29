package sgyj.inflearn.seunggu.week7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sgyj.inflearn.common.TestFileUtil;

@DisplayName( "인접행렬 경로탐색" )
class Solution64Test {

    @Test
    @DisplayName( "인접행렬 경로탐색 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        getSolution();

        // then
        assertEquals( 6, Solution64.answer );

    }

    private void getSolution ( ) throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution64/test_case1.txt" );
        // when
        Solution64.solution( reader );
    }

}