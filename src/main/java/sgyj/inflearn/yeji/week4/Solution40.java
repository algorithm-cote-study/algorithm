package sgyj.inflearn.yeji.week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution40 {

    public static int solution(int n,int target, int[] hwanja){
        int answer = 0;
        List<Integer> compare = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for(int i =0; i<hwanja.length; i++){
            compare.add(i);
        }
        int front = 0;
        int rear = n-1;
        while(!compare.isEmpty()){
            if(rear == front){
                result.add(compare.get(front));
                compare.remove(0);
                rear = compare.size()-1;
            }
            if(rear<0) break;
            if(hwanja[compare.get(front)]<hwanja[compare.get(rear)]){
                int c = compare.get(front);
                compare.remove(0);
                compare.add(c);
                rear = compare.size()-1;
            }
            rear--;
        }
        for(int i = 0; i<result.size(); i++){
            if(target==result.get( i )){
                answer=i+1;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] input1 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] input2 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(solution(input1[0],input1[1],input2));
    }

}
