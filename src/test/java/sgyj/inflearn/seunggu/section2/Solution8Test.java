package sgyj.inflearn.seunggu.section2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sgyj.inflearn.common.TestFileUtil;

@DisplayName( "등수 구하기" )
class Solution8Test {

    @Test
    @DisplayName( "등수 구하기 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution20/test_case1.txt" );
        // when
        String solution = Solution8.solution( reader );

        // then
        assertEquals( "1 6 4 3 5 2 7 ", solution );

    }

    @Test
    @DisplayName( "등수 구하기 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution20/test_case2.txt" );

        // when
        String solution = Solution8.solution( reader );

        // then
        assertEquals( "21 27 13 26 27 17 23 7 1 25 14 1 1 17 5 24 16 10 20 8 10 4 22 5 12 27 30 8 14 19 ", solution );

    }

    @Test
    @DisplayName( "등수 구하기 테스트 케이스 3" )
    void test_case_3 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution20/test_case3.txt" );

        // when
        String solution = Solution8.solution( reader );

        // then
        assertEquals( "40 44 29 32 41 25 36 25 1 11 33 48 37 23 25 17 11 22 9 25 11 8 44 3 9 5 29 20 19 35 50 41 24 6 41 21 18 38 46 46 6 16 38 29 3 48 33 11 15 2 ", solution );

    }

    @Test
    @DisplayName( "등수 구하기 테스트 케이스 4" )
    void test_case_4 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution20/test_case4.txt" );
        // when
        String solution = Solution8.solution( reader );

        // then
        assertEquals( "59 72 72 21 62 18 76 12 80 65 71 1 57 37 12 57 6 8 8 72 37 35 23 37 23 23 77 48 43 79 68 63 51 51 22 65 8 82 55 47 41 4 84 65 41 86 51 29 23 43 72 90 12 82 33 23 3 48 35 48 51 43 12 80 46 18 33 77 59 89 86 55 64 84 8 4 12 28 29 37 68 2 29 12 68 18 29 86 61 6 ", solution );

    }

    @Test
    @DisplayName( "등수 구하기 테스트 케이스 5" )
    void test_case_5 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution20/test_case5.txt" );

        // when
        String solution = Solution8.solution( reader );

        // then
        assertEquals( "38 20 93 71 51 76 29 3 66 66 66 75 35 81 69 32 89 6 38 88 62 47 46 3 20 29 6 20 93 100 65 80 25 32 35 76 76 35 25 11 47 16 23 71 3 42 56 62 76 81 6 56 6 16 42 42 89 89 96 59 51 1 99 51 28 32 1 61 71 29 25 96 13 89 49 16 85 13 69 16 81 93 42 81 38 56 96 87 38 6 59 50 71 51 62 23 51 13 11 85 ", solution );
    }

    
}