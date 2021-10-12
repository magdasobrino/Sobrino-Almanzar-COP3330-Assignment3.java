/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Magdalena_Sobrino-Almanzar
 */

package ex42;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class exercise42 {
    public static void main(String[] args) throws FileNotFoundException {
        File filePath = new File("C:\\Users\\magda\\Documents\\JAVA Course\\Sobrino-Almanzar-COP3330-Assignment3\\src\\main\\java\\ex42\\exercise42_input.txt");
        Scanner in = new Scanner(filePath);
        System.out.println(filePath.getName());

        String str = "";
        String[] arrOfStr;

        System.out.print("Last        First   Salary  \n");
        System.out.print("------------------------------\n");

        while (in.hasNextLine())
        {
            str = in.nextLine();
            String[] splitString = str.split(",");

            for (int i = 0; i < splitString.length; i++)
            {
                System.out.print(splitString[i] + "\t" + "\t");


            }
            System.out.println();
        }
    } //end of main//
} //end program//

