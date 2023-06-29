package JavaIfElse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class JavaIfElse {
    //Given an integer, , perform the following conditional actions:
    //
    //If  is odd, print Weird
    //If  is even and in the inclusive range of 2 to 5, print Not Weird
    //If  is even and in the inclusive range of 6 to 20, print Weird
    //If  is even and greater than 20, print Not Weird

    public class Solution {
        public static void main(String[] args) throws IOException {

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(bufferedReader.readLine().trim());
            if (n >= 2 && n <= 5 && n % 2 == 0 || n > 20 && n % 2 == 0) {
                System.out.println("Not Weird");
            } else {
                System.out.println("Weird");
            }

            bufferedReader.close();
        }
    }

    public class Solution2 {
        //if else Integer format to String

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            if (n >= -100 && n<= 100){
                String s = Integer.toString(n);
                System.out.println("Good job");
            } else{
                System.out.println("Wrong answer");
            }

        }
    }
}
