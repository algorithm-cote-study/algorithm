package sgyj;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main ( String[] args ) {

        int[] array = new int[] {8, 5, 6, 2, 4};
        for(int i=1; i<array.length; i++) {
            int temp = array[i];
            for(int j=i-1; j >= 0; j--) {
                int compare = array[j];
                if(compare <= temp)break;
                array[j+1] = compare;
                array[j] = temp;
            }
        }

        List<String> objects = new ArrayList<>();

        for(int i=0; i< array.length; i++) {
            System.out.println(array[i]);
        }

    }


}