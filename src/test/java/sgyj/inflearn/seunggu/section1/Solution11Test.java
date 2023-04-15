package sgyj.inflearn.seunggu.section1;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sgyj.common.TestFileUtil;

@DisplayName( "문자열 압축" )
class Solution11Test {

    @Test
    @DisplayName( "문자열 압축 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        // given
        File file = TestFileUtil.getFile( this.getClass(), "static/section1/solution11/test_case1.txt" );
        BufferedReader reader = new BufferedReader( new FileReader( file ) );
        // when
        String solution = Solution11.solution( reader );

        // then
        assertEquals( "K2TF6E3", solution );

    }

    @Test
    @DisplayName( "문자열 압축 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        // given
        File file = TestFileUtil.getFile( this.getClass(), "static/section1/solution11/test_case2.txt" );

        BufferedReader reader = new BufferedReader( new FileReader( file ) );
        // when
        String solution = Solution11.solution( reader );

        // then
        assertEquals( "KST3SE2KFK3DJ2G2", solution );

    }

    @Test
    @DisplayName( "문자열 압축 테스트 케이스 3" )
    void test_case_3 () throws Exception {
        // given
        File file = TestFileUtil.getFile( this.getClass(), "static/section1/solution11/test_case3.txt" );
        BufferedReader reader = new BufferedReader( new FileReader( file ) );
        // when
        String solution = Solution11.solution( reader );

        // then
        assertEquals( "KDKGK2SK2FJK4SLS4KFKS4", solution );

    }

    @Test
    @DisplayName( "문자열 압축 테스트 케이스 4" )
    void test_case_4 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/section1/solution11/test_case4.txt" );

        // when
        String solution = Solution11.solution( reader );

        // then
        assertEquals( "K5D5KD3K2SK2FJK4SLS4KFKS4", solution );

    }

    @Test
    @DisplayName( "문자열 압축 테스트 케이스 5" )
    void test_case_5 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/section1/solution11/test_case5.txt" );

        // when
        String solution = Solution11.solution( reader );

        // then
        assertEquals( "K4T3U3KD5KD3K2SK2FJKY3KUY2", solution );
    }

}