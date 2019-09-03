package cf.tilgiz.oop;

public class Main {

    public static void main(String[] args) {

        System.out.println("Dog's count " + Dog.getDogsCount());

        Dog lab = new Dog();
        lab.setName("Dogname");
        lab.setSize(Size.BIG);
        lab.bark();
        lab.bite();

        Dog sheppard = new Dog();
        sheppard.setBreed("Shepard");
        sheppard.setName("Frrd");
        sheppard.setSize(Size.VERY_BIG);
        sheppard.bark();
        sheppard.bite();


        Dog doberman = new Dog();
        doberman.setSize(Size.BIG);
        doberman.bark();
        doberman.bite();

        System.out.println("----------------------------------------");

        Size s = Size.VERY_SMALL;
        System.out.println(s.getAbbrevation());
        System.out.println(s);
        Size s1 =Size.valueOf("BIG");
        System.out.println(s1);

        Size[] values = Size.values();
        for (Size str: values ) {
            System.out.println(str);
        }


    }


}
