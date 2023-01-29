package sgyj.inflearn.seunggu.section6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sgyj.inflearn.common.TestFileUtil;

@DisplayName( "장난꾸러기" )
class Solution6Test {

    @Test
    @DisplayName( "장난꾸러기 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        String solution = getSolution( "static/solution49/test_case1.txt" );

        // then
        assertEquals( "3 8", solution );

    }

    private String getSolution ( String fileName ) throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), fileName );
        // when
        return Solution6.solution( reader );
    }

    @Test
    @DisplayName( "장난꾸러기 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        // given
        String solution = getSolution( "static/solution49/test_case2.txt" );

        // then
        assertEquals( "2 9", solution );

    }

    @Test
    @DisplayName( "장난꾸러기 테스트 케이스 3" )
    void test_case_3 () throws Exception {
        // given
        String solution = getSolution( "static/solution49/test_case3.txt" );

        // then
        assertEquals( "24 27", solution );

    }

    @Test
    @DisplayName( "장난꾸러기 테스트 케이스 4" )
    void test_case_4 () throws Exception {
        // given
        String solution = getSolution( "static/solution49/test_case4.txt" );

        // then
        assertEquals( "44 59", solution );

    }

    @Test
    @DisplayName( "장난꾸러기 테스트 케이스 5" )
    void test_case_5 () throws Exception {
        // given
        String solution = getSolution( "static/solution49/test_case5.txt" );

        // then
        assertEquals( "35 70", solution );

    }

}