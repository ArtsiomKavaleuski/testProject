import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printMenu();

    }

    public static void printMenu() {
        int sideInterval = 3;
        String commonPhrase = "Please, choose one of the following commands, just for the test I am lenthen the text:";
        String optionOne = "1 - Create list;";
        String optionTwo = "2 - Add the note to the list;";
        String optionThree = "3 - Show the list;";

        System.out.println("*".repeat(commonPhrase.length() + sideInterval * 2 + 2));
        //System.out.println("*" + " ".repeat(commonPhrase.length() + sideInterval * 2) + "*");
        System.out.println("*" + " ".repeat(sideInterval) + commonPhrase + " ".repeat(sideInterval) + "*");
        System.out.println("*" + " ".repeat(sideInterval) + optionOne + " ".repeat(commonPhrase.length() - optionOne.length() + sideInterval) + "*");
        System.out.println("*" + " ".repeat(sideInterval) + optionTwo + " ".repeat(commonPhrase.length() - optionTwo.length() + sideInterval) + "*");
        System.out.println("*" + " ".repeat(sideInterval) + optionThree + " ".repeat(commonPhrase.length() - optionThree.length() + sideInterval) + "*");
        //System.out.println("*" + " ".repeat(commonPhrase.length() + sideInterval * 2) + "*");
        System.out.println("*".repeat(commonPhrase.length() + sideInterval * 2 + 2));
        System.out.print("Your choice: ");
    }
}
