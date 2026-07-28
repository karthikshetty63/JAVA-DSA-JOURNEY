package project;

public class static1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "karthik";
        System.out.println(s1.getName());
        int pers1 = Student.percentage(65, 56, 77);
        System.out.println(pers1);
        Student.college = "kvg";
        System.out.println(Student.college);
        Student s2 = new Student();
        int per2 = Student.percentage(88, 78, 99);
        System.out.println("the s2 percentage is " + per2);
        System.out.println(Student.college);
    }

}

class Student {
    static int percentage(int chem, int phy, int math) {
        return (chem + phy + math) / 3;
    }

    static String college;
    int rollno;
    String name;

    public void getName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    public void getRollno(int rollno) {
        this.rollno = rollno;
    }

    int getRollno() {
        return rollno;
    }
}
