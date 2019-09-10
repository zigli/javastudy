package cf.tilgiz.innerclasss;

public class CellPhone {

    private String make;
    private String model;
    private Display display;
    private RadioModule gms;

    public CellPhone(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void turnOn() {
        initDisplay();
        gms = new RadioModule();
    }

    public void call(String number){
        gms.call(number);
    }

    public void initDisplay() {
        display = new Display();
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Display getDisplay() {
        return display;
    }
}
