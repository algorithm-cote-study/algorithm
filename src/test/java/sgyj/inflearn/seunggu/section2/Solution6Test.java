package sgyj.inflearn.seunggu.section2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sgyj.inflearn.common.TestFileUtil;

@DisplayName( "뒤집은 소수" )
class Solution6Test {


    @Test
    @DisplayName( "뒤집은 소수 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution18/test_case1.txt" );

        // when
        String solution = Solution6.solution( reader );

        // then
        assertEquals( "23 2 73 2 3 ", solution );

    }

    @Test
    @DisplayName( "뒤집은 소수 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        // given
         BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution18/test_case2.txt" );
        // when
        String solution = Solution6.solution( reader );

        // then
        assertEquals( "953 71 7 859 ", solution );

    }

    @Test
    @DisplayName( "뒤집은 소수 테스트 케이스 3" )
    void test_case_3 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution18/test_case3.txt" );

        // when
        String solution = Solution6.solution( reader );

        // then
        assertEquals( "37 9811 67 2543 17 397 19 ", solution );

    }

    @Test
    @DisplayName( "뒤집은 소수 테스트 케이스 4" )
    void test_case_4 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution18/test_case4.txt" );

        // when
        String solution = Solution6.solution( reader );

        // then
        assertEquals( "41 179 2 9511 2 43 47 2221 5179 1949 ", solution );

    }

    @Test
    @DisplayName( "뒤집은 소수 테스트 케이스 5" )
    void test_case_5 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution18/test_case5.txt" );

        // when
        String solution = Solution6.solution( reader );

        // then
        assertEquals( "53 17 9931 41 823 80491 3769 83 83761 6917 5 97 431 23 1723 883 29 71 ", solution );
    }


}