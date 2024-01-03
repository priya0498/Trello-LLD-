import Model.Board;
import Model.Card;
import Model.TrelloList;
import Model.User;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Controller controller = new Controller();


        User user1 = controller.createUser("Priya", "priya@gmail.com");
        User user2 = controller.createUser("Subham", "subham@gmail.com");
        User user3 = controller.createUser("Piyush", "piyush@gmail.com");
//        System.out.println(user1);
//        System.out.println(user2);
//        System.out.println(user3);

        Card card1 = controller.createCard("Fortanix Automation", "for testCases");
        Card card2 = controller.createCard("Splitwise", "for updateExpense");
        Card card3 = controller.createCard("ParkingLot", "Added floor");

        TrelloList list1 = controller.createList("InQueue", Arrays.asList(card1));
        TrelloList list2 = controller.createList("InProgress", Arrays.asList(card2));
        TrelloList list3 = controller.createList("Completed", Arrays.asList(card3));

        Board board1 = controller.createBoard("Security","Public", Arrays.asList(user1.getId(),user2.getId(), user3.getId()), Arrays.asList(list1.getId(), list2.getId(), list3.getId()));
        System.out.println(board1);
    }
}