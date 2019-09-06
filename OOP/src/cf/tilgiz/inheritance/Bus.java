package cf.tilgiz.inheritance;

public class Bus extends FuelAuto {

    private int passengerNumber;

    public Bus(String producer, String model, Engine engine, int avaliablePetrol, int tankVolume, int passengerNumber) {
        super(producer, model, engine, avaliablePetrol, tankVolume);
        this.passengerNumber = passengerNumber;
        System.out.println("Bus was initialized");
    }

    public void fuelUp(){
        int volume = getTankVolume() - getAvaliablePetrol();
        fuelUp(volume);
    }

    @Override
    public void fuelUp(int petrolVolume) {
        int volume = getAvaliablePetrol() + petrolVolume;
        if(volume > getTankVolume()){
            setAvaliablePetrol(getTankVolume());
        }
        System.out.println("Adding Diesel");
    }

    @Override
    public void start() {
        isRunning = true;
        setCurrentSpeed(10);
        System.out.println("Bus is starting");
    }

    @Override
    public void stop() {
        isRunning = false;
        setCurrentSpeed(0);
        System.out.println("Bus is stopped");
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public void pickUpPassengers(int passengerNum) {
        this.passengerNumber += passengerNum;
        System.out.println("Picking up " + passengerNumber + "passengers");
    }

    public void releasePasssengers() {
        if (isRunning) {
            stop();
        }
        passengerNumber = 0;
        System.out.println("Passengers drop off");
    }

    @Override
    public void energize() {
        fuelUp(getTankVolume()-getAvaliablePetrol());
    }
}
