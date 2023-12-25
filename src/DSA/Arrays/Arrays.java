package DSA.Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Arrays {

    public ArrayList<Integer> sumTwoArrays(int[] a, int[] b) {
        // code here
        ArrayList<Integer> ans = new ArrayList<Integer>();

        int i=a.length-1;       // start from end
        int j=b.length-1;

        int carry=0;

        // If size of a[] and b[] are equal
        while(i>=0 && j>=0)
        {
            int sum = a[i] + b[j] + carry;
            int digit= sum%10;
            carry = sum/10;
            ans.add(digit);
            i--;
            j--;
        }
        // If size of a[] > than that of b[]
        while(i>=0)
        {
            int sum = a[i] + carry;
            int digit= sum%10;
            carry = sum/10;
            ans.add(digit);
            i--;
        }
        // If size of a[] > than that of b[]
        while(j>=0)
        {
            int sum = b[j] + carry;
            int digit= sum%10;
            carry = sum/10;
            ans.add(digit);
            j--;
        }
        // If carry is not 0
        while(carry!=0)
        {
            int sum = carry;
            int digit= sum%10;
            carry = sum/10;
            ans.add(digit);
        }
        Collections.reverse(ans);
        return ans;
    }
}
