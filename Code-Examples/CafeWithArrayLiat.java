import java.util.ArrayList;
import java.util.Scanner;

public class CafeWithArrayLiat {

    public static void main(String[] args)
    {
        ArrayList<Food> items = new ArrayList<>();

        Scanner s = new Scanner(System.in);
        boolean done = false;

        while (!done)
        {
            System.out.println("Enter a food item, bit it's ID, name, price and is vegan: (or enter q to quit)");

            String responce =  s.nextLine();

            if (responce.equals("q"))
            {
                done = true;
            }
            else {

                String[] parts = responce.split(" ");

                Food f = new Food(parts[0], parts[1], Double.parseDouble(parts[2]), Boolean.getBoolean(parts[3]));

                items.add(f);
           }


        }

        for (Food item : items)
        {
            System.out.println(item);
        }

    }
}
