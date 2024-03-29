package sgyj.inflearn.seunggu.section4;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.IOException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sgyj.common.TestFileUtil;

@DisplayName( "매출액의 종류" )
class Solution3Test {
    
    @Test
    @DisplayName( "매출액의 종류 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        // given
        String solution = getSolution( "static/section4/solution3/test_case1.txt" );

        // then
        assertEquals( "3 3 3 3 3 3 3 3 ", solution );

    }

    private String getSolution ( String fileName ) throws IOException {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), fileName );
        // when
        return Solution3.solution( reader );
    }

    @Test
    @DisplayName( "매출액의 종류 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        // given
        String solution = getSolution( "static/section4/solution3/test_case2.txt" );

        // then
        assertEquals( "7 7 8 8 9 9 10 10 10 10 10 ", solution );

    }

    @Test
    @DisplayName( "매출액의 종류 테스트 케이스 3" )
    void test_case_3 () throws Exception {
        // given
        String solution = getSolution( "static/section4/solution3/test_case3.txt" );
        BufferedReader reader;

        // then
        reader = TestFileUtil.getReader( this.getClass(), "static/section4/solution3/answer3.txt" );
        StringBuilder stringBuilder = new StringBuilder();
        String readLine = "";
        while(readLine != null) {
            readLine = reader.readLine();
            if(readLine != null) stringBuilder.append( readLine );
        }
        // then
        assertEquals( stringBuilder.toString(), solution );

    }

    @Test
    @DisplayName( "매출액의 종류 테스트 케이스 4" )
    void test_case_4 () throws Exception {
        // given
        String solution = getSolution( "static/section4/solution3/test_case4.txt" );
        BufferedReader reader;

        reader = TestFileUtil.getReader( this.getClass(), "static/section4/solution3/answer4.txt" );
        StringBuilder stringBuilder = new StringBuilder();
        String readLine = "";
        while(readLine != null) {
            readLine = reader.readLine();
            if(readLine != null) stringBuilder.append( readLine );
        }
        // then
        assertEquals( stringBuilder.toString().strip(), solution.strip() );

    }

    @Test
    @DisplayName( "매출액의 종류 테스트 케이스 5" )
    void test_case_5 () throws Exception {
        // given
        String solution = getSolution( "static/section4/solution3/test_case5.txt" );
        BufferedReader reader;

        reader = TestFileUtil.getReader( this.getClass(), "static/section4/solution3/answer5.txt" );
        StringBuilder stringBuilder = new StringBuilder();
        String readLine = "";
        while(readLine != null) {
            readLine = reader.readLine();
            if(readLine != null) stringBuilder.append( readLine );
        }
        // then
        assertEquals( stringBuilder.toString(), solution );

    }

}