package sgyj.inflearn.seunggu.section3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sgyj.common.TestFileUtil;

@DisplayName( "연속된 자연수의 합" )
class Solution5Test {
    @Test
    @DisplayName( "연속된 자연수의 합 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/section3/solution5/test_case1.txt" );
        // when
        int solution = Solution5.solution( reader );

        // then
        assertEquals( 1, solution );

    }

    @Test
    @DisplayName( "연속된 자연수의 합 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/section3/solution5/test_case2.txt" );
        // when
        int solution = Solution5.solution( reader );

        // then
        assertEquals( 1, solution );

    }

    @Test
    @DisplayName( "연속된 자연수의 합 테스트 케이스 3" )
    void test_case_3 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/section3/solution5/test_case3.txt" );
        // when
        int solution = Solution5.solution( reader );

        // then
        assertEquals( 3, solution );

    }

    @Test
    @DisplayName( "연속된 자연수의 합 테스트 케이스 4" )
    void test_case_4 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/section3/solution5/test_case4.txt" );
        // when
        int solution = Solution5.solution( reader );

        // then
        assertEquals( 5, solution );

    }

    @Test
    @DisplayName( "연속된 자연수의 합 테스트 케이스 5" )
    void test_case_5 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/section3/solution5/test_case5.txt" );
        // when
        int solution = Solution5.solution( reader );

        // then
        assertEquals( 8, solution );

    }

}