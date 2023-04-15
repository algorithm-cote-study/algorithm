package sgyj.inflearn.seunggu.section1;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sgyj.inflearn.common.TestFileUtil;

@DisplayName( "문장 속 단어" )
class Solution3Test {

    @Test
    @DisplayName( "문장 속 단어 케이스 1" )
    void test_case_1 () throws Exception {
        // given
        File file = TestFileUtil.getFile( this.getClass(), "static/section1/solution3/test_case1.txt" );
        BufferedReader reader = new BufferedReader( new FileReader( file ) );
        // when
        String solution = Solution3.solution( reader );

        // then
        assertEquals( "study", solution );

    }

    @Test
    @DisplayName( "문장 속 단어 케이스 2" )
    void test_case_2 () throws Exception {
        // given
        File file = TestFileUtil.getFile( this.getClass(), "static/section1/solution3/test_case2.txt" );

        BufferedReader reader = new BufferedReader( new FileReader( file ) );
        // when
        String solution = Solution3.solution( reader );

        // then
        assertEquals( "LKKJLJLJLKJLLLLLLL", solution );

    }

    @Test
    @DisplayName( "문장 속 단어 케이스 3" )
    void test_case_3 () throws Exception {
        // given
        File file = TestFileUtil.getFile( this.getClass(), "static/section1/solution3/test_case3.txt" );
        BufferedReader reader = new BufferedReader( new FileReader( file ) );
        // when
        String solution = Solution3.solution( reader );

        // then
        assertEquals( "witouweiotwiowioei", solution );

    }

    @Test
    @DisplayName( "문장 속 단어 케이스 4" )
    void test_case_4 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/section1/solution3/test_case4.txt" );

        // when
        String solution = Solution3.solution( reader );

        // then
        assertEquals( "jddgshsgskjkdj", solution );

    }

    @Test
    @DisplayName( "문장 속 단어 케이스 5" )
    void test_case_5 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/section1/solution3/test_case5.txt" );

        // when
        String solution = Solution3.solution( reader );

        // then
        assertEquals( "loveispower", solution );
    }

}