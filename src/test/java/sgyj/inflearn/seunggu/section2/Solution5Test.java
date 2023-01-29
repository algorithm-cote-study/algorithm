package sgyj.inflearn.seunggu.section2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sgyj.inflearn.common.TestFileUtil;

@DisplayName( "소수(에라토스테네스 체)" )
class Solution5Test {

    @Test
    @DisplayName( "소수(에라토스테네스 체) 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution17/test_case1.txt" );

        // when
        int solution = Solution5.solution( reader );

        // then
        assertEquals( 8, solution );

    }

    @Test
    @DisplayName( "소수(에라토스테네스 체) 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution17/test_case2.txt" );

        // when
        int solution = Solution5.solution( reader );

        // then
        assertEquals( 17984, solution );

    }

    @Test
    @DisplayName( "소수(에라토스테네스 체) 테스트 케이스 3" )
    void test_case_3 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution17/test_case3.txt" );

        // when
        int solution = Solution5.solution( reader );

        // then
        assertEquals( 9592, solution );

    }

}