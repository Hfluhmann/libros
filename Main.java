
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

  // main function to add a book to the library
  public static void main(String[] args) {
    List<Book> library = new ArrayList<Book>();
    int choice = 0;
    Scanner read;
    while (choice != 7) {
      read = new Scanner(System.in); 
      System.out.println("1. Add book");
      System.out.println("2. Remove book");
      System.out.println("3. Search book");
      System.out.println("4. Print library");
      System.out.println("5. Edit Book");
      System.out.println("6. Change State of Book");
      System.out.println("7. Exit");
      System.out.print("Enter choice: ");
      choice = read.nextInt();
      switch (choice) {
        case 1:
          addBook(library);
          break;
        case 2:
          deleteBook(library);
          break;
        case 3:
          searchBook(library);
          break;
        case 4:
          printLibrary(library);
          break;
        case 5:
          editBook(library);
          break;
        case 6:
          changeState(library);
          break;
        case 7:
          System.out.println("Goodbye");
          break;
        default:
          System.out.println("Invalid choice");
      }
    }
  }

  // method to print the library
  public static void printLibrary(List<Book> library) {
    System.out.println("----------------------------------");
    System.out.println("----------------------------------");
    for (Book book : library) {
      System.out.println("Title: " + book.getTitle());
      System.out.println("Author: " + book.getAuthor());
      System.out.println("Publisher: " + book.getPublisher());
      System.out.println("Release Date: " + book.getReleaseDate());
      System.out.println("Pages: " + book.getPages());
      System.out.println("Genre: " + book.getGenre());
      System.out.println("ISBN: " + book.getIsbn());
      System.out.println("Location: " + book.getLocation().getFloor() + " " + book.getLocation().getHallway() + " " + book.getLocation().getShelf());
      System.out.println("Position: " + book.getLocation().getPosition().getX() + " " + book.getLocation().getPosition().getY());
      System.out.println("State: " + book.getState());
      System.out.println("Description: " + book.getDescription());
      System.out.println("----------------------------------");
      System.out.println();
    }
    System.out.println("----------------------------------");
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

  public static void deleteBook(List<Book> library) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter book isbn: ");
    String isbn = input.nextLine();
    
    Book delete = null;
    for (Book book : library) {
      if (book.getIsbn().equals(isbn)) {
        delete = book;
      }
    }
    library.remove(delete);
  }

  // method to edit book based on isbn
  public static void editBook(List<Book> library) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter book isbn: ");
    String isbn = input.nextLine();

    for (Book book : library) {
      if (book.getIsbn().equals(isbn)) {
        // delete book from library
        deleteBook(library);

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
        String newIsbn = input.nextLine();
        book.setIsbn(newIsbn);

        // get book state
        System.out.println("Enter book state: ");
        String state = input.nextLine();
        book.setState(state);

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

        // get book description
        System.out.println("Enter book description: ");
        String description = input.nextLine();
        book.setDescription(description);

        // add book to library
        library.add(book);
      }
    }
  }

  // method to search book based on isbn, author, title
  public static void searchBook(List<Book> library) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter book isbn, author or title: ");
    String search = input.nextLine();
    System.out.println("----------------------------------");
    for (Book book : library) {
      if (book.getIsbn().equals(search) || book.getAuthor().equals(search) || book.getTitle().equals(search)) {
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Publisher: " + book.getPublisher());
        System.out.println("Release Date: " + book.getReleaseDate());
        System.out.println("Pages: " + book.getPages());
        System.out.println("Genre: " + book.getGenre());
        System.out.println("ISBN: " + book.getIsbn());
        System.out.println("Location: " + book.getLocation().getFloor() + " " + book.getLocation().getHallway() + " " + book.getLocation().getShelf());
        System.out.println("Position: " + book.getLocation().getPosition().getX() + " " + book.getLocation().getPosition().getY());
        System.out.println("----------------------------------");
        System.out.println();
      }
    }
  }

  // method to change state of book between available, borrowed, missing
  public static void changeState(List<Book> library) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter book isbn: ");
    String isbn = input.nextLine();
    System.out.println("1. Available");
    System.out.println("2. Borrowed");
    System.out.println("3. Missing");
    System.out.println("Enter state: ");
    String state = input.nextLine();
    for (Book book : library) {
      if (book.getIsbn().equals(isbn)) {
        if (state.equals("1")) {
          book.setState("available");
        } else if (state.equals("2")) {
          book.setState("borrowed");
        } else if (state.equals("3")) {
          book.setState("missing");
        }
      }
    }
  }
}