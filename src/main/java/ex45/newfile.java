package ex45;

import java.io.*;
import java.util.Scanner;

public class newfile {

        public static String read(String filePath, String name) {
            try {
                File file = new File(filePath + "exercise45_input.txt");
                Scanner in = new Scanner(file);
                StringBuilder scannedText = new StringBuilder();

                while (in.hasNextLine()) {
                    scannedText.append(in.nextLine()).append("\n");
                }


                return create(scannedText.toString(), filePath, name);
            } catch (FileNotFoundException e) {
                return "Unable to read file.";
            }
        }

        public static String create(String scannedText, String filePath, String name) {
            String replacedText = scannedText.replaceAll("utilize", "use");

            try {
                File file = new File(filePath + name);
                BufferedWriter output = new BufferedWriter(new FileWriter(file));

                output.write(replacedText);
                output.close();

                return replacedText;
            } catch (IOException e) {
                return "Unable to create new text file.";
            }
        }
}

