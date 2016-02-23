package sorts;

import my_pairs.Pair;

import java.util.ArrayList;
import java.util.List;

/**
 * Козловский Никита. 2 курс, 5 нруппа.
 */
public class CombSort implements Sort {
    @Override
    public List<Pair<Integer>> getData() {
        List<Pair<Integer>> x = new ArrayList<>();
        for (int i=0; i<10;++i){
            x.add(new Pair<>(i, i*i));
        }
        //new data
        return x;
    }
}
