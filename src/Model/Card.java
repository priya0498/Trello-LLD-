package Model;

public class Card {
    String id;
    String name;
    String description;
    User assignedUser;

    @Override
    public String toString() {
        return "Card{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", assignedUser=" + assignedUser +

                '}';
    }

   // User unassignedUser;





    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public User getAssignedUser() {
        return assignedUser;
    }

    public void setAssignedUser(User assignedUser) {
        this.assignedUser = assignedUser;
    }

    public Card(String id, String name, String description){
        this.id = id;
        this.name = name;
        this.description = description;

    }


}
