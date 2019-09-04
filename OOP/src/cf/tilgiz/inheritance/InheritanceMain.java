package cf.tilgiz.inheritance;

import java.util.List;

public class InheritanceMain {

    public static void main(String[] args) {

        Engine truckEngine = new Engine(6.3, EngineType.DIESEL,900);

        Truck truck = new Truck("Volvo","VNL-300",truckEngine,300, 500,1000);
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

        Engine busEngine = new Engine(3.5,EngineType.DIESEL,400);

        Bus bus = new Bus("Mers","Sprinter",busEngine,30, 75,12);
        bus.start();
        bus.fuelUp();
        bus.pickUpPassengers(5);
        bus.accelerate(40);
        bus.releasePasssengers();
        bus.stop();

        Engine engine = bus.getEngine();
        System.out.println(engine.getEngineType());
        System.out.println(engine.getPistons());

        List<Piston> pistons = engine.getPistons();
        System.out.println(pistons);

    }

}
