package sgyj.inflearn.seunggu.section10;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Solution4 {

  private static int[] dp;

  public static void main(String[] args){
  	try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
    	int count = Integer.parseInt(reader.readLine());
      	dp = new int[count+1];
      	List<Block> blocks = new ArrayList<>();
      	for(int i=0; i<count; i++) {
        	blocks.add(
              Block.of(
                	Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray()
              	)
              );
        }
          Collections.sort(blocks, Collections.reverseOrder());
      	dp[0] = blocks.get(0).getHeight();
      	int answer = 0;
      	for(int i=1; i<blocks.size(); i++) {
        	Block block = blocks.get(i);
          	int beforeHeight = 0;
          	for(int j = i-1; j >=0; j--) {
              	Block compareBlock = blocks.get(j);
              	if(block.isAvailableHigh(compareBlock)) {
                	beforeHeight = Math.max(dp[j], beforeHeight);
                }
            }
          	dp[i] = beforeHeight + block.getHeight();
          	answer = Math.max(answer, dp[i]);
        }
        System.out.println(answer);
    } catch (IOException e) {
    	e.printStackTrace();
    }
  }

  static class Block implements Comparable<Block>{
    private final int width;
    private final int height;
    private final int weight;

    private Block( int width, int height, int weight ) {
      this.width = width;
      this.height = height;
      this.weight = weight;
    }

    public static Block of( int width, int height, int weight ) {
    	return new Block(width, height, weight);
    }

    public static Block of( int[] array ){
      	if(array.length != 3) throw new RuntimeException("해당 인스턴스는 array에 넓이, 높이, 무게가 포함되어야 합니다.");
    	return new Block( array[0], array[1], array[2] );
    }

    public int getWidth() {
    	return this.width;
    }

    public int getHeight() {
    	return this.height;
    }

    public int getWeight() {
    	return this.weight;
    }

    public boolean isAvailableHigh(Block b) {
      	return this.width < b.width && this.weight < b.weight;
    }

    @Override
      public int compareTo(Block b) {
        return this.width - b.width;
    }
  }
}