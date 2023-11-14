public class Runner258 // DONE can submit https://github.com/Will-I-Am-Ham/2.5.9
{
  public static void main(String[] args) {
    // Step 1
    System.out.println(MediaLib.getOwner() + "'s Library");

    // Step 8
    MediaLib.changeOwner("William");
    System.out.println(MediaLib.getOwner() + "'s Library");

    MediaLib books = new MediaLib();
    MediaLib movies = new MediaLib();

    Book B = new Book("cats", "auth");
    books.addBook(B);
    Book M = new Book("cats", "auth");
    movies.addBook(M);

    // Step 17
    System.out.println(books.getNumEntries());

    books.addBook(new Book("dogs", "auth"));
    books.addBook(new Book("dogs", "auth"));

    System.out.println(books.getNumEntries()); // Step 22
  }
}