package class_17_03_22.challengeInClass_1;

import java.util.Arrays;

public class ArraySortManual {


    public int[] automaticSort(int[] n){

        Arrays.sort(n);

        return n;
    }

    public int[] sort(int[] n){


        for(int i = 0; i < n.length -1; i++) {
            for (int x = 0; x < n.length -i -1; x++)
            if(n[x] > n[x+1]){
                int temp = n[x+1];
                n[x+1] = n[x];
                n[x] = temp;
            }
        }

        return n;



    }


}
