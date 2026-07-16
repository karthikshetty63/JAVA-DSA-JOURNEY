package oops;

class ClassObj {
    public static void main(String[] args) {
        CE student = new CE();
        student.calcPercentage(80, 70, 90);
        System.out.println("Percentage: " + student.percentage);

        Pen pen = new Pen();
        pen.setColor("yellow");
        System.out.println("the pen color is " + pen.color);
        bankAcoount myacnt = new bankAcoount();
        myacnt.username = "karthik shetty";
        System.out.println("user name is " + myacnt.username);
    }
}

class CE {
    String name;
    int usn;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int maths) {
        percentage = (phy + chem + maths) / 3.0f;

    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class bankAcoount {
    public String username;
    private char password;
}

class book {
    public String bookname;
    private int price;

    void getchangeprice{
        this.
    }
}