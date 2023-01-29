package sgyj.inflearn.seunggu.section6;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.IOException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sgyj.inflearn.common.TestFileUtil;

@DisplayName( "이분검색" )
class Solution8Test {

    @Test
    @DisplayName( "이분검색 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        int solution = getSolution( "static/solution51/test_case1.txt" );

        // then
        assertEquals( 14, solution );

    }

    private int getSolution ( String fileName ) throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), fileName );
        // when
        return Solution8.solution( reader );
    }

    @Test
    @DisplayName( "이분검색 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        // given
        int solution = getSolution( "static/solution51/test_case2.txt" );

        // then
        assertEquals( 16, solution );

    }

    @Test
    @DisplayName( "이분검색 테스트 케이스 3" )
    void test_case_3 () throws Exception {
        // given
        int solution = getSolution( "static/solution51/test_case3.txt" );

        // then
        assertEquals( 55, solution );

    }

    @Test
    @DisplayName( "이분검색 테스트 케이스 4" )
    void test_case_4 () throws Exception {
        // given
        int solution = getSolution( "static/solution51/test_case4.txt" );

        // then
        assertEquals( 721, solution );

    }

    @Test
    @DisplayName( "이분검색 테스트 케이스 5" )
    void test_case_5 () throws Exception {
        // given
        int solution = getSolution( "static/solution51/test_case5.txt" );

        // then
        assertEquals( 291, solution );

    }

}