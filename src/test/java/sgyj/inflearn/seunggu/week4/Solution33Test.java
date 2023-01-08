package sgyj.inflearn.seunggu.week4;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sgyj.inflearn.common.TestFileUtil;

@DisplayName( "매출액의 종류" )
class Solution33Test {
    
    @Test
    @DisplayName( "매출액의 종류 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution33/test_case1.txt" );
        // when
        String solution = Solution33.solution( reader );

        // then
        assertEquals( "3 3 3 3 3 3 3 3 ", solution );

    }

    @Test
    @DisplayName( "매출액의 종류 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution33/test_case2.txt" );
        // when
        String solution = Solution33.solution( reader );

        // then
        assertEquals( "7 7 8 8 9 9 10 10 10 10 10 ", solution );

    }

    @Test
    @DisplayName( "매출액의 종류 테스트 케이스 3" )
    void test_case_3 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution33/test_case3.txt" );
        // when
        String solution = Solution33.solution( reader );

        // then
        reader = TestFileUtil.getReader( this.getClass(), "static/solution33/answer3.txt" );
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
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution33/test_case4.txt" );
        // when
        String solution = Solution33.solution( reader );

        reader = TestFileUtil.getReader( this.getClass(), "static/solution33/answer4.txt" );
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
    @DisplayName( "매출액의 종류 테스트 케이스 5" )
    void test_case_5 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution33/test_case5.txt" );
        // when
        String solution = Solution33.solution( reader );

        reader = TestFileUtil.getReader( this.getClass(), "static/solution33/answer5.txt" );
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