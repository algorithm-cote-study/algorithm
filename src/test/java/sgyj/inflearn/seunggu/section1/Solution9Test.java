package sgyj.inflearn.seunggu.section1;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sgyj.common.TestFileUtil;

@DisplayName( "중복문자제거" )
class Solution9Test {

    @Test
    @DisplayName( "중복문자제거 케이스 1" )
    void test_case_1 () throws Exception {
        // given
        File file = TestFileUtil.getFile( this.getClass(), "static/section1/solution9/test_case1.txt" );
        BufferedReader reader = new BufferedReader( new FileReader( file ) );
        // when
        int solution = Solution9.solution( reader );

        // then
        assertEquals( 1000, solution );

    }

    @Test
    @DisplayName( "중복문자제거 케이스 2" )
    void test_case_2 () throws Exception {
        // given
        File file = TestFileUtil.getFile( this.getClass(), "static/section1/solution9/test_case2.txt" );

        BufferedReader reader = new BufferedReader( new FileReader( file ) );
        // when
        int solution = Solution9.solution( reader );

        // then
        assertEquals( 102, solution );

    }

    @Test
    @DisplayName( "중복문자제거 케이스 3" )
    void test_case_3 () throws Exception {
        // given
        File file = TestFileUtil.getFile( this.getClass(), "static/section1/solution9/test_case3.txt" );
        BufferedReader reader = new BufferedReader( new FileReader( file ) );
        // when
        int solution = Solution9.solution( reader );

        // then
        assertEquals( 12, solution );

    }

    @Test
    @DisplayName( "중복문자제거 케이스 4" )
    void test_case_4 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/section1/solution9/test_case4.txt" );

        // when
        int solution = Solution9.solution( reader );

        // then
        assertEquals( 120, solution );

    }

    @Test
    @DisplayName( "중복문자제거 케이스 5" )
    void test_case_5 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/section1/solution9/test_case5.txt" );

        // when
        int solution = Solution9.solution( reader );

        // then
        assertEquals( 134520, solution );
    }

}