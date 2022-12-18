package sgyj.inflearn.seunggu.week2;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sgyj.inflearn.common.TestFileUtil;

@DisplayName( "큰 수 출력하기" )
class Solution13Test {

    @Test
    @DisplayName( "큰 수 출력하기 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        // given
        File file = TestFileUtil.getFile( this.getClass(), "static/solution13/test_case1.txt" );
        BufferedReader reader = new BufferedReader( new FileReader( file ) );
        // when
        String solution = Solution13.solution( reader );

        // then
        assertEquals( "1 2 3 ", solution );

    }

    @Test
    @DisplayName( "큰 수 출력하기 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        // given
        File file = TestFileUtil.getFile( this.getClass(), "static/solution13/test_case2.txt" );

        BufferedReader reader = new BufferedReader( new FileReader( file ) );
        // when
        String solution = Solution13.solution( reader );

        // then
        assertEquals( "3 ", solution );

    }

    @Test
    @DisplayName( "큰 수 출력하기 테스트 케이스 3" )
    void test_case_3 () throws Exception {
        // given
        File file = TestFileUtil.getFile( this.getClass(), "static/solution13/test_case3.txt" );
        BufferedReader reader = new BufferedReader( new FileReader( file ) );
        // when
        String solution = Solution13.solution( reader );

        // then
        assertEquals( "3 3 3 ", solution );

    }

    @Test
    @DisplayName( "큰 수 출력하기 테스트 케이스 4" )
    void test_case_4 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution13/test_case4.txt" );

        // when
        String solution = Solution13.solution( reader );

        // then
        assertEquals( "7 10 6 7 9 20 15 ", solution );

    }

    @Test
    @DisplayName( "큰 수 출력하기 테스트 케이스 5" )
    void test_case_5 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution13/test_case5.txt" );

        // when
        String solution = Solution13.solution( reader );

        // then
        assertEquals( "7 10 6 7 9 20 15 19 ", solution );
    }
    
}