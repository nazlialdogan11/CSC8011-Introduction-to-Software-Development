import java.util.ArrayList;

public class UseArrayList {

    public static void main(String[] args)
    {
        ArrayList<Integer> myList = new ArrayList<>();

        myList.add(1);
        myList.add(43245);
        myList.add(1000);

        //classic for loop
        for (int i = 0; i < myList.size(); i++)
        {
            System.out.println(myList.get(i));
        }

        //more modern for-each
        for (int current : myList)
        {
            System.out.println(current);
        }
    }
}
