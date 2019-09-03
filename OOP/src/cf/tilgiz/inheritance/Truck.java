package cf.tilgiz.inheritance;

public class Truck extends FuelAuto {

    private int cargoWeight;

    public Truck(String producer, String model, EngineType engineType, int avaliablePetrol, int tankVolume, int cargoWeight) {
        super(producer, model, engineType, avaliablePetrol, tankVolume);
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
}
