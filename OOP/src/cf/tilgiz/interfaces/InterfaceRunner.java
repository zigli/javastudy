package cf.tilgiz.interfaces;

public class InterfaceRunner {

    public static void main(String[] args) {

        Pricable pizza = new Pizza("Neopolitana", 1, 20, Size.L);
        Pricable phone = new CellPhone("Motorola", "XT33", 1, 250);
        Pricable fridge = new Fridge("LG", "E950", 1, 300);

        printDeliveryPrice(pizza);
        printDeliveryPrice(phone);
        printDeliveryPrice(fridge);

    }

    private static void printDeliveryPrice(Pricable delivey) {
        System.out.println("Delivery price is: " + delivey.calcDeliveryPrice());
        System.out.println("Order price is: " + delivey.calcOrderPrice());
        System.out.println("-------------------------");
        System.out.println("Total price is: "+delivey.calcPrice());
        System.out.println("");

    }
}
