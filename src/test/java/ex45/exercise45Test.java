/*/package ex45;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class exercise45Test {
    @Test
        void textTest() {
            String filePath = "C:\\\\Users\\magda\\Documents\\JAVA Course\\Sobrino-Almanzar-COP3330-Assignment3\\src\\main\\java\\ex45\\";


            String actualOutput = text.read(filePath, "exercise45_output.txt");
            String expectedOutput = "One should never use the word \"use\" in writing. Use \"use\" instead.\n" +
                    "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
                    "uses an IDE to write her Java programs\".\n";

            assertEquals(expectedOutput, actualOutput);
        }
    }/*/
