package sgyj.programmers.yeji.section8;

public class Solution43165 {
    private static int answer = 0;

    public static int solution(int[] numbers, int target) {

        dfs(0,numbers[0], numbers,target);
        dfs(0,-numbers[0], numbers,target);

        return answer;
    }

    public static void dfs(int index, int cur,int[] numbers, int target){
        if(index == numbers.length-1){
            if(target==cur) answer++;
            return;
        }else{
            index++;
            dfs(index,cur+(-numbers[index]),numbers,target);
            dfs(index,cur+(numbers[index]),numbers,target);
        }
    }

    public static void main ( String[] args ) {
        int[] numbers = {4, 1, 2, 1};
        int target = 4;
        System.out.println(solution(numbers,target));
    }
}
