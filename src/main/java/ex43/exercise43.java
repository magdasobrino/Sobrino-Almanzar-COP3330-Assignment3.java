/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Magdalena_Sobrino-Almanzar
 */

package ex43;

import java.io.IOException;
import java.util.Scanner;

public class exercise43 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        System.out.print("What is the site name: ");
        String title = in.nextLine().trim();
        System.out.print("What is the Author: ");
        String author = in.nextLine().trim();

        String filePath = String.format("C:\\Users\\magda\\Documents\\JAVA Course\\Sobrino-Almanzar-COP3330-Assignment3\\src\\main\\java\\ex43\\%s\\",title);

        System.out.print("Do you want a folder for JavaScript? ");
        String choiceJS = in.nextLine().trim().toLowerCase();
        System.out.print("Do you want a folder for CSS? ");
        String choiceCSS = in.nextLine().trim().toLowerCase(); //

        String output = site.generate(filePath, author, title, choiceJS, choiceCSS);
        System.out.println(output);

    } //end of main//
} //end of program

