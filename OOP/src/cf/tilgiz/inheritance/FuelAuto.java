package cf.tilgiz.inheritance;

public abstract class FuelAuto extends Auto{

    private int avaliablePetrol;
    private int tankVolume;

    public FuelAuto(String producer, String model, Engine engine, int avaliablePetrol, int tankVolume) {
        super(producer, model, engine);
        this.avaliablePetrol = avaliablePetrol;
        this.tankVolume = tankVolume;
        System.out.println("FuelAuto was initialized");
    }

    public void fuelUp (int petrolVolume){
        avaliablePetrol+=petrolVolume;
        System.out.println("Adding fuel");

    }

    public int getAvaliablePetrol() {
        return avaliablePetrol;
    }

    public void setAvaliablePetrol(int avaliablePetrol) {
        this.avaliablePetrol = avaliablePetrol;
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
    }
}
