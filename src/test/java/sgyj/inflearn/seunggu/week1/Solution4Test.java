package sgyj.inflearn.seunggu.week1;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sgyj.inflearn.common.TestFileUtil;

@DisplayName( "단어 뒤집기" )
class Solution4Test {

    @Test
    @DisplayName( "단어 뒤집기 케이스 1" )
    void test_case_1 () throws Exception {
        // given
        File file = TestFileUtil.getFile( this.getClass(), "static/solution4/test_case1.txt" );
        BufferedReader reader = new BufferedReader( new FileReader( file ) );
        // when
        String solution = Solution4.solution( reader );

        // then
        assertEquals( """
                          doog
                          emiT
                          giB
                          """, solution );

    }

    @Test
    @DisplayName( "단어 뒤집기 케이스 2" )
    void test_case_2 () throws Exception {
        // given
        File file = TestFileUtil.getFile( this.getClass(), "static/solution4/test_case2.txt" );

        BufferedReader reader = new BufferedReader( new FileReader( file ) );
        // when
        String solution = Solution4.solution( reader );

        // then
        assertEquals( """
                          gjkd
                          gdjkkG
                          AGGAkgdjkjGSGD
                          dkljkLHLKJKkd
                          LHKLJKLJKLH
                          """, solution );

    }

    @Test
    @DisplayName( "단어 뒤집기 케이스 3" )
    void test_case_3 () throws Exception {
        // given
        File file = TestFileUtil.getFile( this.getClass(), "static/solution4/test_case3.txt" );
        BufferedReader reader = new BufferedReader( new FileReader( file ) );
        // when
        String solution = Solution4.solution( reader );

        // then
        assertEquals( """
                          gjkd
                          gdjkkG
                          AGGAkgdjkjGSGD
                          dkljkLHLKJKkd
                          LHKLJKLJKLH
                          KJKLJLJLJKslhgkjkd
                          HJKHJKHJKHJKHJKHJKHJKGHBNkd
                          """, solution );

    }

    @Test
    @DisplayName( "단어 뒤집기 케이스 4" )
    void test_case_4 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution4/test_case4.txt" );

        // when
        String solution = Solution4.solution( reader );

        // then
        assertEquals( """
                          gjkd
                          gdjkkG
                          AGGAkgdjkjGSGD
                          dkljkLHLKJKkd
                          LHKLJKLJKLH
                          KJKLJLJLJKslhgkjkd
                          HJKHJKHJKHJKHJKHJKHJKGHBNkd
                          jglkjd
                          kldjlkjklgjks
                          klgjdk
                          """, solution );

    }

    @Test
    @DisplayName( "단어 뒤집기 케이스 5" )
    void test_case_5 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "static/solution4/test_case5.txt" );

        // when
        String solution = Solution4.solution( reader );

        // then
        assertEquals( """
                          gjkd
                          gdjkkG
                          AGGAkgdjkjGSGD
                          dkljkLHLKJKkd
                          LHKLJKLJKLH
                          KJKLJLJLJKslhgkjkd
                          HJKHJKHJKHJKHJKHJKHJKGHBNkd
                          jglkjd
                          kldjlkjklgjks
                          klgjdk
                          gdgjkd
                          gdgsgdjkkG
                          sgdAGGAkgdjkjGSGD
                          gsdkljkLHLKJKkd
                          gsLHKLJKLJKLH
                          sgsKJKLJLJLJKslhgkjkd
                          gsHJKHJKHJKHJKHJKHJKHJKGHBNkd
                          gsjglkjd
                          hskldjlkjklgjks
                          sgbsklgjdk
                          """, solution );
    }

}