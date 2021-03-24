import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book someBook1 = new Book("Title1", "Author1", 456);
        Book someBook2 = new Book("Title2", "Author2", 123);
        Book somebook3 = new Book("Title3", "Author3", 345);
        User someUser = new User("Brian", "Smith", "brians@gmail.com", 123, "somebook1", 45);
        Employee someEmployee = new Employee(someUser, 5, "briham", "examplepassword");
    }
}
