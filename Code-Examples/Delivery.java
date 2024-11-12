import java.util.ArrayList;

public class Delivery
{
    private ArrayList<String> listOfItems = new ArrayList<>();
    
    private String address;
    
    public Delivery(String address)
    {
        this.address = address;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public ArrayList<String> getList()
    {
        return listOfItems;
    }
    
    public void addItem(String item)
    {
        listOfItems.add(item);
    }
}