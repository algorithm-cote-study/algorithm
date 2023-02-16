package sgyj.inflearn.seunggu.section8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sgyj.inflearn.common.TestFileUtil;

@DisplayName( "바둑이 승차(DFS)" )
class Solution2Test {

    @Test
    @DisplayName( "바둑이 승차(DFS) 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        int solution = getSolution( "static/section8/solution2/test_case1.txt" );

        // then
        assertEquals( 3994, solution );

    }

    private int getSolution ( String fileName ) throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), fileName );
        // when
        return Solution2.solution( reader );
    }

    @Test
    @DisplayName( "바둑이 승차(DFS) 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        // given
        int solution = getSolution( "static/section8/solution2/test_case2.txt" );

        // then
        assertEquals( 3568, solution );

    }

    @Test
    @DisplayName( "바둑이 승차(DFS) 테스트 케이스 3" )
    void test_case_3 () throws Exception {
        // given
        int solution = getSolution( "static/section8/solution2/test_case3.txt" );

        // then
        assertEquals( 1035, solution );

    }

    @Test
    @DisplayName( "바둑이 승차(DFS) 테스트 케이스 4" )
    void test_case_4 () throws Exception {
        // given
        int solution = getSolution( "static/section8/solution2/test_case4.txt" );

        // then
        assertEquals( 22640, solution );

    }

    @Test
    @DisplayName( "바둑이 승차(DFS) 테스트 케이스 5" )
    void test_case_5 () throws Exception {
        // given
        int solution = getSolution( "static/section8/solution2/test_case5.txt" );

        // then
        assertEquals( 9997, solution );

    }
}