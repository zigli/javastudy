package cf.tilgiz.inheritance;

import java.util.List;

public class InheritanceMain {

    public static void main(String[] args) {

        Engine truckEngine = new Engine(6.3, EngineType.DIESEL, 900);
        Engine busEngine = new Engine(3.5, EngineType.DIESEL, 400);
        Auto truck = new Truck("Volvo", "VNL-300", truckEngine, 300, 500, 1000);
        Auto bus = new Bus("Mers", "Sprinter", busEngine, 30, 75, 12);
        Auto electricCar = new ElectricCar("Tesla", "S", 10, 4);
//        Auto auto = new Auto("Audi", "Q6", busEngine);


        runCar(bus);
        runCar(truck);
        runCar(electricCar);
//        runCar(auto );

        Auto.doSmth();
    }

    public static void runCar(Auto auto) {
        auto.start();
        auto.stop();
//        if(auto instanceof FuelAuto){
//            FuelAuto fAuto = (FuelAuto) auto;
//            fAuto.fuelUp(50);
//        }
        auto.energize();
    }

}
