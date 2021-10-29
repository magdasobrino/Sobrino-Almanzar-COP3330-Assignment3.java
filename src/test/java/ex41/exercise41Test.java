package ex41;

import org.junit.Test;

import java.io.IOException;
import java.util.*;
import static org.junit.Assert.*;

public class exercise41Test {

    @Test
        void inputTest() throws IOException {
            String filePath = "C:\\Users\\magda\\Documents\\JAVA Course\\Sobrino-Almanzar-COP3330-Assignment3\\src\\main\\java\\ex41\\exercise41_input.txt";
            ArrayList<String> nameList = null; //reads file into arrayList to test
            try {
                nameList = file.read(filePath);
            } catch (IOException e) {
                e.printStackTrace();
            }
            Collections.sort(nameList); //sorts arrayList

            String expectedOutput = ("Johnson, Jim\n" +
                    "Jones, Aaron\n" +
                    "Jones, Chris\n" +
                    "Ling, Mai\n" +
                    "Swift, Geoffrey\n" +
                    "Xiong, Fong\n" +
                    "Zarnecki, Sabrina\n");
            StringBuilder actualOutput = new StringBuilder(); //StringBuilder to turn arrayList into String for comparison

            for (int i = 0; i < nameList.size(); i++) {
                actualOutput.append(nameList.get(i)).append("\n");
            }

            assertEquals(expectedOutput, actualOutput.toString()); //test passed.
        }
    }
