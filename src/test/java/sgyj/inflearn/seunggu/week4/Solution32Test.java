package sgyj.inflearn.seunggu.week4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sgyj.inflearn.common.TestFileUtil;

@DisplayName( "아나그램(해쉬)" )
class Solution32Test {

    @Test
    @DisplayName( "아나그램(해쉬) 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution32/test_case1.txt" );
        // when
        String solution = Solution32.solution( reader );

        // then
        assertEquals( "YES", solution );

    }

    @Test
    @DisplayName( "아나그램(해쉬) 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution32/test_case2.txt" );
        // when
        String solution = Solution32.solution( reader );

        // then
        assertEquals( "NO", solution );

    }

    @Test
    @DisplayName( "아나그램(해쉬) 테스트 케이스 3" )
    void test_case_3 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution32/test_case3.txt" );
        // when
        String solution = Solution32.solution( reader );

        // then
        assertEquals( "YES", solution );

    }

    @Test
    @DisplayName( "아나그램(해쉬) 테스트 케이스 4" )
    void test_case_4 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution32/test_case4.txt" );
        // when
        String solution = Solution32.solution( reader );

        // then
        assertEquals( "NO", solution );

    }

    @Test
    @DisplayName( "아나그램(해쉬) 테스트 케이스 5" )
    void test_case_5 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution32/test_case5.txt" );
        // when
        String solution = Solution32.solution( reader );

        // then
        assertEquals( "YES", solution );

    }
}