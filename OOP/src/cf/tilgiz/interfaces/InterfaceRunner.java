package cf.tilgiz.interfaces;

public class InterfaceRunner {

    public static void main(String[] args) {

        Deliverable pizza = new Pizza("Neopolitana", 1, 20, Size.L);
        Deliverable phone = new CellPhone("Motorola", "XT33", 1, 250);
        Deliverable fridge = new Fridge("LG", "E950", 1, 300);

        printDeliveryPrice(pizza);
        printDeliveryPrice(phone);
        printDeliveryPrice(fridge);

    }

    private static void printDeliveryPrice(Deliverable delivey) {
        System.out.println("Delivery price is: " + delivey.calcDeliveryPrice());
    }
}
