package sgyj.backjun.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main25501 {


    public static void main(String[] args){
    try ( BufferedReader reader = new BufferedReader( new InputStreamReader(System.in) ) ) {
		int count = Integer.parseInt(reader.readLine());
      	int[] arr = Arrays.stream( reader.readLine().split(" ") ).mapToInt(Integer::parseInt).toArray();
        int[] dy =new int[count];
        dy[0] = 1;
        int answer = 0;
        for(int i=1; i< arr.length; i++) {
            int max = 0;
            for(int j=i-1; j>= 0; j--) {
                if(arr[j] < arr[i] && dy[j] > max) max = dy[j];
            }
            dy[i] = max + 1;
            answer = Math.max(answer, dy[i]);
        }
        System.out.println(answer);

    } catch ( IOException e ) {
      e.printStackTrace();
    }
  }
}