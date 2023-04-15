package sgyj.inflearn.seunggu.section5;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.IOException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sgyj.common.TestFileUtil;

@DisplayName( "교육과정 설계" )
class Solution7Test {

    @Test
    @DisplayName( "교육과정 설계 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        String solution = getSolution( "static/section5/solution7/test_case1.txt" );

        // then
        assertEquals( "YES", solution );

    }

    private String getSolution ( String fileName ) throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), fileName );
        // when
        return Solution7.solution( reader );
    }

    @Test
    @DisplayName( "교육과정 설계 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        // given
        String solution = getSolution( "static/section5/solution7/test_case2.txt" );

        // then
        assertEquals( "NO", solution );

    }

    @Test
    @DisplayName( "교육과정 설계 테스트 케이스 3" )
    void test_case_3 () throws Exception {
        // given
        String solution = getSolution( "static/section5/solution7/test_case3.txt" );

        // then
        assertEquals( "NO", solution );

    }

    @Test
    @DisplayName( "교육과정 설계 테스트 케이스 4" )
    void test_case_4 () throws Exception {
        // given
        String solution = getSolution( "static/section5/solution7/test_case4.txt" );

        // then
        assertEquals( "NO", solution );

    }

    @Test
    @DisplayName( "교육과정 설계 테스트 케이스 5" )
    void test_case_5 () throws Exception {
        // given
        String solution = getSolution( "static/section5/solution7/test_case5.txt" );

        // then
        assertEquals( "NO", solution );

    }

}