import java.util.ArrayList;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private int userID;
    private ArrayList<String> checkedOutBooks;
    private double balancedUnpaid;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public ArrayList<String> getCheckedOutBooks() {
        return checkedOutBooks;
    }

    public void setCheckedOutBooks(ArrayList<String> checkedOutBooks) {
        this.checkedOutBooks = checkedOutBooks;
    }

    public double getBalancedUnpaid() {
        return balancedUnpaid;
    }

    public void setBalancedUnpaid(double balancedUnpaid) {
        this.balancedUnpaid = balancedUnpaid;
    }

    public User(String firstName, String lastName, String email, int userID, ArrayList<String> checkedOutBooks, double balancedUnpaid) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.userID = userID;
        this.checkedOutBooks = checkedOutBooks;
        this.balancedUnpaid = balancedUnpaid;
    }
    public void overduePayments( int daysOverdue){
        System.out.println(firstName + "is" + daysOverdue + " days overdue and owes" + daysOverdue*50);

            
        }
    }







