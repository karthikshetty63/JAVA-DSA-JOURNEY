package oops2;

public class overiding {
    public static void main(String[] args) {
        Bigdee b1 = new Bigdee();
        b1.eat();
        Deer b2 = new Deer();
        b2.eat();
    }

}

class Deer {
    void eat() {
        System.out.println("eats grass");
    }
}

class Bigdee extends Deer {
    void eat() {
        System.out.println("also eat leaf");
    }
}
