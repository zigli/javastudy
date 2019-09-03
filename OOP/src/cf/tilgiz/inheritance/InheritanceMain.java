package cf.tilgiz.inheritance;

public class InheritanceMain {

    public static void main(String[] args) {

        Truck truck = new Truck("Volvo","VNL-300",EngineType.PETROL,300, 500,1000);
        truck.start();
        truck.accelerate(40);
        truck.stop();
        truck.fuelUp(50);
        truck.load();
        truck.unload();

        System.out.println("-----------------------------------------------");

        ElectricCar electricCar = new ElectricCar("Tesla", "S", 10,4);
        electricCar.start();
        electricCar.stop();
        electricCar.charge();

        System.out.println("-----------------------------------------------");

        Bus bus = new Bus("Mers","Sprinter",EngineType.DIESEL,30, 75,12);
        bus.start();
        bus.fuelUp();
        bus.pickUpPassengers(5);
        bus.accelerate(40);
        bus.releasePasssengers();
        bus.stop();

    }

}
