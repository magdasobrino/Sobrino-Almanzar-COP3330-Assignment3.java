package ex46;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class exercise46 {
    private static final Scanner input = new Scanner(System.in);

    public static void readInput() {
        //Ask for the file that needs to be read
        System.out.print("What is the exact address location of the file you want to analyze: ");
        //Input this address for testing purposes: src/main/java/oop/example/Ex46/BadgerFile.txt
        String fileLocation = input.nextLine();

        //Read the file
        BufferedReader read = null;
        try {
            read = new BufferedReader(new FileReader(fileLocation));
        }
        //Print error message if reading file fails
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //Save file contents as a string
        String fileContents = null;
        try {
            assert read != null;
            fileContents = read.readLine();
        }
        //Print error message if reading the line fails
        catch (IOException e) {
            e.printStackTrace();
        }

        //Call wordCounter function from AnalyzeFile class
        text analyze = new text();
        analyze.wordList(fileContents);

    }

    public static void main(String[] args) {

        readInput();



    }
}
