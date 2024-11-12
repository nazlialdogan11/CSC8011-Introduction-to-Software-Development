import java.util.ArrayList;
import java.util.Scanner;

public class UseArrayListScanner {

    private static ArrayList<String> myList = new ArrayList<>();


    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        boolean done = false;

        while (!done)
        {
            System.out.println("Please enter a string to add to the list, or press q to quit:");

            String responce = s.nextLine();

            if (!responce.equals("q"))
            {
                myList.add(responce);
            }
            else //user has typed q to quit
            {
               done = true;
            }
        }

        System.out.println("User has entered:");

        for (String current : myList)
        {
            System.out.println(current);
        }
    }
}
