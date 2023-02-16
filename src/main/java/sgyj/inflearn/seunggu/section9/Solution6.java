package sgyj.inflearn.seunggu.section9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution6 {

    private static int[] checked;

    /**
     * @title : 친구인가? (Disjoint-Set : Union&Find)
     * @description : 오늘은 새 학기 새로운 반에서 처음 시작하는 날이다. 현수네 반 학생은 N명이다. 현수는 각 학생들의 친구관계를 알고 싶다.
     *                모든 학생은 1부터 N까지 번호가 부여되어 있고, 현수에게는 각각 두 명의 학생은 친구 관계가 번호로 표현된 숫자쌍이 주어진다.
     *                만약 (1, 2), (2, 3), (3, 4)의 숫자쌍이 주어지면 1번 학생과 2번 학생이 친구이고, 2번 학생과 3번 학생이 친구, 3번 학생과 4번 학생이 친구이다.
     *                그리고 1번 학생과 4번 학생은 2번과 3번을 통해서 친구관계가 된다.
     *                학생의 친구관계를 나타내는 숫자쌍이 주어지면 특정 두 명이 친구인지를 판별하는 프로그램을 작성하세요.
     *                두 학생이 친구이면 “YES"이고, 아니면 ”NO"를 출력한다.
     * @input : 첫 번째 줄에 반 학생수인 자연수 N(1<=N<=1,000)과 숫자쌍의 개수인 M(1<=M<=3,000)이 주어지고,
     *          다음 M개의 줄에 걸쳐 숫자쌍이 주어진다.
     *          마지막 줄에는 두 학생이 친구인지 확인하는 숫자쌍이 주어진다.
     * @output : 첫 번째 줄에 “YES"또는 "NO"를 출력한다.
     */
    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader(System.in ) ) ) {
            System.out.println(solution( reader ));
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    static String solution ( BufferedReader reader ) throws IOException {
        String[] lines = reader.readLine().split(" ");
        int n = Integer.parseInt(lines[0]);
        int m = Integer.parseInt(lines[1]);
        checked = new int[n+1];
        int[] friend;
        for(int i=1; i<=n; i++) checked[i] = i;
        for(int i=0; i< m; i++) {
            friend = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            union( friend[0], friend[1] );
        }
        friend = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        if( find( friend[0]) != find( friend[1])) {
            return "NO";
        }
        return "YES";
    }

    static int find(int a) {
        if( a == checked[a]) return a;
        checked[a] = find(checked[a]);
        return checked[a];
    }

    static void union(int a, int b) {
        int findA = find(a);
        int findB = find(b);
        if(findA != findB) checked[findA] = findB;
    }

}
