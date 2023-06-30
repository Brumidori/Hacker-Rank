package problemSolving;

import java.util.List;

public class SubarrayDivision {

    //Two children, Lily and Ron, want to share a chocolate bar. Each of the squares has an integer on it.
    //
    //Lily decides to share a contiguous segment of the bar selected such that:
    //
    //The length of the segment matches Ron's birth month, and,
    //The sum of the integers on the squares is equal to his birth day.
    //Determine how many ways she can divide the chocolate.

    public static int birthday(List<Integer> s, int d, int m) {
        int result =0;
        for(int i = 0; i <= s.size()-m; i++) {
            int sum =0;
            for(int k =i; k<=i+m-1; k++){
                sum +=s.get(k);
            }
            if(sum == d){
                result++;
            }
        }

        return result;

    }

}

