package Loops;

import java.util.Scanner;

public class While {

    public class Solution {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);
            int count = 1;
            while(sc.hasNext()){
                String str = sc.nextLine();
                System.out.println(count + " " +str);
                count++;
            }
        }
    }
}
