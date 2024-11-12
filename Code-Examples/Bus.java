public class Bus {

    private String reg;
    private int maxSpeed = 60;
    private int capacity;
    private String owner;
    private int currentSpeed = 0;

    public Bus(String reg, int capacity, String owner)
    {
        this.reg = reg;
        this.capacity = capacity;
        this.owner = owner;
    }

    public String getReg()
    {
        return reg;
    }

    public int getMaxSpeed()
    {
        return maxSpeed;
    }

    public int getCapaity()
    {
        return capacity;
    }

    public String getOwner()
    {
        return owner;
    }

    public int getCurrentSpeed()
    {
        return currentSpeed;
    }

    public void setReg(String reg)
    {
        this.reg = reg;
    }

    public void setOwner(String owner)
    {
        this.owner = owner;
    }

    public boolean changeSpeed(int amount) //Possible improvement - single if statement without else if
    {
        if (amount > 0 && (amount + currentSpeed) <= maxSpeed) //we want to go faster
        {
            currentSpeed += amount; //add the amount onto the current speed
            return true;
        }
        else if (amount < 0 && (currentSpeed + amount) >= 0) //we want to slow down
        {
            currentSpeed += amount;  // if amount is negative, we can safely add it to currentSpeed to reduce the speedd;
            return true;
        }
        else
        {
            return false;
        }

    }
}
