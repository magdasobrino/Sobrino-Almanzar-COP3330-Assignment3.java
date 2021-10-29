/*/package ex44;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class exercise44Test {
    @Test
    void jsonTest() {
        String filePath = "C:\\Users\\magda\\Documents\\JAVA Course\\Sobrino-Almanzar-COP3330-Assignment3\\src\\main\\java\\ex44\\exercise44_input.txt\");
        ArrayList<Map<String, Object>> list = Product.read(filePath);


        String expected1 = "Name: Doodad | Price: 5.00 | Quantity: 10\r\n";
        String expected2 = "Name: Widget | Price: 25.00 | Quantity: 5\r\n";
        String expected3 = "Name: Thing | Price: 15.00 | Quantity: 5\r\n";

        String actual1 = Product.search(list, "doodad");
        String actual2 = Product.search(list, "widget");
        String actual3 = Product.search(list, "tHiNG");

        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
    }
}/*/
