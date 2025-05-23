public class Book {
    
    String title;
    String author;

    public Book(String title) {

        this.title = title;
    }

    public Book(String title, String author) {

        this.title = title;
        this.author = author;
    }

    public static void main(String[] args) {
        
        Book book1 = new Book("One Thousand and One Nights");

        Book book2 = new Book("Montezuma's Daughter", "Henry Rider Haggard");
        
        System.out.println("Book-1:");
        System.out.println("Title: " + book1.title);

        System.out.println("Book-2:");
        System.out.println("Title: " + book2.title);
        System.out.println("Author: " + book2.author);
    }
}
