package oops2;

public class inheritence {
    public static void main(String[] args) {
        fish shark = new fish();
        shark.setFins(2);
        System.out.println("the fins are" + shark.getFins());
        shark.eat();
        shark.breath();
        Animal tiger = new Animal();
        tiger.eat();

    }

}

class Animal {
    int color;

    void eat() {
        System.out.println("eats");
    }

    void breath() {
        System.out.println("breaths");
    }
}

class fish extends Animal {
    int fins;
    String taste;

    void taste() {
        System.out.println("good");
    }

    void setFins(int fins) {
        this.fins = fins;
    }

    int getFins() {
        return fins;
    }

}
