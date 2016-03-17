package Module1;


import java.math.BigInteger;
import java.util.Random;
import java.util.Set;

public class SetTester {
    public static long testAdd(Set set, int elements, int repeats) {
        long result;
        long sum = 0;

            for (int i = 0; i < elements; i++) {
                set.add(i);
            }

            for (int k = elements + 1; k < elements + repeats; k++) {
                long start = System.nanoTime();

                set.add(k);

                long finish = System.nanoTime();
                long duration = finish - start;
                sum +=duration;
            }

        set.clear();

        result = sum / repeats;
        return result;
    }

    public static long testRemove(Set set, int elements, int repeats) {
        long result;
        long sum = 0;
        Random randomGenerator = new Random();

            for (int i = 0; i < elements; i++) {
                set.add(i);
            }

            for (int k = 0; k < repeats; k++) {
                long start = System.nanoTime();

                set.remove(randomGenerator.nextInt(elements));

                long finish = System.nanoTime();
                long duration = finish - start;
                sum += duration;
            }
        set.clear();

        result = sum / repeats;
        return result;
    }

    public static long testContains(Set set, int elements, int repeats) {
        long result;
        long sum = 0;
        Random randomGenerator = new Random();

            for (int i = 0; i < elements; i++) {
                set.add(i);
            }

            for (int k = 0; k < repeats; k++) {
                long start = System.nanoTime();

                set.contains(randomGenerator.nextInt(2 * elements));

                long finish = System.nanoTime();
                long duration = finish - start;
                sum += duration;
            }
        set.clear();

        result = sum / repeats;
        return result;
    }

    public static BigInteger testPopulate(Set set, int elements, int repeats) {
        BigInteger result;
        BigInteger sum = BigInteger.valueOf(0);

        for (int k = 0; k < repeats; k++) {

            long start = System.nanoTime();

            for (int i = 0; i < elements; i++) {
                set.add(i);
            }

            long finish = System.nanoTime();
            BigInteger duration = BigInteger.valueOf(finish - start);
            sum = sum.add(duration);

            set.clear();
        }
        result = sum.divide(BigInteger.valueOf(repeats));
        return result;
    }
}
