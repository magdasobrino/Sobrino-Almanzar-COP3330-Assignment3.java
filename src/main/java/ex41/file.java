package ex41;

import java.util.Scanner;
import java.util.*;
import java.io.IOException;
import java.io.File;

public class file {

    public static ArrayList<String> read(String filePath) throws IOException {
        ArrayList<String> nameList = new ArrayList<>();
        File file = new File(filePath);
        Scanner in = new Scanner(file);

        while (in.hasNext()) {
            nameList.add(in.nextLine().trim());
        }

        return nameList;
    }
}

