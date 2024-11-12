public class UseBus {

    public static void main(String[] args)
    {
        Bus myBus = new Bus("A1234",60,"Northumbria");

        boolean sucsess = myBus.changeSpeed(50);

        System.out.println("Opeeeration sucsessful? " + sucsess + ", Speed of Bus: " + myBus.getCurrentSpeed());

        sucsess = myBus.changeSpeed(-5);
        System.out.println("Opeeeration sucsessful? " + sucsess + ", Speed of Bus: " + myBus.getCurrentSpeed());

    }
}
