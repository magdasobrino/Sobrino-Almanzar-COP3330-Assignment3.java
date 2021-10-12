package ex44;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.parser.JSONParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class Product {
    private static final Scanner in = new Scanner(System.in);
    private Object JSONParser;

    public void seeker() {
        boolean found = false;

        String directory = getDirectory();

        File input = new File(directory);
        do {
            String productInput = getInput("What is the product name? ");
            try {
                JsonElement fileElement = JsonParser.parseReader(new FileReader(input));
                JsonObject fileObject = fileElement.getAsJsonObject();


                JsonArray jsonArrayofProducts = fileObject.get("products").getAsJsonArray();

                found = getProduct(jsonArrayofProducts, productInput, found);
                if (found == false){
                    System.out.println("Sorry, that product was not found.");
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } while(found == false); // if false, do search again

    }

    public static boolean getProduct(JsonArray jsonArrayofProducts, String productInput, boolean found) {
        // Find Product in product Array
        for (JsonElement productElement : jsonArrayofProducts) {
            // Get the JsonObject
            JsonObject productJsonObject = productElement.getAsJsonObject();

            // Extract Object
            if (productJsonObject.get("name").getAsString().equals(productInput)) {
                found = true;

                String name = productJsonObject.get("name").getAsString();
                String price = productJsonObject.get("price").getAsString();
                String quantity = productJsonObject.get("quantity").getAsString();

                printOutput(name, price, quantity);
            }
        }
        return found;
    }

    public static String getDirectory() {
        // Get directory path
        String userPath = System.getProperty("user.dir");
        return userPath + "\\resources\\input\\exercise44_input.json";
    }

    public static void printOutput(String name, String price, String quantity) {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }

    public static String getInput(String s) {

        System.out.print(s);
        return in.nextLine();
    }

}
