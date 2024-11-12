import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class FoodInputIO {


    private static FoodOrder myOrder;


    private static boolean readFiles = false;



    public static void main(String[] args)
    {

        boolean done = false;

        Scanner input = new Scanner(System.in);

        while (!done)
        {
            //Main user loop here.
            printMenu();
            System.out.println("Enter a option: ");
            String responce = input.next();

            switch (responce) {
                case "1":
                    setCustomerID();
                    break;
                case "2":
                    readInFile();
                    break;
                case "3":
                    printFoodList();
                    break;
                case "4":
                    done = true;
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }




    }

    private static void printMenu()
    {
        System.out.println("Dan's Bytes");
        System.out.println("1: Set customer ID for order");
        System.out.println("2: Read in CSV file and add to order");
        System.out.println("3: List food items in order");
        System.out.println("4: quit");
    }

    private static boolean readInFile()
    {
        if (readFiles != true && myOrder != null) {
            try {
                File input = new File("stuff.csv");

                Scanner line = new Scanner(input);

                line.nextLine(); //Skip the header

                while (line.hasNext()) {
                    //split the line
                    String[] split = line.nextLine().split(",");

                    Food f = new Food(Integer.parseInt(split[0]), split[1], Double.parseDouble(split[2]), Boolean.parseBoolean(split[3]));

                    myOrder.addFoodItem(f);
                }

                readFiles = true;
                return true;
            } catch (FileNotFoundException e) {
                System.out.println("Oh no");
                readFiles = false;
                return false;
            }
        }
        else
        {
            return false;
        }

    }

    private static void printFoodList() {
        if (readFiles && myOrder != null) //if true
        {1
            System.out.println("Customer ID/name: " + myOrder.getCustomerID());
            for (Food f : myOrder.getOrderList()) {
                System.out.println(f);
            }

            System.out.println("Total: £" + myOrder.getTotal());
        }
        else
        {
            System.out.println("No food in system, please select option 1 first");
        }
    }

    private static void setCustomerID()
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a customer ID: ");

        String input = s.next();

        myOrder = new FoodOrder(input);
    }
}
