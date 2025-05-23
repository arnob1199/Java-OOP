public class Books {

    int bookId;
    String bookName;
    String bookAuthor;
    String yearOfPub;
    float price;
    String status;

    void addNewBooks() {

        System.out.println("New book added.");
    }

    void deleteBooks() {

        System.out.println("Book deleted.");
    }

    void displayBookDetails() {

        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + bookAuthor);
        System.out.println("Year: " + yearOfPub);
        System.out.println("Price: " + price + " USD");
        System.out.println("Status: " + status);
    }

    void inquiryBook() {

        System.out.println("Book inquiry done.");
    }
}
