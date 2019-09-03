package cf.tilgiz.oop;

public class Dog {

    private static int dogsCount;

    public static final int POWS = 4;
    public static final int TAIL = 1;
    private String name;
    private String breed;
    private Size size;


    Dog() {
        dogsCount++;
        System.out.println("Dogs count is: " + dogsCount);
    }

    public static int getDogsCount() {
        return dogsCount;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void bark() {
        switch (size){
            case BIG:case VERY_BIG:
                System.out.println("Wof - wof");
                break;
            case AVARAGE:
                System.out.println("Raf - raf");
                break;
            case SMALL: case VERY_SMALL:
                System.out.println("Tyaf - tyaf");
                break;
        }
    }

    public void bite() {
        if (dogsCount > 2) {
            System.out.println("Dogs are biting you");
        }else{
            bark();
        }

    }

}
