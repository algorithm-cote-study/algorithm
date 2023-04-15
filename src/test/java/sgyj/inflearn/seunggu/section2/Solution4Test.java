package sgyj.inflearn.seunggu.section2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sgyj.common.TestFileUtil;

@DisplayName( "피보나치 수열" )
class Solution4Test {
    
    @Test
    @DisplayName( "피보나치 수열 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        // given
        File file = TestFileUtil.getFile( this.getClass(), "static/section2/solution4/test_case1.txt" );
        BufferedReader reader = new BufferedReader( new FileReader( file ) );
        // when
        String solution = Solution4.solution( reader );

        // then
        assertEquals( "1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 ", solution );

    }

    @Test
    @DisplayName( "피보나치 수열 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        // given
        File file = TestFileUtil.getFile( this.getClass(), "static/section2/solution4/test_case2.txt" );

        BufferedReader reader = new BufferedReader( new FileReader( file ) );
        // when
        String solution = Solution4.solution( reader );

        // then
        assertEquals( "1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 ", solution );

    }

    @Test
    @DisplayName( "피보나치 수열 테스트 케이스 3" )
    void test_case_3 () throws Exception {
        // given
        File file = TestFileUtil.getFile( this.getClass(), "static/section2/solution4/test_case3.txt" );
        BufferedReader reader = new BufferedReader( new FileReader( file ) );
        // when
        String solution = Solution4.solution( reader );

        // then
        assertEquals( "1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 10946 17711 28657 ", solution );

    }

    @Test
    @DisplayName( "피보나치 수열 테스트 케이스 4" )
    void test_case_4 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/section2/solution4/test_case4.txt" );

        // when
        String solution = Solution4.solution( reader );

        // then
        assertEquals( "1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 10946 17711 28657 46368 75025 121393 196418 317811 514229 832040 1346269 2178309 3524578 5702887 9227465 ", solution );

    }

    @Test
    @DisplayName( "피보나치 수열 테스트 케이스 5" )
    void test_case_5 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/section2/solution4/test_case5.txt" );

        // when
        String solution = Solution4.solution( reader );

        // then
        assertEquals( "1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 10946 17711 28657 46368 75025 121393 196418 317811 514229 832040 1346269 2178309 3524578 5702887 9227465 14930352 24157817 39088169 63245986 102334155 165580141 267914296 433494437 ", solution );
    }

}