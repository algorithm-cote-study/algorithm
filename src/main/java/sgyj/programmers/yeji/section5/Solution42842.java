package sgyj.programmers.yeji.section5;

public class Solution42842 {
    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int karo = yellow;
        int sero = 1;

        while(sero <= karo){
            int comapreBrown =  (karo * 2) + (2 * sero) + 4;
            if(comapreBrown == brown){
                answer[0] = karo+2;
                answer[1] = sero+2;
                return answer;
            }
            sero++;
            karo = (yellow / sero) + (yellow % sero);
        }

        return answer;
    }

    public static void main ( String[] args ) {
        int brown = 10;
        int yellow = 2;
        for(int s : solution(brown,yellow)){
            System.out.print( s + " " );
        }
    }
}
