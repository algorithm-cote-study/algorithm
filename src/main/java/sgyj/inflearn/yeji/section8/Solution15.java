package sgyj.inflearn.yeji.section8;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Solution15{

    static boolean[] visited;

    public static void permutaion(List<Point> pizza, int L, int i, int m){
        if(i==m-1) return;
        if(L==m-1){
            for(int p=0; p<pizza.size(); p++){
                if(visited[p] ){
                    Point point = pizza.get( p );
                    int location = Math.abs( point.x-point.y );
                    System.out.print(location + " ");
                }
            }
            System.out.println();
        }else{
            visited[i] = true;
            permutaion(pizza,L+1,i+1,m);
            permutaion(pizza,L,i+1,m);
            visited[i] = false;
        }

    }

    public static void solution(int[][] city,List<Point> pizza, List<Point> house, int m){
        // pizza 경우의수
        visited = new boolean[pizza.size()];
        for(int p=0; p<pizza.size(); p++){
            permutaion(pizza,0,p,m);
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] city = new int[n][n];
        List<Point> pizza = new ArrayList<>();
        List<Point> house = new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                city[i][j] = sc.nextInt();
                if(city[i][j]==1){
                    house.add(new Point(i,j));
                }
                if(city[i][j]==2){
                    pizza.add(new Point(i,j));
                }

            }
        }
        solution(city,pizza,house,m);
    }
}