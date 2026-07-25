package oops2;

public class HybridInherit {
    public static void main(String[] args) {
        peacock p1 = new peacock();
        p1.fly();
        p1.beautiful();
        tuna t1 = new tuna();
        t1.fins();
    }
}

class Animal {
    String eat;

    void eat() {
        System.out.println("eats");
    }

}

class fish extends Animal {
    String swim;

    void swim() {
        System.out.println("swims");
    }

}

class tuna extends fish {
    int fins;

    void fins() {
        System.out.println("2 fins");
    }

}

class shark extends tuna {
    String taste;

    void taste() {
        System.out.println("good");
    }
}

class bird extends Animal {
    String fly;

    void fly() {
        System.out.println("it flys");
    }
}

class peacock extends bird {
    String beautiful;

    void beautiful() {
        System.out.println("yes");
    }
}