/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Magdalena_Sobrino-Almanzar
 */

/*/package ex44;

import java.util.Scanner;
import java.util.*;

public class exercise44{

public static void main(String[] args) {
        String filePath = "C:\\Users\\magda\\Documents\\JAVA Course\\Sobrino-Almanzar-COP3330-Assignment3\\src\\main\\java\\ex44\\exercise44_input.txt";
        Scanner in = new Scanner(System.in);
        String user;


        ArrayList<Map<String, Object>> list = Product.read(filePath);

        do {
        System.out.print("Enter a product name: ");
        String name = in.nextLine().trim();
        user = Product.search(list, name);
        System.out.println(user);
        } while (user.equals("Product does not exist."));
        }
}*/