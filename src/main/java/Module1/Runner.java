package Module1;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {

        String[] PerformanceResults = TableConstructionAndFormatting.createAndFormateTable();
        IOUtil.printToConsole(PerformanceResults);
        IOUtil.saveToFile(PerformanceResults, "d:/Collection Performance Table.txt");


    }
}
