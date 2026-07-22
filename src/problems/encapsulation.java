package problems;

public class encapsulation {
    public static void main(String[] args) {
        hostel nalanda = new hostel();
        nalanda.setStudent("karthik");
        System.out.println("the student name is" + nalanda.getStudent());
    }

}

class hostel {
    private String name;
    private int id;
    private int roomno;

    public void setStudent(String name) {
        this.name = name;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setRoom(int roomno) {
        this.roomno = roomno;
    }

    public String getStudent() {
        return name;

    }

    public int getID() {
        return id;

    }

}
