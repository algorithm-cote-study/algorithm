package sgyj.thisiscodingtest.greedy;

public class Main1 {

    // 그리디가 가능한 것은 가장 작은 화폐가 모든 화폐의 최소공배수이기 때문이다.
    // 화폐의 단위가 무작위로 주어진다면 다이나믹 프로그래밍으로 해결해야 한다.
    public static void main ( String[] args ) {
        int n = 1260;
        int count = 0;

        // 큰 단위의 화폐부터 차례대로 확인
        int [] coin_types = new int[]{500, 100, 50, 10};

        for( int coin : coin_types) {
            count += n / coin; // 해당 화폐로 거슬로 줄 수 있는 동전의 개수 세기
            n %= coin;
        }

        System.out.println(count);
    }
}
