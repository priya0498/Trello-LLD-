import Model.Board;
import Model.Card;
import Model.TrelloList;
import Model.User;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    public Board getBoard() {
        return board;
    }

    List<User> userList;
    List<TrelloList> trelloLists;

    List<Board> boardList;
    List<Card> cardList;

    public Storage() {
        this.userList = new ArrayList<>();
        this.trelloLists = new ArrayList<>();
        this.cardList = new ArrayList<>();
        this.boardList = new ArrayList<>();
    }

    User user;
    Board board;
    public List<User> getUserList() {
        return userList;
    }

    public List<TrelloList> getTrelloLists() {
        return trelloLists;
    }

    public User getUser() {
        return user;
    }

    public List<Card> getCardList() {
        return cardList;
    }

    public User insertUser(User user) {
        userList.add(user);
        return user;
    }

    public List<Board> getBoardList() {
        return boardList;
    }

    public TrelloList createList(TrelloList lists) {
        trelloLists.add(lists);
        return lists;

    }

    public Card createCard(Card card) {
        cardList.add(card);
        return card;
    }



    public Board addBoard(Board board) {
        boardList.add(board);
        return board;
    }
}
