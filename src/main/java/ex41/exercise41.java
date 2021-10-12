/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Magdalena_Sobrino-Almanzar
 */
package ex41;

import java.util.*;
import java.io.IOException;


public class exercise41 {
    public static void main(String[] args) throws IOException {

        {

            String filePath = "C:\\Users\\magda\\Documents\\JAVA Course\\Sobrino-Almanzar-COP3330-Assignment3\\src\\main\\java\\ex41\\exercise41_input.txt";

            ArrayList<String> nameList = file.read(filePath);
            Collections.sort(nameList);
            System.out.print("Total of 7 names");
            System.out.print("\n-----------------");


            for (int i = 0; i < nameList.size(); i++) {
                System.out.println(nameList.get(i));


            }
        }

    } //end of main//
}// end of program//