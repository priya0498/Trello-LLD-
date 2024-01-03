package Model;

import java.util.List;

public class Board {

    String privacy;
    String id;
    String name;
    String url;
    List<User>members;
    List<TrelloList> lists;

    public Board(String name,  String privacy, String id, List<User>members, List<TrelloList> lists ){

        this.name = name;
        this.privacy = privacy;
        this.id = id;
        this.url = "www.jira.com/" + this.id;
        this.members = members;
        this.lists = lists;
    }

    public String getPrivacy() {
        return privacy;
    }

    @Override
    public String toString() {
        return "Board{" +
                "privacy='" + privacy + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", members=" + members +
                ", lists=" + lists +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public List<User> getMembers() {
        return members;
    }

    public List<TrelloList> getLists() {
        return lists;
    }


}
