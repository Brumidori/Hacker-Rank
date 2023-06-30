package problemSolving;

public class NumberLineJumps {
    class Result {

        /*
         * Complete the 'kangaroo' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts following parameters:
         *  1. INTEGER x1
         *  2. INTEGER v1
         *  3. INTEGER x2
         *  4. INTEGER v2
         */

        public static String kangaroo(int x1, int v1, int x2, int v2) {
            if((x2 > x1 && v2 >= v1) || (x1 > x2 && v1 >= v2)){
                return "NO";
            } else if(v2 - v1 == 0){
                return "NO";
            }
            else{
                while(x2> x1){
                    x2 = x2+v2;
                    x1 = x1+v1;
                    if(x2 ==x1){
                        return "YES";
                    }
                }
                while(x2 < x1){
                    x2 = x2+v2;
                    x1 = x1+v1;
                    if(x2 ==x1){
                        return "YES";
                    }
                }
                return "NO";
            }
        }

    }
}
