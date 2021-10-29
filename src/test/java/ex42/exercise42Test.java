package ex42;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class exercise42Test {

    @Test
    void fileTest() throws IOException {

        String filePath1 = "C:\\Users\\magda\\Documents\\JAVA Course\\Sobrino-Almanzar-COP3330-Assignment3\\src\\main\\java\\ex42\\exercise42_input.txt";
        ArrayList<Map<String, String>> nameList = file.read(filePath1);
        Collections.sort(nameList, new sortsalary());

        //.txt file containing sorted values
        String filePath2 = "C:\\Users\\magda\\Documents\\JAVA Course\\Sobrino-Almanzar-COP3330-Assignment3\\src\\main\\java\\ex42\\exercise42_input.txt";
        ArrayList<Map<String, String>> expectedList = file.read(filePath2);

        String expectedOutput = file.print(expectedList);
        String actualOutput = file.print(nameList);

        assertEquals(expectedOutput, actualOutput);
    }
}
