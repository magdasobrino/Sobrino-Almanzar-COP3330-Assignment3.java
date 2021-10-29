package ex46;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class exercise46Test {
    @Test
    void wordList_Original_Test_String() {
        text analyze = new text();

        String fileContents = "badger badger badger badger mushroom mushroom snake badger badger badger";

        ArrayList<String> expected = new ArrayList<>();
        expected.add("badger");
        expected.add("mushroom");
        expected.add("snake");

        ArrayList<String> actual = analyze.wordList(fileContents);

        assertEquals(expected, actual);
    }

}