package Sorting;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by tr on 6.11.2018.
 * author:oguzcanerten
 */
public class Main {
    public static void main(String[] args){
    for (int size=10;size<100_000_0000;size*=2){
        testTimeForSize(size);
    }
    }
    public static void testTimeForSize(int size){
        int[] a = generateRandomIntArray(1000);
        long start = System.currentTimeMillis();
        //InsertionSort.sort(a);
        Arrays.sort(a);
        long end = System.currentTimeMillis();
        System.out.println("Time Elapsed("+size+"): "+ (end - start)/1000.0F);
    }

    public static int[] generateRandomIntArray(int size){ //random array uretme
        int[] a = new int [size];
        Random random = new Random();
        for(int i = 0;i<size;i++){
        a[i] = random.nextInt();
        }
     return a;

    }
}
