import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ReadInStuff {

    private static ArrayList<Food> foodList = new ArrayList<>();

    public static void main(String[] args)
    {
        try
        {
            File input = new File("stuff.csv");

            Scanner line = new Scanner(input);

            line.nextLine(); //Skip the header

            while (line.hasNext())
            {
               //split the line
                String[] split = line.nextLine().split(",");

                Food f = new Food(Integer.parseInt(split[0]),split[1],Double.parseDouble(split[2]),Boolean.parseBoolean(split[3]));

                foodList.add(f);
            }

            for (Food current : foodList)
            {
                System.out.println(current);
            }

        }
        catch (FileNotFoundException e)
        {
            System.out.println("Oh no");
        }

        System.out.println("I'm done here....");
    }
}
