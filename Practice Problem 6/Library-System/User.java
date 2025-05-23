import java.util.Date;

public class User {

    int userID;
    String userName;
    String userAddress;
    int phoneNo;

    void returnBooks() {

        System.out.println("Returning books.");
    }

    int payFine(Date dt) {

        System.out.println("Paying fine on: " + dt);
        return 100;
    }

    void addNewUser() {

        System.out.println("New user added.");
    }

    void deleteUser() {

        System.out.println("User deleted.");
    }

    void updateDetails() {

        System.out.println("Updating user details.");
    }

    void bookPurchase() {
        
        System.out.println("Book purchased.");
    }
}
