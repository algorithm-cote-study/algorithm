package sgyj.inflearn.seunggu.week1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sgyj.inflearn.common.TestFileUtil;

@DisplayName( "대소문자 변환" )
class Solution2Test {

    @Test
    @DisplayName( "대소문자 변환 케이스 1" )
    void test_case_1 () throws Exception {
        // given
        File file = TestFileUtil.getFile( this.getClass(), "static/solution2/test_case1.txt" );
        BufferedReader reader = new BufferedReader( new FileReader( file ) );
        // when
        String solution = Solution2.solution( reader );

        // then
        assertEquals( "sTUdy", solution );

    }

    @Test
    @DisplayName( "대소문자 변환 케이스 2" )
    void test_case_2 () throws Exception {
        // given
        File file = TestFileUtil.getFile( this.getClass(), "static/solution2/test_case2.txt" );

        BufferedReader reader = new BufferedReader( new FileReader( file ) );
        // when
        String solution = Solution2.solution( reader );

        // then
        assertEquals( "DKFhhlKDJLGkhl", solution );

    }

    @Test
    @DisplayName( "대소문자 변환 케이스 3" )
    void test_case_3 () throws Exception {
        // given
        File file = TestFileUtil.getFile( this.getClass(), "static/solution2/test_case3.txt" );
        BufferedReader reader = new BufferedReader( new FileReader( file ) );
        // when
        String solution = Solution2.solution( reader );

        // then
        assertEquals( "ZNLAKhlNVlhhlGKDIEYTyoy", solution );

    }

    @Test
    @DisplayName( "대소문자 변환 케이스 4" )
    void test_case_4 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution2/test_case4.txt" );

        // when
        String solution = Solution2.solution( reader );

        // then
        assertEquals( "DKIEOyoiuoOTOKDJGLJAJyoyohkgHKGlkjlkjGbLKbLlj", solution );

    }

    @Test
    @DisplayName( "대소문자 변환 케이스 5" )
    void test_case_5 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution2/test_case5.txt" );

        // when
        String solution = Solution2.solution( reader );

        // then
        assertEquals( "DJKJGkluoihKJhgyHuyfuygJguyguyFufuguGUyurRuhguyuGUok", solution );
    }
}