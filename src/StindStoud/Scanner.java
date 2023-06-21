package StindStoud;

public class Scanner {

    public class Solution {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

            Scanner scan = new Scanner(System.in);
            String a = scan.nextLine();
            String b = scan.nextLine();
            String c = scan.nextLine();

            System.out.println("String: " + c);
            System.out.println("Double: " + Double.parseDouble(b));
            System.out.println("Int: " + Integer.parseInt(a));
        }
    }
}
