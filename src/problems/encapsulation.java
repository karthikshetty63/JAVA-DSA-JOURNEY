package problems;

public class encapsulation {
    public static void main(String[] args) {
        hostel nalanda = new hostel("karthik");
        
        System.out.println("the student name is" + nalanda.hostel());
    }

}

class hostel {
    private String name;
    private int id;
    private int roomno;

   hostel(String name) {
        this.name = name;
    }
    void

    hostel(int id) {
        this.id = id;
    }

   hostel(int roomno) {
        this.roomno = roomno;
    }

    public String gethostel() {
        return name;

    }

    public int gethostel() {
        return id;

    }

}
