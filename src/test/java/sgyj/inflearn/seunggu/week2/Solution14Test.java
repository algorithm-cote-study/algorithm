package sgyj.inflearn.seunggu.week2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sgyj.inflearn.common.TestFileUtil;
import sgyj.inflearn.seunggu.week3.Solution24;

@DisplayName( "보이는 학생" )
class Solution14Test {


    @Test
    @DisplayName("보이는 학생 테스트 케이스 1")
    void test_case_1 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution14/test_case1.txt" );
        // when
        int solution = Solution14.solution( reader );
        // then
        assertEquals(4, solution);
    }

    @Test
    @DisplayName("보이는 학생 테스트 케이스 2")
    void test_case_2 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution14/test_case2.txt" );
        // when
        int solution = Solution14.solution( reader );
        // then
        assertEquals(6, solution);
    }

    @Test
    @DisplayName("보이는 학생 테스트 케이스 3")
    void test_case_3 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution14/test_case3.txt" );
        // when
        int solution = Solution14.solution( reader );
        // then
        assertEquals(8, solution);
    }

    @Test
    @DisplayName("보이는 학생 테스트 케이스 4")
    void test_case_4 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution14/test_case4.txt" );
        // when
        int solution = Solution14.solution( reader );
        // then
        assertEquals(13, solution);
    }

    @Test
    @DisplayName("보이는 학생 테스트 케이스 5")
    void test_case_5 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution14/test_case5.txt" );
        // when
        int solution = Solution14.solution( reader );
        // then
        assertEquals(10, solution);
    }

}