package sgyj.inflearn.yeji.section4;

import java.util.Scanner;
import java.util.HashMap;

class Solution4 {

    public static boolean compareResult(int first,int second,HashMap<String,Integer> input2Map,HashMap<String,Integer> compareMap, String input){
        boolean flag = true;
        for(int i=first; i<second; i++){
            String key = String.valueOf(input.charAt(i));
            if(!input2Map.containsKey(key)){
                flag = false;
            }else{
                if(!input2Map.get(key).equals(compareMap.get(key))){
                    flag = false;
                }
            }
        }
        return flag;
    }

    public static int solution(String input,String input2){
        int answer = 0;
        HashMap<String,Integer> input2Map = new HashMap<>();
        for(int i = 0; i<input2.length(); i++){
            String key = String.valueOf(input2.charAt(i));
            if(input2Map.containsKey(key)){
                input2Map.put(key, input2Map.get(key)+1);
            }else{
                input2Map.put(key,1);
            }
        }
        int first = 0;
        int second = 1;
        HashMap<String,Integer> compareMap = new HashMap<>();
        compareMap.put(String.valueOf(input.charAt(first)),1);
        while(second<=input.length()){
            if(second == input.length() && (second-first) % (input2.length()) == 0){
                if(compareResult( first,second,compareMap,input2Map,input )){
                    answer++;
                }
                break;
            }
            if((second-first )% (input2.length() )== 0){
                if(compareResult(first,second,compareMap,input2Map,input)){
                    answer++;
                }
                String key = String.valueOf(input.charAt(first));
                if(compareMap.get(key)>1){
                    compareMap.put(key,compareMap.get(key)-1);
                }else{
                    compareMap.remove(key);
                }
                first++;
            }
            String key = String.valueOf(input.charAt( second ));
            Integer inputValue = compareMap.getOrDefault( key, 0 );
            compareMap.put( key,inputValue+1 );
            second++;
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String input2 = sc.nextLine();
        System.out.println(solution(input,input2));
    }
}