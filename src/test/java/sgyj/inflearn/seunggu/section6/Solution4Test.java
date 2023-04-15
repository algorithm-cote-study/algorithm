package sgyj.inflearn.seunggu.section6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sgyj.common.TestFileUtil;

@DisplayName( "Least Recently Used" )
class Solution4Test {

    @Test
    @DisplayName( "Least Recently Used 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        String solution = getSolution( "static/section6/solution4/test_case1.txt" );

        // then
        assertEquals( "10 6 5 ", solution );

    }

    private String getSolution ( String fileName ) throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), fileName );
        // when
        return Solution4.solution( reader );
    }

    @Test
    @DisplayName( "Least Recently Used 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        // given
        String solution = getSolution( "static/section6/solution4/test_case2.txt" );

        // then
        assertEquals( "18 17 4 1 12 ", solution );

    }

    @Test
    @DisplayName( "Least Recently Used 테스트 케이스 3" )
    void test_case_3 () throws Exception {
        // given
        String solution = getSolution( "static/section6/solution4/test_case3.txt" );

        // then
        assertEquals( "14 9 26 45 36 19 7 33 16 41 ", solution );

    }

    @Test
    @DisplayName( "Least Recently Used 테스트 케이스 4" )
    void test_case_4 () throws Exception {
        // given
        String solution = getSolution( "static/section6/solution4/test_case4.txt" );

        // then
        assertEquals( "87 11 59 12 78 71 10 92 54 29 ", solution );

    }

    @Test
    @DisplayName( "Least Recently Used 테스트 케이스 5" )
    void test_case_5 () throws Exception {
        // given
        String solution = getSolution( "static/section6/solution4/test_case5.txt" );

        // then
        assertEquals( "70 94 12 64 21 46 79 86 13 80 ", solution );

    }

}