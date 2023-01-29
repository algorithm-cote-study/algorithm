package sgyj.inflearn.yeji.section3;

import static org.junit.jupiter.api.Assertions.*;
import static sgyj.inflearn.yeji.section3.Solution1.solution;

import java.io.BufferedReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sgyj.inflearn.common.TestFileUtil;

@DisplayName( "두 배열 합치기" )

class Solution12Test {

    @Test
    @DisplayName( "두 배열 합치기 테스트 케이스 0" )
    void test_case_0 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/section3/solution1/test_case0.txt" );
        // when
        String solution = solution( reader );

        // then
        assertEquals( "1 2 3 3 5 6 7 9 ", solution );

    }

    @Test
    @DisplayName( "두 배열 합치기 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/section3/solution1/test_case1.txt" );
        // when
        String solution = solution( reader );

        // then
        assertEquals( "1 7 10 27 39 50 51 61 65 65 66 70 70 82 93 93 93 ", solution );

    }

    @Test
    @DisplayName( "두 배열 합치기 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/section3/solution1/test_case2.txt" );
        // when
        String solution = solution( reader );

        // then
        assertEquals( "1 14 15 24 27 29 35 38 40 45 50 58 63 69 70 74 75 78 82 96 97 99 ", solution );

    }

    @Test
    @DisplayName( "두 배열 합치기 테스트 케이스 3" )
    void test_case_3 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/section3/solution1/test_case3.txt" );
        // when
        String solution = solution( reader );

        // then
        assertEquals( "1 5 9 12 14 19 20 20 22 26 28 30 30 34 36 41 45 47 53 53 55 56 58 59 63 65 65 66 67 67 70 72 74 76 77 77 78 78 79 81 82 84 84 88 89 90 91 93 96 97 ", solution );

    }

    @Test
    @DisplayName( "두 배열 합치기 테스트 케이스 4" )
    void test_case_4 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/section3/solution1/test_case4.txt" );
        // when
        String solution = solution( reader );

        // then
        assertEquals( "1 3 3 5 7 7 7 9 9 9 10 10 10 11 11 12 13 13 13 15 16 16 18 21 22 22 23 23 25 26 26 26 26 26 27 27 28 30 30 31 31 32 32 33 33 34 35 35 37 39 40 40 41 42 42 45 47 48 48 49 49 49 50 50 50 51 52 52 53 55 55 57 58 59 59 60 61 61 61 64 64 65 65 65 66 67 68 69 69 70 70 70 74 75 78 80 80 81 81 82 82 82 82 83 83 83 84 84 85 85 85 86 86 88 89 90 91 91 92 92 92 93 93 94 94 95 95 96 97 98 ", solution );

    }

    @Test
    @DisplayName( "두 배열 합치기 테스트 케이스 5" )
    void test_case_5 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/section3/solution1/test_case5.txt" );
        // when
        String solution = solution( reader );

        // then
        assertEquals( "1 2 4 4 5 6 6 7 7 7 8 8 9 9 9 12 12 13 13 13 14 14 15 16 16 16 16 16 17 17 17 17 18 21 21 21 22 22 23 23 23 23 24 24 24 25 25 25 26 26 26 26 26 27 27 28 28 28 28 28 29 29 30 31 31 31 32 32 32 32 33 33 33 34 34 35 35 35 36 38 38 38 38 38 39 40 41 41 42 42 43 43 43 43 44 44 47 48 50 51 51 51 51 51 52 53 56 56 56 56 56 56 56 57 57 57 58 59 60 60 61 62 63 63 65 65 65 66 66 66 66 66 66 67 68 68 73 74 76 76 77 77 77 78 78 79 80 81 82 82 82 83 84 85 86 86 87 88 89 89 90 90 90 91 91 91 91 91 91 91 91 92 92 92 93 94 95 95 95 95 96 96 97 97 97 98 99 99 100 100 ", solution );
    }

}