package Loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class forSimples {

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(bufferedReader.readLine().trim());

            for (int i=1; i<=10; i++){
                System.out.println(N + " x " + i + " = " + N*i);
            }

            bufferedReader.close();
        }
    }

    class Solution2{
        public static void main(String []argh){
            Scanner in = new Scanner(System.in);
            int t=in.nextInt();
            for(int i=0;i<t;i++){
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();

                //Solution
                int res = a;

                for (int j=0; j < n; j++) {
                    res += Math.pow(2, j) * b;
                    System.out.print(res + " ");
                }
                System.out.println();
                //End solution

            }

            in.close();
        }
    }
}

 class Solution3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)
                    System.out.println("* byte");
                if (x>= -(1<<15) && x <= ((1<<15)-1))
                    System.out.println("* short");
                if (x>= -(1<<31) && x <= ((1<<31)-1))
                    System.out.println("* int");
                if (x>= -(1L<<63) && x <= ((1L<<63)-1))
                    System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }
}
