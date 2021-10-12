package ex43;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.util.Scanner;

public class site {

    public static String generateHTML(String filePath, String author, String title) throws IOException {

        String content = String.format("<!DOCTYPE html>\n<html>\n<head>\n" +
                "<title>%s</title>\n<meta name=\"author\" content=\"%s\">\n" +
                "</head>\n</html>", title, author);


        try {
            File file = new File(filePath);

            BufferedWriter output = new BufferedWriter(new FileWriter(file));
            output.write(content);
            output.close();
            return String.format("Created folder at %s%n", filePath);
        } catch (IOException e ) {
            return "Unable to generate HTML file.";
        }
    }


    public static String generateDir(String directPath) {
        File file = new File(directPath);
        file.mkdirs();
        return String.format("Created folder at %s%n", directPath);
    }

    public static String generate(String filePath, String author, String title, String choiceJS, String choiceCSS) throws IOException {
        Scanner in = new Scanner(System.in);
        StringBuilder output = new StringBuilder();


        if (choiceJS.equals("y")||(choiceJS.equals("yes"))) {
            if (choiceCSS.equals("y")) {
                output.append(generateDir(filePath + "css\\"));
            }
            output.append(generateDir(filePath + "js\\"));
            output.append(generateHTML(filePath + "index.html", author, title));
        }
        else {
            if (choiceCSS.equals("y")||(choiceJS.equals("yes"))) {
                output.append(generateDir(filePath + "css\\"));
            }
            output.append(generateHTML(filePath + "index.html", author, title));
        }
        return output.toString();
    } //end of main//
} //end of program//








