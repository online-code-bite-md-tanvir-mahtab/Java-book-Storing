import java.util.ArrayList;

public class ListOfReadedBook {
    // now i am going to declare the arraylist and inisialize it.//
    private static ArrayList<String> readedBookList = new ArrayList<>();

    /**
     * now i am going to create the mathod that will hold the list of the array book
     * and when the user went to check he or she can do that
     */
    public Void addToTheAlreadyBookList(String bookofReadedList) {
        // now i am going to add the book to the list of array with the help of add
        // mathod.....//
        readedBookList.add(bookofReadedList);
        return null;
    }

    /**
     * now i am also going to create a mathod that will print out the list of the
     * book you went to read
     */
    public Void displayTheListOfBookThatYouWentToRead() {
        System.out.println("Your list of book that you went to read in the future:");
        for (int i = 0; i < readedBookList.size(); i++) {
            System.out.println(readedBookList.get(i));
        }
        return null;

    }
}
