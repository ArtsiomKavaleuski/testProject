import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ListManager lm = new ListManager();

        while (true) {
            printMenu();

            String userChoice = scan.nextLine();
            String userList, userNote;

            switch (userChoice) {
                case "1":
                    System.out.println("Enter the name of the list");
                    userList = scan.nextLine();

                    System.out.println("Enter your note");
                    userNote = scan.nextLine();

                    lm.addNoteToList(userList, userNote);
                    break;
                case "2":
                    System.out.println("Enter the list from which to remove a note.");
                    userList = scan.nextLine();
                    if (!lm.lists.containsKey(userList)) {
                        System.out.println("Entered list doesn't exist.");
                        System.out.println("Please, choose one of the existing lists:");
                        System.out.println(lm.lists.keySet());
                        userList = scan.nextLine();
                    }
                    System.out.println("Enter the note to remove.");
                    userNote = scan.nextLine();

                    lm.removeNoteFromList(userList, userNote);

                    break;
                case "3":
                    System.out.println("There are the following lists:");

                    lm.showLists();

                    break;
                case "4":
                    System.out.println("Enter the list to display it's notes");
                    userList = scan.nextLine();
                    lm.showNotes(userList);
                    break;
                case "5":
                    lm.showNotes();
                    break;
                case "0":
                    System.out.println("Good bye!");
                    return;
            }

        }

    }

    public static void printMenu() {
        int sideInterval = 3;
        String commonPhrase = "Please, choose one of the following commands:";
        String optionOne = "1 - Create new note";
        String optionTwo = "2 - Remove note from list";
        String optionThree = "3 - Show all lists";
        String optionFour = "4 - Show the notes in list";
        String optionFive = "5 - Show all notes in all lists";
        String optionExit = "0 - Exit";

        System.out.println("╔" + "═".repeat(commonPhrase.length() + sideInterval * 2) + "╗");
        //System.out.println("*" + " ".repeat(commonPhrase.length() + sideInterval * 2) + "*");
        System.out.println("║" + " ".repeat(sideInterval) + commonPhrase + " ".repeat(sideInterval) + "║");
        System.out.println("║" + " ".repeat(sideInterval) + optionOne + " ".repeat(commonPhrase.length() - optionOne.length() + sideInterval) + "║");
        System.out.println("║" + " ".repeat(sideInterval) + optionTwo + " ".repeat(commonPhrase.length() - optionTwo.length() + sideInterval) + "║");
        System.out.println("║" + " ".repeat(sideInterval) + optionThree + " ".repeat(commonPhrase.length() - optionThree.length() + sideInterval) + "║");
        System.out.println("║" + " ".repeat(sideInterval) + optionFour + " ".repeat(commonPhrase.length() - optionFour.length() + sideInterval) + "║");
        System.out.println("║" + " ".repeat(sideInterval) + optionFive + " ".repeat(commonPhrase.length() - optionFive.length() + sideInterval) + "║");
        System.out.println("║" + " ".repeat(sideInterval) + optionExit + " ".repeat(commonPhrase.length() - optionExit.length() + sideInterval) + "║");
        //System.out.println("*" + " ".repeat(commonPhrase.length() + sideInterval * 2) + "*");
        System.out.println("╚" + "═".repeat(commonPhrase.length() + sideInterval * 2) + "╝");
        System.out.print("Your choice: ");
    }
}
