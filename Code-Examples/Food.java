public class Food {

    private String id;
    private  String name;
    private double price;
    private boolean isVegan;

    private double TAX_RATE = 0.2;

    public Food(String id, String name, double price, boolean isVegan)
    {
        this.id = id;
        this.name = name;
        this.price = price;
        this.isVegan = isVegan;
    }

    public String getID()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return calculatePriceWithTax(); //return price + tax
    }

    public boolean getIsVegan()
    {
        return isVegan;
    }

    private double calculatePriceWithTax()
    {
        return price + (price * TAX_RATE);
    }

    public String toString()
    {
        return "Food item: " + id + ", Name: " + name + ", Price: £" + price + ", is vegan? " + isVegan + ".";
    }


}
