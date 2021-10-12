/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Magdalena_Sobrino-Almanzar
 */
package ex45;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exercise45 {

        public static void main(String[] args) throws FileNotFoundException {

            String filePath = "C:\\Users\\magda\\Documents\\JAVA Course\\Sobrino-Almanzar-COP3330-Assignment3\\src\\main\\java\\ex45\\";
            Scanner in = new Scanner(System.in);

            System.out.print("The current file text is: Given the input file of One should never utilize the word utilize in writing...");

            System.out.println("\nWhat is the name of the input file: ");
            String name = in.nextLine().trim(); //input name of input file//

            System.out.println(newfile.read(filePath, name));

        } //end of main//
    } //end of program//
