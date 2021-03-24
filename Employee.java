import java.util.ArrayList;

public class Employee extends User{
    private int ptoDays;
    private String username;
    private String password;

    public Employee(String firstName, String lastName, String email, int userID, ArrayList<String> checkedOutBooks, double balancedUnpaid) {
        super(firstName, lastName, email, userID, checkedOutBooks, balancedUnpaid);
    }

    public Employee(User someUser, int i, String briham, String examplepassword) {
        super(someUser, i, briham, examplepassword);
    }

    public int getPtoDays() {
        return ptoDays;
    }

    public void setPtoDays(int ptoDays) {
        this.ptoDays = ptoDays;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Employee(String firstName, String lastName, String email, int userID, ArrayList<String> checkedOutBooks, double balancedUnpaid, int ptoDays, String username, String password) {
        super(firstName, lastName, email, userID, checkedOutBooks, balancedUnpaid);
        this.ptoDays = ptoDays;
        this.username = username;
        this.password = password;
    }

    @Override
    public void overduePayments(int daysOverdue) {
        super.overduePayments(daysOverdue);
        daysOverdue+= 10;
    }
}
