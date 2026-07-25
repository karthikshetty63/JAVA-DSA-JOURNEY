package oops2;

public class overloading {
    public static void main(String[] args) {
        Calculater calc = new Calculater();
        System.out.println(calc.sum(1, 2));
    }

}

class Calculater {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a - b;
    }
}