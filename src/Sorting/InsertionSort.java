package Sorting;

/**
 * Created by tr on 6.11.2018.
 * author:oguzcanerten
 */
public class InsertionSort {
    public static void sort(int[]a){
        for (int j=1;j<a.length;j++){
            int key = a[j];
            int i = j-1;
            while (i>=0 && a[i]>key){ //yukarıdan asagıya dogru kendinden buyuk mu diye kontrol ede ede gider.
                a[i+1] = a[i];
                i--;
            }
            a[i+1] = key ;
        }
    }
}
