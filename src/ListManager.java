import java.util.ArrayList;
import java.util.HashMap;

public class ListManager {
    public final int MAX_NUMBER_OF_LISTS = 10;
    public final int MAX_NUMBER_OF_NOTES_PER_LIST = 10;
    HashMap<String, ArrayList<String>> lists = new HashMap<>();

    public void addNoteToList (String list, String note) {
        lists.computeIfAbsent(list, k -> new ArrayList<>()).add(note);
    }

    public void removeNoteFromList (String list, String note) {
        lists.get(list).remove(note);
    }

    public void showLists () {
        for (String list : lists.keySet()) {
            System.out.println(list);
        }

    }

    public void showNotes () {
        for (String list: lists.keySet()) {
            System.out.println(list + ":");
            for (int i = 0; i < lists.get(list).size(); i++) {
                System.out.println(" " + (i + 1) + ". " + lists.get(list).get(i));
            }
        }
    }

    public void showNotes (String list) {
        System.out.println("The list " + list + " contains following notes:");
        for (int i = 0; i < lists.get(list).size(); i++) {
            System.out.println(" " + (i + 1) + ". " + lists.get(list).get(i));
        }
    }

}
