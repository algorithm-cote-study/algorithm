package sgyj.backjun.seunggu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main12865 {

    private static int max;
    private static int count;
    public static void main ( String[] args ) {
        try( BufferedReader reader = new BufferedReader(new InputStreamReader( System.in))) {
            int[] numbers = Arrays.stream( reader.readLine().split( " ")).mapToInt( Integer::parseInt).toArray();
            max = numbers[1];
            count = numbers[0];
            Item[] items = getItems( reader, count );
            System.out.println( solution( items ));
            System.out.println(solution2( items ));
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution2( Item[] items ) {
        int[] dp = new int[max+1];
        Arrays.fill( dp, Integer.MIN_VALUE );
        dp[0] = 0;
        for(int i=1; i<items.length; i++) {
            Item item = items[i];
            for(int j=max; j >= item.weight; j--) {
                dp[j] = Math.max( dp[j], dp[j-item.weight] + item.value );
            }
        }
        System.out.println( Arrays.toString( dp ) );
        return dp[max];
    }

    private static int solution ( Item[] items ) {
        int[][] bags = new int[count+1][max+1];

        for( int i=1; i<items.length; i++) {
            Item item = items[i];
            for(int j=1; j<=max; j++) {
                if(j >= item.weight) {
                    bags[i][j] = Math.max(bags[i-1][j - item.weight] + item.value, bags[i-1][j]) ;
                } else {
                    bags[i][j] = bags[i -1][j];
                }
            }
        }
        System.out.println( Arrays.deepToString( bags ) );
        return bags[count][max];
    }

    private static Item[] getItems ( BufferedReader reader, int count ) throws IOException {
        Item[] items = new Item[count+1];
        for(int i=1; i <= count; i++) {
            int[] item = Arrays.stream( reader.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
            items[i] = Item.of(item[0], item[1]);
        }
        return items;
    }

    static class Item implements Comparable<Item>{

        private final int weight;
        private final int value;

        private Item ( int weight, int value ) {
            this.weight = weight;
            this.value = value;
        }

        public static Item of ( int weight, int value ) {
            return new Item( weight, value );
        }

        @Override
        public int compareTo( Item b) {
            return this.weight - b.weight;
        }
    }



}
