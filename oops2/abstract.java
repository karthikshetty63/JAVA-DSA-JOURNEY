package oop2;


public class abstract
{
    public static void main(String[]args)
    {
        chicken c=new chicken();
        c.eat();
        c.bark();
        Horse h=new Horse();
        h.bark();
        h.eat();

}

}
abstract class Animal {
    void eat() {
        System.out.println("Animal eats");
    }

    abstract  void bark()
}

    class Horse extends Animal {
        void bark() {
            System.out.println("khoooooo");

        }
    }

    class chicken extends Animal {
     void bark(){
        System.out.println("kokhokhoo");S
    }
}
