package cf.tilgiz.innerclasss;

public class Display {

    private static final int DISPLAY_HEIGHT = 1920;
    private static final int DISPLAY_WIDTH = 1280;

    public Display() {
        Pixel pixel = new Pixel(10, 10, Color.BLUE);
    }


    public static class Pixel {
        private int x;
        private int y;
        private Color color;

        public Pixel(int x, int y, Color color) {
            if (x >= 0 && x <= DISPLAY_WIDTH && y >= 0 && y <= DISPLAY_HEIGHT) {
                this.x = x;
                this.y = y;
                this.color = color;
                System.out.println("Creating " + color + " pixel at (" + x + ", " + y + ")");
            } else {
                throw new IllegalArgumentException("Coordinates should be between " + DISPLAY_HEIGHT + " " + DISPLAY_WIDTH);
            }
        }
    }

    public enum Color {

        RED, GREEN, BLUE, CYAN, MAGENTA, YELLOW, BLACK;
    }
}
