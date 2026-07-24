public class typesofInhertence {
    public static void main(String[] args) {
        Animal parrot = new Animal();
        parrot.eat();
        parrot.walk();
        parrot.sound();
    }

}

class Animal {
    String color;
    String eat;

    void eat() {
        System.out.println("eats");
    }

    String walk;

    void walk() {
        System.out.println("walks");
    }

    String sounds;

    void sound() {
        System.out.println("yes");
    }
}

class fish extends Animal {
    int fins;

    void fins() {
        System.out.println("2");

    }
}

class bird extends Animal {
    String flys;

    void flys() {
        System.out.println("yes");
    }
}