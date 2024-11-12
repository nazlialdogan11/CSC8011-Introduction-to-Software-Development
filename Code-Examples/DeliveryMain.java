class DeliveryMain {
    public static void main(String[] args) {
        Delivery myDelivery = new Delivery("10 FooBar Drive");
        
        myDelivery.addItem("Crisps");
        myDelivery.addItem("Pizza");
        myDelivery.addItem("Parmo");
        
        for (String current : myDelivery.getList())
        {
            System.out.println(current);
        }
    }
}