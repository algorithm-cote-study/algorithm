package sgyj.inflearn.yeji.section3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static sgyj.inflearn.yeji.section3.Solution3.solution;

import java.io.BufferedReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sgyj.common.TestFileUtil;

@DisplayName( "최대 매출" )
class Solution2Test {

    @Test
    @DisplayName( "최대 매출 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/section3/solution3/test_case1.txt" );
        // when
        int solution = solution( reader );

        // then
        assertEquals( 126, solution );

    }

    @Test
    @DisplayName( "최대 매출 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/section3/solution3/test_case2.txt" );
        // when
        int solution = solution( reader );

        // then
        assertEquals( 927, solution );

    }

    @Test
    @DisplayName( "최대 매출 테스트 케이스 3" )
    void test_case_3 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/section3/solution3/test_case3.txt" );
        // when
        int solution = solution( reader );

        // then
        assertEquals( 256799, solution );

    }

    @Test
    @DisplayName( "최대 매출 테스트 케이스 4" )
    void test_case_4 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/section3/solution3/test_case4.txt" );
        // when
        int solution = solution( reader );

        // then
        assertEquals( 1763686, solution );

    }

    @Test
    @DisplayName( "최대 매출 테스트 케이스 5" )
    void test_case_5 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/section3/solution3/test_case5.txt" );
        // when
        int solution = solution( reader );

        // then
        assertEquals( 3008692, solution );

    }

}