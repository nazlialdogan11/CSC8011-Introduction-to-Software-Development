import java.util.Scanner;

class MethodsExample {
    public static void main(String[] args) {
        saySomethnig();
        int myResult = multiply(5,7);
        System.out.println("my result is: " + myResult);
        
        double myResult2 = multiply(5.6,2.8);
        
        System.out.println("my result 2 is: " + myResult2);
          

        System.out.println(returnHello());
          
        System.out.println(returnSomethnig(false));
    }
    
    public static void saySomethnig()
    {
        System.out.println("Hi");
    }
    
    public static int multiply(int x, int y)
    {
        // int result = x * y;
        // return result;
        return x * y;
    }
    
    public static double multiply(double x, double y)
    {
        // int result = x * y;
        // return result;
        return x * y;
    }
    
    public static String returnHello()
    {
        return "Hello!";
    }
    
    public static String returnSomethnig(boolean extra)
    {
        if (extra) //if (extra == true)
        {
            return "This is an extra message!";
        }
        else
        {
            return "You dod not want anythnig else!";
        }

    }
}