import java.util.ArrayList;

public class FoodOrder {

    private ArrayList<Food> orderList = new ArrayList<>();


    private String custNumber;

    public FoodOrder(String custNumber)
    {
        this.custNumber = custNumber;

    }

    public void addFoodItem(Food f)
    {
        orderList.add(f);
    }

    public double getTotal()
    {
        double total = 0.0;

        for (Food item : orderList)
        {
            total += item.getPrice();
        }

        return total;
    }

    public ArrayList<Food> getOrderList()
    {
        return orderList;
    }

    public String getCustomerID()
    {
        return custNumber;
    }
}

