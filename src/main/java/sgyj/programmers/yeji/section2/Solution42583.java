package sgyj.programmers.yeji.section2;

import java.util.ArrayDeque;
import java.util.Deque;

// 다리를 지나는 트럭
public class Solution42583 {

    private static int solution(int bridge_length, int weight, int[] truck_weights){
        int answer = 0;

        Deque<Integer> q = new ArrayDeque<>();
        int sum = 0; // 다리를 건너는 트럭들의 무게 합

        for(int t : truck_weights) {

            while(true) {
                //큐가 비어있다면 다음 트럭 삽입
                if(q.isEmpty()) {
                    q.offer(t);
                    sum += t;
                    answer++;
                    break;
                }
                //큐의 사이즈와 다리의 길이가 같다면 큐에서 큐에서 처음 값을 빼고 최대 무게 -
                else if(q.size() == bridge_length) {
                    sum -= q.poll();
                }
                //큐가 비어있지 않을 때
                else {
                    //다음 트럭이 최대 무게 초과
                    if(sum + t > weight) {
                        q.offer(0);
                        answer++;
                    }
                    //다음 트럭이 최대 무게 이내
                    else {
                        q.offer(t);
                        sum += t;
                        answer++;
                        break;
                    }
                }
            }
        }

        //걸린 시간 + 마지막 트럭의 통과시간(다리의 길이)
        return answer + bridge_length;
    }


    public static void main ( String[] args ) {
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7,4,5,6};
        System.out.println(solution(bridge_length,weight,truck_weights));
    }
}

class Truck{
    int weight;
    int distance;

    Truck(int weight, int distance){
        this.weight = weight;
        this.distance = distance;
    }
}
