package oops;

class Bank {

    public static void main(String[] args) {

        BankDetail karthik = new BankDetail();

        karthik.setAcntId(99);

        System.out.println(
                "The account ID is " + karthik.getAcntId());

        karthik.setBalance(5000);

        System.out.println(
                "The balance is " + karthik.getBalance());
    }
}

class BankDetail {

    private int acntId;
    private String username;
    private int balance;

    public void setAcntId(int acntId) {

        if (acntId >= 0 && acntId <= 100) {
            this.acntId = acntId;
        } else {
            System.out.println("Enter a valid account ID.");
        }
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setBalance(int balance) {

        if (balance >= 0) {
            this.balance = balance;
            System.out.println("The amount is credited.");
        } else {
            System.out.println("Enter a valid amount.");
        }
    }

    public int getAcntId() {
        return acntId;
    }

    public String getUsername() {
        return username;
    }

    public int getBalance() {
        return balance;
    }
}
// * my mistakes are: not ending with semicolon BankDetail karthik = new
// BankDetail();

/*->not ending with semicolon BankDetail karthik = new BankDetail(); 
 karthik.setAcntId(99); 
 -> the getter and setters name shoul be same here 
 public int getAcntId(),  public void setAcntId()

 -> remeber this syntax 
 karthik.setAcntId(99);

 System.out.println(
         "The account ID is " + karthik.getAcntId()
 );
 ->rember "this" concept

 */