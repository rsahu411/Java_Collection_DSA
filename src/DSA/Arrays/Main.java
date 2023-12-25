package DSA.Arrays;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Arrays arrays = new Arrays();



        // Sum of two arrays
        int[] a = {9,9,9};
        int[] b = {2,4,5,6};
        ArrayList<Integer> ans = arrays.sumTwoArrays(a,b);
        System.out.println("sum of two arrays is");
        ans.forEach(ele-> System.out.print(ele+" "));
    }
}
