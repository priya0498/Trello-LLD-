import Model.Board;
import Model.Card;
import Model.TrelloList;
import Model.User;

import java.util.List;

public class Controller {

    Service service;

    public Controller(){
        this.service = new Service();
    }

    public User createUser(String name, String email){
        return service.createUser(name, email);
    }

    public TrelloList createList(String name, List<Card> cardList){
        return service.createList(name, cardList);
    }

    public TrelloList removeTrelloList(String id){
        return service.removeTrelloList(id);
    }

   public Card createCard(String name, String description){
        return service.createCards( name, description);
   }

   public Card removeCards(String id){
        return service.removeCards(id);
   }
   public Board createBoard(String name, String privacy,  List<String> userid, List<String> TrelloListid){
        return service.createBoard(name,privacy, userid,TrelloListid);

   }
   public Board removeBoard(String id){
        return service.removeBoard(id);
   }

   public Card assignUser(String userid, String cardId){
        return service.assignUser(userid, cardId);
   }
   public Card unassignUser(String cardId){
        return service.unassignUser(cardId);
   }
   public TrelloList moveCard(String cardId , String finalTrellolistId){
        return service.moveCard(cardId, finalTrellolistId);
   }
}
