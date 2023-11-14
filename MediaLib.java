public class MediaLib {
  private Book book;
  private Movie movie;
  private Song song;
  private String date;

  public static String owner = "PLTW";


  public MediaLib(){ //2.5.9 step 21
    date = NewDate.GetCurrentTime();
  }
  
  // Step 14
  private static int numEntries = 0;

  public void addBook(Book b) {
    if (book != null) {
      System.out.println("already book in here"); // Step 24
      return;
    }
    numEntries++; // Step 15
    book = b;

    date = NewDate.GetCurrentTime();
  }

  public void addMovie(Movie b) {
    if (movie != null) {
      System.out.println("already movie in here"); // Step 24
      return;
    }
    numEntries++; // Step 15
    movie = b;

    date = NewDate.GetCurrentTime();
  }

  public void addSong(Song b) {
    if (song != null) {
      System.out.println("already song in here"); // Step 24
      return;
    }
    numEntries++; // Step 15
    song = b;

    date = NewDate.GetCurrentTime();
  }

  // new step 18-22
  /*
   * test scenario
   * public void testBook(Book tester)
   * {
   * tester.setTitle("Animal Farm");
   * // show state chagne with one of the following
   * System.out.println(" in test: " + tester);
   * System.out.println(" in test: " + tester.getTitle());
   * }
   */

  public String toString() {
    String info = "";

    // Step 5, avoid crashing by testing that book is not null before using its
    // toString method
    if (book != null)
      info += "Book: " + book + "\n";
    if (movie != null)
      info += "Movie: " + movie + "\n";
    if (song != null)
      info += "Song: " + song + "\n";

    info += "Last Update: " + date;
    
    return info;
  }

  // Step 1
  public static String getOwner() {
    return owner;
  }

  // Step 8
  public static void changeOwner(String newOwner) {
    owner = newOwner;
  }

  // Step 14
  public int getNumEntries() {
    System.out.println("Test: Owner is " + owner);
    return numEntries;
  }

  public String getLastUpdate(){
    return date;
  }
}
