import java.util.Scanner;

/**
 * MainActivity
 */
public class MainActivity extends AddBooklist {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Do you went to start the application:");
        System.out.println("Press 1 to start \n and Press 0 to exit");
        // now i am going to declare a variable to ask the user to give what he or she
        // went..//
        int startOrNot = input.nextInt();
        boolean whichOne = startOrNot == 1;
        while (whichOne) {
            System.out.println("Your application is started");
            System.out.println(
                    "1.Adding to the book list\n2.Adding to the already read book list\n3.Delete a list\n 4.Exit");
            // now i am going to ask the user about their choise..//
            System.out.println("enter your choise above optionn but you have to chose with only number");
            int option = input.nextInt();
            switch (option) {
                case 1:
                    System.out.println("So you went to add a book to the list");
                    AddBooklist addBooklist = new AddBooklist();
                    input.nextLine();
                    System.out.println("Enter your book name:");
                    String bookName = input.nextLine();
                    if (bookName.isEmpty()) {
                        System.out.println("You need to add some book name in the box !!");
                    } else {
                        addBooklist.addToBookList(bookName);
                        addBooklist.displayBookList();
                    }

                    break;
                case 2:
                    System.out.println("So you went to add the book to already readed book list");
                    // now i am going to declare the new class and inicialize it as an class
                    // object....//
                    ListOfReadedBook listOfReadedBook = new ListOfReadedBook();
                    input.nextLine();
                    // now i am going to take some data from the user..//
                    System.out.println("Enter the book you went to read :");
                    String addWentToRsead = input.nextLine();
                    if (addWentToRsead.isEmpty()) {
                        System.out.println("Their is no data and you can't add empty list");
                    } else {
                        listOfReadedBook.addToTheAlreadyBookList(addWentToRsead);
                        listOfReadedBook.displayTheListOfBookThatYouWentToRead();

                    }
                    break;
                case 3:
                    System.out.println("So you went to delete a book from the list");
                    delete d = new delete();
                    input.nextLine();
                    System.out.println("Enter the book you went to delete:");
                    String nameyouWentToDelete = input.nextLine();
                    if (nameyouWentToDelete.isEmpty()) {
                        System.out.println("You need to enter the book name:");
                    } else {
                        d.deleteABook(nameyouWentToDelete);
                    }
                    break;
                default:
                    whichOne = startOrNot == 0;
                    break;
            }
        }
    }
}