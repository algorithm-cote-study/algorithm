package sgyj.inflearn.seunggu.section6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sgyj.common.TestFileUtil;

@DisplayName( "삽입 정렬" )
class Solution3Test {

    @Test
    @DisplayName( "삽입 정렬 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        String solution = getSolution( "static/section6/solution3/test_case1.txt" );

        // then
        assertEquals( "1 2 3 4 5 6 7 8 9 ", solution );

    }

    private String getSolution ( String fileName ) throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), fileName );
        // when
        return Solution3.solution( reader );
    }

    @Test
    @DisplayName( "삽입 정렬 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        // given
        String solution = getSolution( "static/section6/solution3/test_case2.txt" );

        // then
        assertEquals( "53 56 56 62 64 68 68 69 89 93 ", solution );

    }

    @Test
    @DisplayName( "삽입 정렬 테스트 케이스 3" )
    void test_case_3 () throws Exception {
        // given
        String solution = getSolution( "static/section6/solution3/test_case3.txt" );

        // then
        assertEquals( "50 53 54 55 55 55 56 61 67 68 69 72 72 73 74 75 75 77 80 82 82 82 82 85 88 91 92 93 95 98 ", solution );

    }

    @Test
    @DisplayName( "삽입 정렬 테스트 케이스 4" )
    void test_case_4 () throws Exception {
        // given
        String solution = getSolution( "static/section6/solution3/test_case4.txt" );

        // then
        assertEquals( "50 50 50 51 52 53 54 54 55 56 57 58 58 58 62 63 63 63 64 65 65 66 66 67 69 70 71 72 74 75 75 76 77 78 81 81 82 85 85 87 88 88 88 88 89 90 90 90 91 92 93 94 94 95 96 96 97 97 98 99 ", solution );

    }

    @Test
    @DisplayName( "삽입 정렬 테스트 케이스 5" )
    void test_case_5 () throws Exception {
        // given
        String solution = getSolution( "static/section6/solution3/test_case5.txt" );

        // then
        assertEquals( "50 50 51 52 52 52 52 53 54 54 55 55 56 57 59 60 61 61 61 61 62 62 63 64 65 66 67 67 70 71 71 72 72 72 72 73 74 75 77 78 78 78 79 79 79 80 80 80 81 81 81 82 82 83 83 84 85 86 87 87 88 88 90 91 91 91 91 91 91 91 92 92 92 92 93 93 93 93 93 94 95 95 95 95 96 97 99 99 99 99 ", solution );

    }

}