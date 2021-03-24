import java.util.ArrayList;

public class Library {
    private ArrayList<String> Book;
    private ArrayList<String> Employee;
    private ArrayList<String> User;

    public ArrayList<String> getBook() {
        return Book;
    }

    public void setBook(ArrayList<String> book) {
        Book = book;
    }

    public ArrayList<String> getEmployee() {
        return Employee;
    }

    public void setEmployee(ArrayList<String> employee) {
        Employee = employee;
    }

    public ArrayList<String> getUser() {
        return User;
    }

    public void setUser(ArrayList<String> user) {
        User = user;
    }

    public Library(ArrayList<String> book, ArrayList<String> employee, ArrayList<String> user) {
        Book = book;
        Employee = employee;
        User = user;
    }
}
