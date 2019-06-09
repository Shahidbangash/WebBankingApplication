import java.io.Serializable;

public class Person implements Serializable {

    private String firstName;
    private String lastName;
    private int acNumber;
    private int balance;
    private String userName ;
    private String password;
//    private Date dob;

    public Person(String firstName, String lastName,int acNumber, int balance, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.acNumber = acNumber;

        userName = getFirstName() + getLastName();
        this.balance = balance;
        this.password = password;

//        this.dob = dob;
    }




    public void updateBalance(int num){
        balance = getBalance() - num;
    }


    public int getAcNumber() {
        return acNumber;
    }

    public void setAcNumber(int acNumber) {
        this.acNumber = acNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
