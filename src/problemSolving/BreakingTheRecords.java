package problemSolving;

import javax.xml.transform.Result;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class BreakingTheRecords {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        ArrayList<Integer> records = new ArrayList<Integer>();
        int min = scores.get(0);
        int max = scores.get(0);
        int brokeMin = 0;
        int brokeMax =0;
        for(int i = 1; i < scores.size(); i ++){
            if(scores.get(i) < min ){
                brokeMin++;
                min = scores.get(i);
            }
            if(scores.get(i) >max ){
                brokeMax++;
                max =scores.get(i);
            }
        }

        records.add(brokeMax);
        records.add(brokeMin);

        return records;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.breakingRecords(scores);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

