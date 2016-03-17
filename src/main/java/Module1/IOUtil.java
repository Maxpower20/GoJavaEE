package Module1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class IOUtil {

    public static void printToConsole (String[] data) {

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]);
        }
    }

    public static void saveToFile (String data[], String path ) throws IOException {
        PrintWriter fileWriter = new PrintWriter(new FileWriter(path, true));

        for (int i = 0; i < data.length; i++) {
            fileWriter.print(data[i]);
        }

        fileWriter.close();
    }


}
