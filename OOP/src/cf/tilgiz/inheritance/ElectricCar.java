package cf.tilgiz.inheritance;

public class ElectricCar extends Auto {

    private int battterVolume;
    private int passengerNumber;

    public ElectricCar(String producer, String model, int battterVolume, int passengerNumber) {
        super(producer, model, new Engine());
        this.battterVolume = battterVolume;
        this.passengerNumber = passengerNumber;
        System.out.println("ElectricCar was initialized");
    }

    private void charge(){
        System.out.println("Battery is charging");
    }

    public int getBattterVolume() {
        return battterVolume;
    }

    public void setBattterVolume(int battterVolume) {
        this.battterVolume = battterVolume;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    @Override
    public void energize() {
        charge();
    }

    @Override
    public void start() {
        isRunning = true;
        setCurrentSpeed(10);
        System.out.println("ElectricCar is starting");
    }

    @Override
    public void stop() {
        isRunning = false;
        setCurrentSpeed(0);
        System.out.println("ElectricCar is stopped");
    }
}
