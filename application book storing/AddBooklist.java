import java.util.ArrayList;

public class AddBooklist {
    private static ArrayList<String> arrayNameList = new ArrayList<>();

    public Void addToBookList(String myBookName) {
        arrayNameList.add(myBookName);

        return null;
    }

    public ArrayList<Void> displayBookList() {
        for (int i = 0; i < arrayNameList.size(); i++) {
            System.out.println("the list of book : " + arrayNameList.get(i));
        }

        return null;

    }
}
