package sgyj.backjun.yeji.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;



// 창고 다각형
public class Main2034 {

    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int answer = 0;
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        int n = Integer.parseInt( br.readLine() );
        int[] arr = new int[1001];
        int start = Integer.MAX_VALUE;
        int end = 0;
        for(int i=0; i<n; i++){
            StringTokenizer stringTokenizer = new StringTokenizer( br.readLine() );
            int L = Integer.parseInt( stringTokenizer.nextToken() );
            int H = Integer.parseInt( stringTokenizer.nextToken() );
            arr[L] = H;
            start = Math.min( L,start );
            end = Math.max( L, end );

        }

        Stack<Integer> height = new Stack<>();
        //왼쪽 비교
        int temp = arr[start];
        for (int i = start + 1; i <= end; i++) {
            if(arr[i] < temp)  {
                height.push(i);
            }
            else {
                while (!height.isEmpty()) {
                    int x = height.pop();
                    arr[x] = temp;
                }
                temp = arr[i];
            }
        }
        height.clear();

        //오른쪽 비교
        temp=arr[end];
        for(int i = end - 1; i >= start; i--){
            if(arr[i] < temp) height.push(i);
            else {
                while (!height.isEmpty()) {
                    int x = height.pop();
                    arr[x]=temp;
                }
                temp=arr[i];
            }
        }

        int result = 0;
        for (int i = start; i <= end; i++) {
            result += arr[i];
        }

        sb.append(result).append("\n");
        System.out.print(sb);
    }
}
