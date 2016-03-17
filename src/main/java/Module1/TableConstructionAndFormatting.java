package Module1;


import java.io.*;
import java.util.*;

public class TableConstructionAndFormatting {

    static List arrayList = new ArrayList<>();
    static List linkedList = new LinkedList<>();

    static Set hashSet = new HashSet<>();
    static Set treeSet = new TreeSet<>();


    public static String[] createAndFormateTable() throws IOException {
        String [] formatedResult = new String[5];
        Scanner input = new Scanner(System.in);
        System.out.printf("Please select which table you want to print :%n %s %n %s %n %s %n",
                        " 1. 10000 elements", " 2. 100000 elements", " 3. 1000000 elements");
        int choise = input.nextInt();
        if (choise == 1) {
            String header = TableConstructionAndFormatting.printHeader("10K");
            formatedResult[0] = header;

            String arrayListResult1 = String.format("%-18s %-6d %-6d %-9d %-11d %-11d %-15d %d%n", "ArrayList", ListTester.testAdd(arrayList, 10000, 100), ListTester.testGet(arrayList, 10000, 100), ListTester.testRemove(arrayList, 10000, 100), ListTester.testContains(arrayList, 10000, 100), ListTester.testPopulate(arrayList, 10000, 100), ListTester.testIteratorAdd(arrayList, 10000, 100), ListTester.testIteratorRemove(arrayList, 10000, 100));
            formatedResult[1] = arrayListResult1;

            String linkedListResult1 = String.format("%-18s %-6d %-6d %-9d %-11d %-11d %-15d %d%n", "LinkedList", ListTester.testAdd(linkedList, 10000, 100), ListTester.testGet(linkedList, 10000, 100), ListTester.testRemove(linkedList, 10000, 100), ListTester.testContains(linkedList, 10000, 100), ListTester.testPopulate(linkedList, 10000, 100), ListTester.testIteratorAdd(linkedList, 10000, 100), ListTester.testIteratorRemove(linkedList, 10000, 100));
            formatedResult[2] = linkedListResult1;

            String hashSetResult1 = String.format("%-18s %-6d %-6s %-9d %-11d %-11d %-15s %s%n", "HashSet", SetTester.testAdd(hashSet, 10000, 100), "n/a ", SetTester.testRemove(hashSet, 10000, 100), SetTester.testContains(hashSet, 10000, 100), SetTester.testPopulate(hashSet, 10000, 100), "n/a ", "n/a ");
            formatedResult[3] = hashSetResult1;

            String treeSetResult1 = String.format("%-18s %-6d %-6s %-9d %-11d %-11d %-15s %s%n%n%n%n", "TreeSet", SetTester.testAdd(treeSet, 10000, 100), "n/a ", SetTester.testRemove(treeSet, 10000, 100), SetTester.testContains(treeSet, 10000, 100), SetTester.testPopulate(treeSet, 10000, 100), "n/a ", "n/a ");
            formatedResult[4] = treeSetResult1;


        } else if (choise == 2) {
            String header = TableConstructionAndFormatting.printHeader("100K");
            formatedResult[0] = header;

            String arrayListResult2 = String.format("%-18s %-6d %-6d %-9d %-11d %-11d %-15d %d%n", "ArrayList", ListTester.testAdd(arrayList, 100000, 100), ListTester.testGet(arrayList, 100000, 100), ListTester.testRemove(arrayList, 100000, 100), ListTester.testContains(arrayList, 100000, 100), ListTester.testPopulate(arrayList, 100000, 100), ListTester.testIteratorAdd(arrayList, 100000, 100), ListTester.testIteratorRemove(arrayList, 100000, 100));
            formatedResult[1] = arrayListResult2;

            String linkedListResult2 = String.format("%-18s %-6d %-6d %-9d %-11d %-11d %-15d %d%n", "LinkedList", ListTester.testAdd(linkedList, 100000, 100), ListTester.testGet(linkedList, 100000, 100), ListTester.testRemove(linkedList, 100000, 100), ListTester.testContains(linkedList, 100000, 100), ListTester.testPopulate(linkedList, 100000, 100), ListTester.testIteratorAdd(linkedList, 100000, 100), ListTester.testIteratorRemove(linkedList, 100000, 100));
            formatedResult[2] = linkedListResult2;

            String hashSetResult2 = String.format("%-18s %-6d %-6s %-9d %-11d %-11d %-15s %s%n", "HashSet", SetTester.testAdd(hashSet, 100000, 100), "n/a ", SetTester.testRemove(hashSet, 100000, 100), SetTester.testContains(hashSet, 100000, 100), SetTester.testPopulate(hashSet, 100000, 100), "n/a ", "n/a ");
            formatedResult[3] = hashSetResult2;

            String treeSetResult2 = String.format("%-18s %-6d %-6s %-9d %-11d %-11d %-15s %s%n%n%n%n", "TreeSet", SetTester.testAdd(treeSet, 100000, 100), "n/a ", SetTester.testRemove(treeSet, 100000, 100), SetTester.testContains(treeSet, 100000, 100), SetTester.testPopulate(treeSet, 100000, 100), "n/a ", "n/a ");
            formatedResult[4] = treeSetResult2;


        } else if (choise == 3) {
            String header = TableConstructionAndFormatting.printHeader("1000K");
            formatedResult[0] = header;

            String arrayListResult3 = String.format("%-18s %-9d %-9d %-12d %-14d %-14d %-18d %d%n", "ArrayList", ListTester.testAdd(arrayList, 1000000, 100), ListTester.testGet(arrayList, 1000000, 100), ListTester.testRemove(arrayList, 1000000, 100), ListTester.testContains(arrayList, 1000000, 100), ListTester.testPopulate(arrayList, 1000000, 100), ListTester.testIteratorAdd(arrayList, 1000000, 100), ListTester.testIteratorRemove(arrayList, 1000000, 100));
            formatedResult[1] = arrayListResult3;

            String linkedListResult3 = String.format("%-18s %-9d %-9d %-12d %-14d %-14d %-18d %d%n", "LinkedList", ListTester.testAdd(linkedList, 1000000, 100), ListTester.testGet(linkedList, 1000000, 100), ListTester.testRemove(linkedList, 1000000, 100), ListTester.testContains(linkedList, 1000000, 100), ListTester.testPopulate(linkedList, 1000000, 100), ListTester.testIteratorAdd(linkedList, 1000000, 100), ListTester.testIteratorRemove(linkedList, 1000000, 100));
            formatedResult[2] = linkedListResult3;

            String hashSetResult3 = String.format("%-18s %-9d %-9s %-12d %-14d %-14d %-18s %s%n", "HashSet", SetTester.testAdd(hashSet, 1000000, 100), "n/a ", SetTester.testRemove(hashSet, 1000000, 100), SetTester.testContains(hashSet, 1000000, 100), SetTester.testPopulate(hashSet, 1000000, 100), "n/a ", "n/a ");
            formatedResult[3] = hashSetResult3;

            String treeSetResult3 = String.format("%-18s %-9d %-9s %-12d %-14d %-14d %-18s %s%n%n%n%n", "TreeSet", SetTester.testAdd(treeSet, 1000000, 100), "n/a ", SetTester.testRemove(treeSet, 1000000, 100), SetTester.testContains(treeSet, 1000000, 100), SetTester.testPopulate(treeSet, 1000000, 100), "n/a ", "n/a ");
            formatedResult[4] = treeSetResult3;


        } else {
            throw new IllegalArgumentException("Invalid input! Input needs to be 1,2 or 3");
        }
        return formatedResult;
    }


    private static String printHeader(String elements) {

        String header = String.format("%-18s %-6s %-6s %-9s %-11s %-11s %-15s %-15s%n %s%n%n","Collection type", "add", "get", "remove", "contains", "populate", "iterator.add", "iterator.remove", "(Results for " + elements + " elements in the collection)");

        return header;
    }
}
