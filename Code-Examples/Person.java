public class Person {

    private String name;
    private int age;
    private String address;

    public Person(String inName, int inAge, String inAddress)
    {
        name = inName;

        age = inAge;

        address = inAddress;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String newName)
    {
        name = newName;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String newAddress)
    {
        address = newAddress;
    }

    public int getAge()
    {
        return age;
    }

    public void birthday()
    {
        age++;
    }
}
