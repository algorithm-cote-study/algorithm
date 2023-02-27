package sgyj.programmers.yeji.hash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 베스트앨범
public class Solution42579 {
    private static int[] solution(String[] genres, int[] plays) {
        List<Integer> answer = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        List<BestAlbum> bestAlbumList = new ArrayList<>();
        for(int i=0; i<genres.length; i++){
            map.put( genres[i], map.getOrDefault( genres[i],0 )+plays[i]);
        }
        for(String key : map.keySet()){
            bestAlbumList.add( new BestAlbum(key,map.get( key )) );
        }
        Collections.sort(bestAlbumList);

        for(BestAlbum b : bestAlbumList){
            List<PlaysGenre> playsGenres = new ArrayList<>();
            for(int i=0; i<genres.length; i++){
                if(genres[i].equals( b.genre )){
                    playsGenres.add( new PlaysGenre( i,plays[i] ) );
                }
            }
            Collections.sort( playsGenres );
            // ** 제한사항 필수확인 **
            // 장르에 속한 곡이 하나라면, 하나의 곡만 선택
            // 해당 제한사항 생각하지 않고 풀어서 50점 맞음
            for(int i=0; i<playsGenres.size(); i++){
                if(i<=1){
                    answer.add(playsGenres.get( i ).index);
                }
            }
        }
        return answer.stream().mapToInt( Integer::valueOf ).toArray();
    }

    public static void main ( String[] args ) {
        String[] geners = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        int[] answer = solution(geners,plays);
        for(int a : answer){
            System.out.print(a + " ");
        }
    }
}

class PlaysGenre implements Comparable<PlaysGenre>{
    int play;
    int index;

    PlaysGenre(int index, int play){
        this.index = index;
        this.play = play;
    }

    @Override
    public int compareTo(PlaysGenre o){
        if(this.play == o.play) return this.index - o.index;
        return o.play - this.play;
    }
}

class BestAlbum implements Comparable<BestAlbum>{
    String genre;
    int count;

    BestAlbum(String genre,int count){
        this.genre = genre;
        this.count = count;
    }

    @Override
    public int compareTo ( BestAlbum o ) {
        return o.count - this.count;
    }

}
