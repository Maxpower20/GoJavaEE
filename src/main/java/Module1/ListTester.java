package Module1;




import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class ListTester {

    public static long testAdd(List list, int elements, int repeats){
        long result;
        long sum = 0;
        Random randomGenerator = new Random();

            for (int i = 0; i < elements; i++) {
                list.add(i);
            }

            for (int k = 0; k < repeats; k++) {
                long start = System.nanoTime();

                list.add(randomGenerator.nextInt(elements),randomGenerator.nextInt(elements));

                long finish = System.nanoTime();
                long duration = finish - start;
                sum +=duration;
            }
        list.clear();

        result = sum / repeats;
        return result;
    }


    public static long testGet(List list, int elements, int repeats) {
        long result;
        long sum = 0;
        Random randomGenerator = new Random();

            for (int i = 0; i < elements; i++) {
                list.add(i);
            }

            for (int k = 0; k < repeats; k++) {

                long start = System.nanoTime();

                list.get(randomGenerator.nextInt(elements));

                long finish = System.nanoTime();
                long duration = finish - start;
                sum += duration;
            }
        list.clear();

        result = sum / repeats;
        return result;
    }

    public static long testRemove(List list, int elements, int repeats) {
        long result;
        long sum = 0;
        Random randomGenerator = new Random();

            for (int i = 0; i < elements; i++) {
                list.add(i);
            }

            for (int k = 0; k < repeats; k++) {
                long start = System.nanoTime();

                list.remove(randomGenerator.nextInt(elements / 2));

                long finish = System.nanoTime();
                long duration = finish - start;
                sum += duration;
            }
        list.clear();

        result = sum / repeats;
        return result;
    }

    public static long testContains(List list, int elements, int repeats) {
        long result;
        long sum = 0;
        Random randomGenerator = new Random();

            for (int i = 0; i < elements; i++) {
                list.add(i);
            }

            for (int k = 0; k < repeats; k++) {
                long start = System.nanoTime();

                list.contains(randomGenerator.nextInt(2 * elements));

                long finish = System.nanoTime();
                long duration = finish - start;
                sum += duration;
            }
            list.clear();

        result = sum / repeats;
        return result;
    }

    public static long testPopulate(List list, int elements, int repeats) {
        long result;
        long sum = 0;

        for (int k = 0; k < repeats; k++) {

            long start = System.nanoTime();

            for (int i = 0; i < elements; i++) {
                list.add(i);
            }

            long finish = System.nanoTime();
            long duration = finish - start;
            sum += duration;

            list.clear();
        }

        result = sum / repeats;
        return result;
    }

    public static long testIteratorAdd(List list, int elements, int repeats) {
        long result;
        long sum = 0;
        Random randomGenerator = new Random();

            for (int i = 0; i < elements; i++) {
                list.add(i);
            }

                ListIterator iter = list.listIterator();

                int k = 0;
                while (iter.hasNext() && k < repeats) {

                    long start = System.nanoTime();

                    iter.add(randomGenerator.nextInt(elements));
                    iter.next();

                    long finish = System.nanoTime();
                    long duration = finish - start;
                    sum += duration;

                    k++;
                }
        list.clear();

        result = sum / repeats;
        return result;
    }

    public static long testIteratorRemove(List list, int elements, int repeats) {
        long result;
        long sum = 0;


            for (int i = 0; i < elements; i++) {
                list.add(i);
            }

            for (int k = 0; k < repeats; k++) {
            ListIterator iter = list.listIterator();
            while (iter.hasNext() && k < repeats) {

                long start = System.nanoTime();

                iter.next();
                iter.remove();

                long finish = System.nanoTime();
                long duration = finish - start;
                sum += duration;
            }
        }
        list.clear();

        result = sum / repeats;
        return result;
    }

}
