import Model.Board;
import Model.Card;
import Model.TrelloList;
import Model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Service {

    Storage storage;

    public Service(){
        this.storage = new Storage();
    }
    public User createUser(String name, String email) {
        String id = UUID.randomUUID().toString();
        User user = new User(id, name, email);
        return storage.insertUser(user);
    }

    public TrelloList createList(String name, List<Card> cardList) {
        String id = UUID.randomUUID().toString();
        TrelloList lists = new TrelloList(id,name, cardList);
        return storage.createList(lists);
    }

    public TrelloList removeTrelloList(String id) {
        TrelloList temp = null;
        for (TrelloList trelloList : storage.getTrelloLists()) {
            if (trelloList.getId().equals(id)) {
                temp = trelloList;
                storage.getTrelloLists().remove(trelloList);

            }
        }

        return  temp;
    }

    public Card createCards(String name, String description) {
        String id = UUID.randomUUID().toString();
        Card card = new Card(id, name, description);
        return storage.createCard(card);

    }

    public Card removeCards(String id) {
        Card temp = null;
        for(Card card : storage.getCardList()){
            if(card.getId().equals(id)){
                temp = card;
                storage.getCardList().remove(card);
            }
        }
        return temp;
    }

    public Board createBoard(String name, String privacy, List<String> userid, List<String> trelloListid) {
        String Boardid = UUID.randomUUID().toString();
        List<User> addUser = new ArrayList<>();
        List<TrelloList> addtrelloList = new ArrayList<>();
        for(String id : userid){
            for(User user : storage.getUserList()){
                if(user.getId().equals(id)){
                   addUser.add(user);
                }
            }
        }
        for (String id : trelloListid){
            for (TrelloList trelloList : storage.getTrelloLists()){
                if(trelloList.getId().equals(id)){
                    addtrelloList.add(trelloList);
                }
            }
        }

        Board board = new Board(name,privacy,Boardid,addUser, addtrelloList);
         return storage.addBoard(board);
    }

    public Board removeBoard(String id) {
        Board temp = null;
        for(Board board : storage.boardList){
            if (board.getId().equals(id))
            {
                temp = board;
                storage.getBoardList().remove(board);
            }
        }
        return temp;
    }

    public Card assignUser(String userid, String cardId) {
        User temp = null;
        Card temp1 = null;
        for (User user : storage.getUserList()){
            if(user.getId().equals(userid)){
                temp = user;
            }
        }
        for (Card card : storage.getCardList()){
            if (card.getId().equals(cardId)){
                temp1 = card;
            }
        }
        if(temp1 != null && temp != null) {
            temp1.setAssignedUser(temp);
        }
        return temp1;
    }

    public Card unassignUser(String cardId) {
        Card temp1 = null;

        for (Card card : storage.getCardList()){
            if (card.getId().equals(cardId)){
                temp1 = card;
            }
        }
        if(temp1 != null){
            temp1.setAssignedUser(null);
        }
        return temp1;
    }

    public TrelloList moveCard(String cardId, String finalTrellolistId) {
        Card temp = null;
        TrelloList temp1 = null;
        for (TrelloList trelloList : storage.getTrelloLists()){
            for (Card card : trelloList.getCardList()){
                if (card.getId().equals(cardId)){
                    temp = card;
                    trelloList.getCardList().remove(temp);
                }
            }
        }
        for (TrelloList trelloList : storage.getTrelloLists()){
            if(trelloList.getId().equals(finalTrellolistId)){
                temp1 = trelloList;
                trelloList.getCardList().add(temp);
            }
        }
        return temp1;
    }
}
