package sorts;

import my_pairs.Pair;

import java.util.ArrayList;
import java.util.List;

/**
 * Козловский Никита. 2 курс, 5 нруппа.
 */
public class BubbleSort implements Sort {
    @Override
    public List<Pair<Integer>> getData() {
        List<Pair<Integer>> x = new ArrayList<>();
        x.add(new Pair<>(2, 14));

        x.add(new Pair<>(3, 15));
        x.add(new Pair<>(4, 24));
        x.add(new Pair<>(5, 34));
        x.add(new Pair<>(6, 36));
        x.add(new Pair<>(7, 22));
        x.add(new Pair<>(8, 45));
        x.add(new Pair<>(9, 43));
        x.add(new Pair<>(10, 17));
        x.add(new Pair<>(11, 29));
        x.add(new Pair<>(12, 25));
        return x;
    }
}
