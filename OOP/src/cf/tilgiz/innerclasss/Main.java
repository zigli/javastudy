package cf.tilgiz.innerclasss;

public class Main {

    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone("Motorola", "XT554");
        cellPhone.turnOn();
        Display display = cellPhone.getDisplay();
        Display.Pixel pixel = new Display.Pixel(140,100, Display.Color.RED);
    }
}
