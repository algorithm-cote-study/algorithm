package sgyj.inflearn.seunggu.week3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sgyj.inflearn.common.TestFileUtil;

@DisplayName( "격자합" )
class Solution21Test {


    @Test
    @DisplayName( "격자합 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution21/test_case1.txt" );

        // when
        int solution = Solution21.solution( reader );

        // then
        assertEquals( 614, solution );

    }

    @Test
    @DisplayName( "격자합 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution21/test_case2.txt" );

        // when
        int solution = Solution21.solution( reader );

        // then
        assertEquals( 1234, solution );

    }

    @Test
    @DisplayName( "격자합 테스트 케이스 3" )
    void test_case_3 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution21/test_case3.txt" );
        // when
        int solution = Solution21.solution( reader );

        // then
        assertEquals( 1820, solution );

    }

    @Test
    @DisplayName( "격자합 테스트 케이스 4" )
    void test_case_4 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution21/test_case4.txt" );

        // when
        int solution = Solution21.solution( reader );

        // then
        assertEquals( 2226, solution );

    }

    @Test
    @DisplayName( "격자합 테스트 케이스 5" )
    void test_case_5 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution21/test_case5.txt" );

        // when
        int solution = Solution21.solution( reader );

        // then
        assertEquals( 3094, solution );
    }


}