package sgyj.backjun.seunggu;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sgyj.common.TestFileUtil;

@DisplayName("압축")
class Main1662Test {
    @Test
    @DisplayName( "압축 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/backjun/1662/test_case1.txt" );
        // when
        int solution = Main1662.solution( reader );

        // then
        assertEquals( 19, solution );

    }

    @Test
    @DisplayName( "압축 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/backjun/1662/test_case2.txt" );

        // when
        int solution = Main1662.solution( reader );

        // then
        assertEquals( 3, solution );

    }

    @Test
    @DisplayName( "압축 테스트 케이스 3" )
    void test_case_3 () throws Exception {
        // given
        File file = TestFileUtil.getFile( this.getClass(), "static/backjun/1662/test_case3.txt" );
        BufferedReader reader = new BufferedReader( new FileReader( file ) );
        // when
        int solution = Main1662.solution( reader );

        // then
        assertEquals( 8, solution );

    }

    @Test
    @DisplayName( "압축 테스트 케이스 4" )
    void test_case_4 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/backjun/1662/test_case4.txt" );

        // when
        int solution = Main1662.solution( reader );

        // then
        assertEquals( 0, solution );

    }

    @Test
    @DisplayName( "압축 테스트 케이스 5" )
    void test_case_5 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/backjun/1662/test_case5.txt" );

        // when
        int solution = Main1662.solution( reader );

        // then
        assertEquals( 0, solution );
    }
    @Test
    @DisplayName( "압축 테스트 케이스 6" )
    void test_case_6 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/backjun/1662/test_case6.txt" );

        // when
        int solution = Main1662.solution( reader );

        // then
        assertEquals( 7, solution );
    }


}