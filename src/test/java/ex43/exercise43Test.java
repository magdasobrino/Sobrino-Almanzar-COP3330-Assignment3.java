package ex43;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class exercise43Test {
    @Test
    void websiteTest() throws IOException {
        String title = "Generic Site";
        String author = "John Doe";
        String choiceJS = "y"; //if JS folder will be created or not.
        String choiceCSS = "y"; //if CSS folder will be created or not.
        String filePath = String.format("C:\\Users\\magda\\Documents\\JAVA Course\\Sobrino-Almanzar-COP3330-Assignment3\\src\\main\\java\\ex43\\exercise43\\%s\\",title);

        String actualOutput = site.generate(filePath, author, title, choiceJS, choiceCSS);

        String expectedOutput = String.format(
                "Generated directory at C:\\Users\\magda\\Documents\\JAVA Course\\Sobrino-Almanzar-COP3330-Assignment3\\src\\main\\java\\ex43\\exercise43\\%s\\css\\\r\n" +
                        "Generated directory at C:\\Users\\magda\\Documents\\JAVA Course\\Sobrino-Almanzar-COP3330-Assignment3\\src\\main\\java\\ex43\\exercise43\\%s\\js\\\r\n" +
                        "Generated file at C:\\Users\\magda\\Documents\\JAVA Course\\Sobrino-Almanzar-COP3330-Assignment3\\src\\main\\java\\ex43\\exercise43\\%s\\index.html\r\n",
                title, title, title);

        assertEquals(expectedOutput, actualOutput);
    }
}


