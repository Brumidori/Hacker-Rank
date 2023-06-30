package problemSolving;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BetweenTwoSets {
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Integer min = Collections.min(a);
        Integer max = Collections.max(b);
        for (int i = min; i <= max; i++) {
            int finalI = i;
            if (a.stream().allMatch(aa -> finalI % aa == 0))
                set1.add(i);
        }
        for (int i = min; i <= max; i++) {
            int finalI = i;
            if (b.stream().allMatch(bb -> bb % finalI == 0))
                set2.add(i);
        }
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        return intersection.size();
    }
}
