package tut6.aufgabe1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExamTask02 {
    public static List<Verein> scanVerein(File file) throws FileNotFoundException {
        List<Verein> vereinList = new ArrayList<>();
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] tokens = line.split(",");
            Amateurverein tmp = new Amateurverein(tokens[0],
                    Integer.valueOf(tokens[1]),
                    Sportart.valueOf(tokens[2]),
                    Integer.valueOf(tokens[3]),
                    Integer.valueOf(tokens[4]),
                    Double.valueOf(tokens[5])
            );
            vereinList.add(tmp);
        }
        scanner.close();
        return vereinList;
    }
}
