package homeworks.lesson11;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class BeerComparator implements Comparator<BeerDemo> {

    @Override
    public int compare(BeerDemo o1, BeerDemo o2) {
        return 0;
    }

    @Override
    public Comparator<BeerDemo> reversed() {
        return null;
    }

    @Override
    public Comparator<BeerDemo> thenComparing(Comparator<? super BeerDemo> other) {
        return null;
    }

    @Override
    public <U> Comparator<BeerDemo> thenComparing(Function<? super BeerDemo, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return null;
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<BeerDemo> thenComparing(Function<? super BeerDemo, ? extends U> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<BeerDemo> thenComparingInt(ToIntFunction<? super BeerDemo> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<BeerDemo> thenComparingLong(ToLongFunction<? super BeerDemo> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<BeerDemo> thenComparingDouble(ToDoubleFunction<? super BeerDemo> keyExtractor) {
        return null;
    }
}
