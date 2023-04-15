package sgyj.inflearn.seunggu.section8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sgyj.inflearn.common.TestFileUtil;

@DisplayName( "수열 추측하기" )
class Solution8Test {

    @Test
    @DisplayName( "수열 추측하기 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        String solution = getSolution( "static/section8/solution8/test_case1.txt" );

        // then
        assertEquals( "4 1 3 2 5 ", solution );

    }

    private String getSolution ( String fileName ) throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), fileName );
        // when
        return Solution8.solution( reader );
    }

    @Test
    @DisplayName( "수열 추측하기 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        // given
        String solution = getSolution( "static/section8/solution8/test_case2.txt" );

        // then
        assertEquals( "1 2 3 5 9 6 8 4 7 ", solution );

    }

    @Test
    @DisplayName( "수열 추측하기 테스트 케이스 3" )
    void test_case_3 () throws Exception {
        // given
        String solution = getSolution( "static/section8/solution8/test_case3.txt" );

        // then
        assertEquals( "7 6 4 2 1 3 5 8 9 ", solution );

    }

    @Test
    @DisplayName( "수열 추측하기 테스트 케이스 4" )
    void test_case_4 () throws Exception {
        // given
        String solution = getSolution( "static/section8/solution8/test_case4.txt" );

        // then
        assertEquals( "1 2 4 5 6 3 7 ", solution );

    }

    @Test
    @DisplayName( "수열 추측하기 테스트 케이스 5" )
    void test_case_5 () throws Exception {
        // given
        String solution = getSolution( "static/section8/solution8/test_case5.txt" );

        // then
        assertEquals( "1 6 9 4 2 3 5 10 7 8 ", solution );

    }
}