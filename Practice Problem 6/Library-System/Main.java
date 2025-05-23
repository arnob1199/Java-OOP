public class Main {
    public static void main(String[] args) {
        
        Books book1 = new Books();
        book1.bookId = 1;
        book1.bookName = "Captains Courageous";
        book1.bookAuthor = "Rudyard Kipling";
        book1.yearOfPub = "1897";
        book1.price = 10.99f;
        book1.status = "Available";

        User user1 = new User();
        user1.userID = 101;
        user1.userName = "Alice";
        user1.userAddress = "123 Library Street";
        user1.phoneNo = 123456789;

        Librarian librarian = new Librarian();
        librarian.id = 1;
        librarian.name = "Mr. Thomas";

        Publisher publisher = new Publisher();
        publisher.id = 201;
        publisher.name = "Doubleday";
        publisher.address = "456 Publisher Lane";
        publisher.phoneNo = 987654321;

        System.out.println("Book Info:");
        book1.displayBookDetails();

        System.out.println("\nUser Actions:");
        user1.addNewUser();
        user1.bookPurchase();
        user1.returnBooks();

        System.out.println("\nLibrarian Actions:");
        librarian.searchBook("Captains Courageous");
        boolean isVerified = librarian.verifyMember(user1.userID);
        System.out.println("User verified: " + isVerified);
        librarian.sellBooks();

        System.out.println("\nPublisher Actions:");
        publisher.addPub();
        publisher.orderStatus();
    }
}
