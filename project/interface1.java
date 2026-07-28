package project;

public class interface1 {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.eat();
        b.walk();
        Bear2 d = new Bear2();
        d.eat();
        d.walk();
    }

}

interface herbi {
    void eat();

}

interface carnivores {
    void walk();
}

class Bear implements herbi, carnivores {
    public void eat() {
        System.out.println("it eats  meat and  also veg");
    }

    public void walk() {
        System.out.println("it walks");
    }

}

class Bear2 implements herbi, carnivores {
    public void eat() {
        System.out.println("eats fresh meet");
    }

    public void walk() {
        System.out.println("it walk fast");
    }
}
