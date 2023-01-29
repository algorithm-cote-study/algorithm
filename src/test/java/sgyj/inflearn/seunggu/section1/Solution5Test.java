package sgyj.inflearn.seunggu.section1;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sgyj.inflearn.common.TestFileUtil;

@DisplayName( "특정 문자 뒤집기" )
class Solution5Test {

    @Test
    @DisplayName( "특정 문자 뒤집기 케이스 1" )
    void test_case_1 () throws Exception {
        // given
        File file = TestFileUtil.getFile( this.getClass(), "static/section1/solution5/test_case1.txt" );
        BufferedReader reader = new BufferedReader( new FileReader( file ) );
        // when
        String solution = Solution5.solution( reader );

        // then
        assertEquals( "S#T!EG*b@a", solution );

    }

    @Test
    @DisplayName( "특정 문자 뒤집기 케이스 2" )
    void test_case_2 () throws Exception {
        // given
        File file = TestFileUtil.getFile( this.getClass(), "static/section1/solution5/test_case2.txt" );

        BufferedReader reader = new BufferedReader( new FileReader( file ) );
        // when
        String solution = Solution5.solution( reader );

        // then
        assertEquals( "kdd#@kkgj%$#dkgjd@kj$dk", solution );

    }

    @Test
    @DisplayName( "특정 문자 뒤집기 케이스 3" )
    void test_case_3 () throws Exception {
        // given
        File file = TestFileUtil.getFile( this.getClass(), "static/section1/solution5/test_case3.txt" );
        BufferedReader reader = new BufferedReader( new FileReader( file ) );
        // when
        String solution = Solution5.solution( reader );

        // then
        assertEquals( "kGQdd#@kk#g%$#jdk&&gd@kj$dQqk", solution );

    }

    @Test
    @DisplayName( "특정 문자 뒤집기 케이스 4" )
    void test_case_4 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/section1/solution5/test_case4.txt" );

        // when
        String solution = Solution5.solution( reader );

        // then
        assertEquals( "kGQ!SHDSGDd#@dk#k%$#gjd&&kg@dk$j#%&dSG@!SGDQqk", solution );

    }

    @Test
    @DisplayName( "특정 문자 뒤집기 케이스 5" )
    void test_case_5 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/section1/solution5/test_case5.txt" );

        // when
        String solution = Solution5.solution( reader );

        // then
        assertEquals( "kGQSHD#SG!Dddk#@kgj#@dk#g%$#dkj&&dS@GS$G#%&DQq@!SH%HSHk#", solution );
    }
    
}