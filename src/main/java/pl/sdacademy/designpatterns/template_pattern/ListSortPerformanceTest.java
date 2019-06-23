package pl.sdacademy.designpatterns.template_pattern;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class ListSortPerformanceTest extends PerformanceTestTemplate {


    @Override
    public int getWarmupIterationNum() {
        return 3;
    }

    @Override
    public int getIterationsNum() {
        return 100;
    }

    @Override
    public void testIeration() {

        final List<Integer> numbers = new ArrayList<>();
        for (int idx = 0; idx < 1000; idx++) {
            numbers.add(new Random().nextInt());
        }
        numbers.sort(Comparator.naturalOrder());

    }
}
