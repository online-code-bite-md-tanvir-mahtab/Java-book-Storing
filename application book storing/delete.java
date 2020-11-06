import java.util.ArrayList;

public class delete {
    /**
     * i created a mathod that will take an string variable and that parameter will
     * help the code to think which it need to delete from the list
     */
    private static ArrayList<String> deleateAName = new ArrayList<>();

    public void deleteABook(String deleteABookd) {
        deleateAName.remove(deleteABookd);
    }
}
