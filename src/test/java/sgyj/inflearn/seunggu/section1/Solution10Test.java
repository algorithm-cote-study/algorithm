package sgyj.inflearn.seunggu.section1;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sgyj.common.TestFileUtil;

@DisplayName( "가장 짧은 문자거리" )
class Solution10Test {

    @Test
    @DisplayName( "가장 짧은 문자거리 케이스 1" )
    void test_case_1 () throws Exception {
        // given
        File file = TestFileUtil.getFile( this.getClass(), "static/section1/solution10/test_case1.txt" );
        BufferedReader reader = new BufferedReader( new FileReader( file ) );
        // when
        String solution = Solution10.solution( reader );

        // then
        assertEquals( "1 0 1 2 1 0 1 2 2 1 0 ", solution );

    }

    @Test
    @DisplayName( "가장 짧은 문자거리 케이스 2" )
    void test_case_2 () throws Exception {
        // given
        File file = TestFileUtil.getFile( this.getClass(), "static/section1/solution10/test_case2.txt" );

        BufferedReader reader = new BufferedReader( new FileReader( file ) );
        // when
        String solution = Solution10.solution( reader );

        // then
        assertEquals( "0 1 2 3 3 2 1 0 1 2 3 4 5 6 5 4 3 2 1 0 1 2 3 2 1 0 1 2 ", solution );

    }

    @Test
    @DisplayName( "가장 짧은 문자거리 케이스 3" )
    void test_case_3 () throws Exception {
        // given
        File file = TestFileUtil.getFile( this.getClass(), "static/section1/solution10/test_case3.txt" );
        BufferedReader reader = new BufferedReader( new FileReader( file ) );
        // when
        String solution = Solution10.solution( reader );

        // then
        assertEquals( "0 0 0 0 0 0 0 0 ", solution );

    }

    @Test
    @DisplayName( "가장 짧은 문자거리 케이스 4" )
    void test_case_4 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/section1/solution10/test_case4.txt" );

        // when
        String solution = Solution10.solution( reader );

        // then
        assertEquals( "3 2 1 0 1 2 3 3 2 1 0 1 2 3 2 1 0 ", solution );

    }

    @Test
    @DisplayName( "가장 짧은 문자거리 케이스 5" )
    void test_case_5 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/section1/solution10/test_case5.txt" );

        // when
        String solution = Solution10.solution( reader );

        // then
        assertEquals( "0 1 2 3 2 1 0 ", solution );
    }

}