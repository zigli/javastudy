package cf.tilgiz.innerclasss;

public class CellPhone {

    private String make;
    private String model;
    private Display display;
    private RadioModule gms;
    private AbstractPhoneButton button;

    public interface AbstractPhoneButton{
        void click();
    }

    public CellPhone(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void turnOn() {
        initDisplay();
        gms = new RadioModule();
        initButton();
    }

    public void initButton(){
        button = new AbstractPhoneButton() {
            @Override
            public void click() {
                System.out.println("Button clicked");
            }
        };

    }

    public void call(String number){
        button.click();
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
