
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

  // main function to add a book to the library
  public static void main(String[] args) {
    List<Book> library = new ArrayList<Book>();
    int choice = 0;
    Scanner read;
    while (choice != 5) {
      read = new Scanner(System.in); 
      System.out.println("1. Add book");
      System.out.println("2. Remove book");
      System.out.println("3. Search book");
      System.out.println("4. Print library");
      System.out.println("5. Exit");
      System.out.print("Enter choice: ");
      choice = read.nextInt();
      switch (choice) {
        case 1:
          addBook(library);
          break;
        case 5:
          System.out.println("Goodbye");
          break;
        default:
          System.out.println("Invalid choice");
      }
    }
  }


  // create method to add books to library
  public static void addBook(List<Book> library) {
    Scanner input = new Scanner(System.in);

    // create book object
    Book book = new Book();

    // get book title
    System.out.println("Enter book title: ");
    String title = input.nextLine();
    book.setTitle(title);

    // get book author
    System.out.println("Enter book author: ");
    String author = input.nextLine();
    book.setAuthor(author);

    // get book publisher
    System.out.println("Enter book publisher: ");
    String publisher = input.nextLine();
    book.setPublisher(publisher);

    // get book release date
    System.out.println("Enter book release date: ");
    String releaseDate = input.nextLine();
    book.setReleaseDate(releaseDate);

    // get book pages
    System.out.println("Enter book pages: ");
    String pages = input.nextLine();
    book.setPages(pages);

    // get book genre
    System.out.println("Enter book genre: ");
    String genre = input.nextLine();
    book.setGenre(genre);

    // get book isbn
    System.out.println("Enter book isbn: ");
    String isbn = input.nextLine();
    book.setIsbn(isbn);

    // get book location
    System.out.println("Enter book location: ");
    System.out.println("Enter book location floor: ");
    String floor = input.nextLine();
    System.out.println("Enter book location hallway: ");
    String hallway = input.nextLine();
    System.out.println("Enter book location shelf: ");
    String shelf = input.nextLine();
    System.out.println("Enter book location position x: ");
    String x = input.nextLine();
    System.out.println("Enter book location position y: ");
    String y = input.nextLine();
    Position position = new Position(x, y);
    Location location = new Location(floor, hallway, shelf, position);
    book.setLocation(location);

    String state = "available";
    book.setState(state);

    // get book description
    System.out.println("Enter book description: ");
    String description = input.nextLine();
    book.setDescription(description);

    // add book to library
    library.add(book);
  }
}