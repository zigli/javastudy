package cf.tilgiz.inheritance;

public class Truck extends FuelAuto {

    private int cargoWeight;

    public Truck(String producer, String model, Engine engine, int avaliablePetrol, int tankVolume, int cargoWeight) {
        super(producer, model, engine, avaliablePetrol, tankVolume);
        this.cargoWeight = cargoWeight;
        System.out.println("Truck was initialized");
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public void load(){
        System.out.println("Cargo is loaded");
    }

    public void unload(){
        System.out.println("Cargo is unloaded");
    }

    @Override
    public void energize() {
        fuelUp(getTankVolume()-getAvaliablePetrol());
    }

    @Override
    public void start() {
        isRunning = true;
        setCurrentSpeed(10);
        System.out.println("Truck is starting");
    }

    @Override
    public void stop() {
        isRunning = false;
        setCurrentSpeed(0);
        System.out.println("Truck is stopped");
    }

}
