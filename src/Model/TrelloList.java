package Model;

import java.util.ArrayList;
import java.util.List;

public class TrelloList {

    String id;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "TrelloList{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", cardList=" + cardList +
                '}';
    }

    public List<Card> getCardList() {
        return cardList;
    }

    String name;
    List<Card> cardList;

    public TrelloList(String name, String id,  List<Card> cardList){
        this.name = name;
        this.id = id;
        this.cardList = cardList;
    }
}
