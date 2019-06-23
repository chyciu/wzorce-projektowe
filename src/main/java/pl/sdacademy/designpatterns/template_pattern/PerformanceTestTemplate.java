package pl.sdacademy.designpatterns.template_pattern;

public abstract class PerformanceTestTemplate {

    public abstract int getWarmupIterationNum ();

    public abstract int getIterationsNum ();

    public abstract void testIeration ();

    public void run () {

        for (int idx = 0; idx < getWarmupIterationNum(); idx++) {
            testIeration();
        }

        final long start = System.currentTimeMillis();
        for (int idx = 0; idx < getWarmupIterationNum() ; idx++) {
            testIeration();
        }
        final long end = System.currentTimeMillis();

        System.out.println("Average time of an iteration took " + ((double)(end - start)) / getIterationsNum() + " ms");
    }

}
