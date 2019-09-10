package cf.tilgiz.innerclasss;

public class Main {

    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone("Motorola", "XT554");
        cellPhone.turnOn();
        Display display = cellPhone.getDisplay();
        Display.Pixel pixel = display.new Pixel(14300,100, Display.Color.RED);


    }
}
