package sgyj.inflearn.seunggu.week7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sgyj.inflearn.common.TestFileUtil;

@DisplayName( "인접행렬 경로탐색 인접리스트" )
class Solution65Test {

    @Test
    @DisplayName( "인접행렬 경로탐색 인접리스트 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        int solution = getSolution();

        // then
        assertEquals( 6, solution );

    }

    private int getSolution () throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution65/test_case1.txt" );
        // when
        return Solution65.solution( reader );
    }

}