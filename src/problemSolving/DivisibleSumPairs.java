package problemSolving;

import java.util.List;

public class DivisibleSumPairs {

    //Given an array of integers and a positive integer k, determine the number of (i,j) pairs where i < j and
    // ar[i] + ar[j] is divisible by k.

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int result = 0;
        for(int i = 0; i < n-1; i++) {
            int a = ar.get(i);
            for (int j = i+1; j< ar.size(); j++){
                int sum = 0;
                sum =a + ar.get(j);
                if(sum % k ==0){
                    result++;
                }
            }
        }
        return result;
    }
}
