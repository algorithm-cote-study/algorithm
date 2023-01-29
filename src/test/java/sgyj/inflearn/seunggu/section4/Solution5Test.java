package sgyj.inflearn.seunggu.section4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sgyj.inflearn.common.TestFileUtil;

@DisplayName( "K번째 큰수" )
class Solution5Test {
    
    @Test
    @DisplayName( "K번째 큰수 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/section4/solution5/test_case1.txt" );
        // when
        int solution = Solution5.solution( reader );

        // then
        assertEquals( 143, solution );

    }

    @Test
    @DisplayName( "K번째 큰수 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/section4/solution5/test_case2.txt" );
        // when
        int solution = Solution5.solution( reader );

        // then
        assertEquals( -1, solution );

    }

    @Test
    @DisplayName( "K번째 큰수 테스트 케이스 3" )
    void test_case_3 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/section4/solution5/test_case3.txt" );
        // when
        int solution = Solution5.solution( reader );

        // then
        assertEquals( 141, solution );

    }

    @Test
    @DisplayName( "K번째 큰수 테스트 케이스 4" )
    void test_case_4 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/section4/solution5/test_case4.txt" );
        // when
        int solution = Solution5.solution( reader );

        // then
        assertEquals( 133, solution );

    }

    @Test
    @DisplayName( "K번째 큰수 테스트 케이스 5" )
    void test_case_5 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/section4/solution5/test_case5.txt" );
        // when
        int solution = Solution5.solution( reader );

        // then
        assertEquals( 132, solution );

    }

}