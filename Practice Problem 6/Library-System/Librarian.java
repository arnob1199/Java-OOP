public class Librarian {

    int id;
    String name;

    void searchBook(String bookName) {

        System.out.println("Searching for book: " + bookName);
    }

    boolean verifyMember(int userId) {
        
        System.out.println("Verifying user ID: " + userId);
        return true;
    }

    void orderBooks() {

        System.out.println("Ordering books.");
    }

    void sellBooks() {
        
        System.out.println("Selling books.");
    }
}
