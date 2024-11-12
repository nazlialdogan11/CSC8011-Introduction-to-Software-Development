public class UsePerson {

    public static void main(String[] args)
    {
        Person p1 = new Person("Joe",50,"1 Joeville UK");

        Person p2 = new Person("Sally",40,"10 Sallyville, UK");

        System.out.println(p1.getName() + ", " + p1.getAddress());
        System.out.println(p1.getAge());
        p1.birthday();
        System.out.println(p1.getAge());

        System.out.println(p2.getName() + ", " + p2.getAddress());

        p2.setAddress(p1.getAddress());
        /*
            String newAddress = p1.getAddress();
            p2.setAddress(newAddress);
         */

        System.out.println("After Sally moves in with Joe: " + p2.getName() + ", " + p2.getAddress());


    }
}
