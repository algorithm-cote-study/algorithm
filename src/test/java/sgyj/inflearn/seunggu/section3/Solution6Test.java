package sgyj.inflearn.seunggu.section3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sgyj.common.TestFileUtil;

@DisplayName( "최대 길이 연속부분수열" )
class Solution6Test {
    @Test
    @DisplayName( "최대 길이 연속부분수열 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/section3/solution6/test_case1.txt" );
        // when
        int solution = Solution6.solution( reader );

        // then
        assertEquals( 8, solution );

    }

    @Test
    @DisplayName( "최대 길이 연속부분수열 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/section3/solution6/test_case2.txt" );
        // when
        int solution = Solution6.solution( reader );

        // then
        assertEquals( 13, solution );

    }

    @Test
    @DisplayName( "최대 길이 연속부분수열 테스트 케이스 3" )
    void test_case_3 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/section3/solution6/test_case3.txt" );
        // when
        int solution = Solution6.solution( reader );

        // then
        assertEquals( 15, solution );

    }

    @Test
    @DisplayName( "최대 길이 연속부분수열 테스트 케이스 4" )
    void test_case_4 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/section3/solution6/test_case4.txt" );
        // when
        int solution = Solution6.solution( reader );

        // then
        assertEquals( 36, solution );

    }

    @Test
    @DisplayName( "최대 길이 연속부분수열 테스트 케이스 5" )
    void test_case_5 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/section3/solution6/test_case5.txt" );
        // when
        int solution = Solution6.solution( reader );

        // then
        assertEquals( 50, solution );

    }

}