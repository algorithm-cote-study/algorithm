package sgyj.inflearn.seunggu.section2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sgyj.inflearn.common.TestFileUtil;

@DisplayName( "가위 바위 보" )
class Solution3Test {

    @Test
    @DisplayName( "가위 바위 보 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution15/test_case1.txt" );

        // when
        String solution = Solution3.solution( reader );

        // then
        assertEquals( """
                          A
                          B
                          A
                          D
                          A
                          D
                          A
                          B
                          A
                          A
                          """, solution );

    }

    @Test
    @DisplayName( "가위 바위 보 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution15/test_case2.txt" );

        // when
        String solution = Solution3.solution( reader );

        // then
        assertEquals( """
                          B
                          B
                          A
                          B
                          D
                          B
                          A
                          D
                          D
                          B
                          B
                          B
                          A
                          A
                          A
                          B
                          D
                          D
                          A
                          D
                          A
                          A
                          D
                          B
                          B
                          D
                          B
                          A
                          B
                          A
                          """, solution );

    }

    @Test
    @DisplayName( "가위 바위 보 테스트 케이스 3" )
    void test_case_3 () throws Exception {
        // given
        File file = TestFileUtil.getFile( this.getClass(), "static/solution15/test_case3.txt" );
        BufferedReader reader = new BufferedReader( new FileReader( file ) );
        // when
        String solution = Solution3.solution( reader );

        // then
        assertEquals( """
                          A
                          D
                          D
                          A
                          A
                          D
                          B
                          B
                          A
                          B
                          A
                          B
                          B
                          D
                          D
                          A
                          B
                          D
                          B
                          B
                          B
                          D
                          D
                          A
                          B
                          A
                          A
                          B
                          A
                          A
                          D
                          D
                          B
                          A
                          D
                          A
                          D
                          B
                          A
                          A
                          D
                          D
                          D
                          D
                          D
                          B
                          D
                          B
                          A
                          A
                          """, solution );

    }

    @Test
    @DisplayName( "가위 바위 보 테스트 케이스 4" )
    void test_case_4 () throws Exception {
        // given
        File file = TestFileUtil.getFile( this.getClass(), "static/solution15/test_case4.txt" );
        BufferedReader reader = new BufferedReader( new FileReader( file ) );
        // when
        String solution = Solution3.solution( reader );

        // then
        assertEquals( """
                          B
                          A
                          D
                          A
                          A
                          B
                          B
                          D
                          B
                          D
                          A
                          D
                          D
                          A
                          A
                          B
                          D
                          D
                          A
                          D
                          D
                          D
                          B
                          A
                          A
                          B
                          A
                          D
                          B
                          A
                          A
                          A
                          B
                          D
                          D
                          B
                          A
                          D
                          B
                          A
                          A
                          B
                          D
                          D
                          A
                          B
                          D
                          D
                          D
                          D
                          D
                          A
                          A
                          D
                          D
                          A
                          B
                          A
                          B
                          D
                          D
                          D
                          A
                          D
                          B
                          D
                          B
                          D
                          D
                          A
                          D
                          D
                          A
                          D
                          D
                          B
                          B
                          B
                          D
                          B
                          """, solution );

    }

    @Test
    @DisplayName( "가위 바위 보 테스트 케이스 5" )
    void test_case_5 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution15/test_case5.txt" );

        // when
        String solution = Solution3.solution( reader );

        // then
        assertEquals( """
                          B
                          D
                          B
                          D
                          D
                          A
                          D
                          B
                          D
                          B
                          D
                          A
                          D
                          D
                          A
                          A
                          B
                          A
                          D
                          D
                          B
                          A
                          D
                          B
                          A
                          A
                          A
                          D
                          B
                          A
                          B
                          D
                          D
                          A
                          D
                          A
                          A
                          B
                          B
                          D
                          D
                          D
                          B
                          A
                          D
                          A
                          B
                          D
                          D
                          A
                          B
                          A
                          A
                          D
                          A
                          B
                          D
                          A
                          A
                          A
                          D
                          B
                          A
                          D
                          A
                          B
                          B
                          B
                          B
                          B
                          B
                          A
                          D
                          B
                          A
                          A
                          B
                          D
                          A
                          A
                          A
                          B
                          D
                          D
                          D
                          B
                          D
                          B
                          B
                          D
                          B
                          A
                          D
                          A
                          B
                          D
                          A
                          B
                          A
                          A
                          """, solution );
    }
    
}