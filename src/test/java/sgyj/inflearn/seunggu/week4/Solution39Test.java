package sgyj.inflearn.seunggu.week4;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sgyj.inflearn.common.TestFileUtil;

@DisplayName( "후위식 연산(postfix)" )
class Solution39Test {

    @Test
    @DisplayName( "후위식 연산(postfix) 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution39/test_case1.txt" );
        // when
        int solution = Solution39.solution( reader );

        // then
        assertEquals( 16, solution );

    }

    @Test
    @DisplayName( "후위식 연산(postfix) 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution39/test_case2.txt" );
        // when
        int solution = Solution39.solution( reader );

        // then
        assertEquals( 12, solution );

    }

    @Test
    @DisplayName( "후위식 연산(postfix) 테스트 케이스 3" )
    void test_case_3 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution39/test_case3.txt" );
        // when
        int solution = Solution39.solution( reader );

        // then
        assertEquals( 30, solution );

    }

    @Test
    @DisplayName( "후위식 연산(postfix) 테스트 케이스 4" )
    void test_case_4 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution39/test_case4.txt" );
        // when
        int solution = Solution39.solution( reader );

        // then
        assertEquals( 21, solution );

    }

    @Test
    @DisplayName( "후위식 연산(postfix) 테스트 케이스 5" )
    void test_case_5 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution39/test_case5.txt" );
        // when
        int solution = Solution39.solution( reader );

        // then
        assertEquals( 24, solution );

    }

}