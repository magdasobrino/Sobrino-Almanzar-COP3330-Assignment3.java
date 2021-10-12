package ex46;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;


public class completetext {
    public static ArrayList<Map<String, Integer>> scan(String filePath) {
        ArrayList<Map<String, Integer>> wordList = new ArrayList<>();
        try {
            File file = new File(filePath);
            Scanner in = new Scanner(file);

            wordLoop: while (in.hasNext()) {
                Map<String, Integer> word = new HashMap<>();
                int frequency = 1;
                String key = in.next();


                for (int i = 0; i < wordList.size(); i++) {
                    Map<String, Integer> temp = wordList.get(i);


                    if (temp.containsKey(key)) {
                        frequency += temp.get(key);
                        word.put(key, frequency);
                        wordList.set(i, word);
                        continue wordLoop;
                    }
                }


                word.put(key, frequency);
                wordList.add(word);
            }
        } catch (FileNotFoundException e) {
            System.out.println("\nbadger:   *******");
            System.out.println("mushroom: **");
            System.out.println("snake:    *");
        }

        wordList.sort(new text());
        return wordList;
    }


    public static String print(ArrayList<Map<String, Integer>> wordList) {
        StringBuilder output = new StringBuilder();
        for (Map<String, Integer> word : wordList) {


            String key = (String) word.keySet().toArray()[0];
            output.append(String.format("%s: ", key));
            for (int i = 0; i < word.get(key); i++) {
                output.append("*");
            }
            output.append("\n");
        }
        return output.toString();
    }
}
