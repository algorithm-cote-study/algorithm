package sgyj.inflearn.seunggu.section9;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sgyj.common.TestFileUtil;

@DisplayName( "결혼식" )
class Solution3Test {

    @Test
    @DisplayName( "결혼식 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        int solution = getSolution( "static/section9/solution3/test_case1.txt" );

        // then
        assertEquals( 2, solution );

    }

    private int getSolution ( String fileName ) throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), fileName );
        // when
        return Solution3.solution( reader );
    }

    @Test
    @DisplayName( "결혼식 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        // given
        int solution = getSolution( "static/section9/solution3/test_case2.txt" );

        // then
        assertEquals( 9, solution );

    }

    @Test
    @DisplayName( "결혼식 테스트 케이스 3" )
    void test_case_3 () throws Exception {
        // given
        int solution = getSolution( "static/section9/solution3/test_case3.txt" );

        // then
        assertEquals( 2532, solution );

    }

    @Test
    @DisplayName( "결혼식 테스트 케이스 4" )
    void test_case_4 () throws Exception {
        // given
        int solution = getSolution( "static/section9/solution3/test_case4.txt" );

        // then
        assertEquals( 25252, solution );

    }

    @Test
    @DisplayName( "결혼식 테스트 케이스 5" )
    void test_case_5 () throws Exception {
        // given
        int solution = getSolution( "static/section9/solution3/test_case5.txt" );

        // then
        assertEquals( 50598, solution );

    }
}