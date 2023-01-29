package sgyj.inflearn.seunggu.section2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sgyj.inflearn.common.TestFileUtil;

@DisplayName( "멘토링" )
class Solution12Test {

    @Test
    @DisplayName( "멘토링 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution24/test_case1.txt" );
        // when
        int solution = Solution12.solution( reader );

        // then
        assertEquals( 3, solution );

    }

    @Test
    @DisplayName( "멘토링 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution24/test_case2.txt" );
        // when
        int solution = Solution12.solution( reader );

        // then
        assertEquals( 90, solution );

    }

    @Test
    @DisplayName( "멘토링 테스트 케이스 3" )
    void test_case_3 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution24/test_case3.txt" );
        // when
        int solution = Solution12.solution( reader );

        // then
        assertEquals( 115, solution );

    }

    @Test
    @DisplayName( "멘토링 테스트 케이스 4" )
    void test_case_4 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution24/test_case4.txt" );
        // when
        int solution = Solution12.solution( reader );

        // then
        assertEquals( 190, solution );

    }

    @Test
    @DisplayName( "멘토링 테스트 케이스 5" )
    void test_case_5 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution24/test_case5.txt" );
        // when
        int solution = Solution12.solution( reader );

        // then
        assertEquals( 130, solution );
    }


}