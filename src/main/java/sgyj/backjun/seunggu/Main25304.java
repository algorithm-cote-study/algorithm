package sgyj.backjun.seunggu;

import java.io.*;

public class Main25304 {

    public static void main(String[] args) {
        try ( BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int totalCost = Integer.parseInt(reader.readLine());
            int totalAmount = Integer.parseInt(reader.readLine());
            int sumCost = 0;
            for(int i=0; i<totalAmount; i++) {
                String[] items = reader.readLine().split(" ");
                int cost = Integer.parseInt(items[0]);
                int amount = Integer.parseInt(items[1]);
                sumCost += (cost * amount);
            }
            if(totalCost == sumCost) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}