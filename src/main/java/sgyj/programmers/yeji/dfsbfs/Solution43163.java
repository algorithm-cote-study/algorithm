package sgyj.programmers.yeji.dfsbfs;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution43163 {
    private static boolean[] visited;
    private static int answer = 1;

    public static int solution(String begin, String target, String[] words) {
        int n = words.length;
        visited = new boolean[n];
        Deque<Word> q = new ArrayDeque<>();
        q.offer( new Word( begin,0 ) );
        while ( !q.isEmpty() ){
            int len = q.size();
            for(int i=0; i<len; i++){
                Word cur = q.poll();
                if(cur.count <= n){
                    for(String compare : words){
                        if(compareAlphabet(cur.word,compare)){
                            if(compare.equals( target )) return cur.count+1;
                            q.offer( new Word( compare,cur.count+1 ) );
                        }
                    }
                }

            }
        }

        return 0;
    }

    private static boolean compareAlphabet(String word, String compare){
        int count = 0;
        for(int i=0; i<word.length(); i++){
            if(word.charAt( i ) != compare.charAt( i )){
                count++;
            }
        }

        return count == 1;
    }


    public static void main ( String[] args ) {
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log"};
        System.out.println(solution(begin,target,words));
    }
}

class Word{
    String word;
    int count;

    Word(String word, int count){
        this.word = word;
        this.count = count;
    }
}
