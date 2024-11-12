import java.util.Scanner;

class IfElseSwitchDemo {
    public static void main(String[] args) {
        testCondition(5);
        testCondition(-80);
        testCondition(0);
        
        menu();
    }
    
    public static void menu()
    {
        System.out.println("Enter a number from 1 to 4");
        
        Scanner s = new Scanner(System.in);
        
        int option = s.nextInt();
        
        switch(option)
        {
            case 1:
                System.out.println("You entered 1");
                break;
            case 2:
                System.out.println("You entered 2");
                break;
            case 3:
                System.out.println("You entered 3");
                break;
            case 4:
                System.out.println("You entered 4");
                break;
            default:
                System.out.println("Number out of range!");
                break;
        }
    }
    
    public static void testCondition(int num)
    {
        if(num < 0)
        {
            System.out.println("Num is less than zero");
        }
        else if(num == 0)
        {
            System.out.println("Num is zero");
        }
        else
        {
            System.out.println("Num is greater than zero");
        }
    }
}