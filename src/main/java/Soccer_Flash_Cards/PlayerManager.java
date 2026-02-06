package Soccer_Flash_Cards;

import java.util.ArrayList;

public class PlayerManager {
    ArrayList<Card> cards = new ArrayList<>();
    private int score;
    private String userName;


    //make a set of 5 cards for this small cards in the constructor
    PlayerManager(String name){
        this.userName = name;
        score = 0;
        cards.add(new Card("What happens when the ball goes out of bounds in the sideline?", 1,
                new String[] {"The game ends",
                        "A throw in is called from the opposing team",
                        "A goal kick is awarded",
                        "A corner kick is awarded"},
                2));
        cards.add(new Card("How many players from one team are allowed on the field at a time (including the goalkeeper)?", 1,
                new String[] {"9",
                        "10",
                        "11",
                        "12"},
                3));
        cards.add(new Card("Which part of the body is NOT allowed to touch the ball for most players?", 1,
                new String[] {"Head",
                        "Chest",
                        "Foot",
                        "Hand or arm"},
                4));
        cards.add(new Card("What restarts play after a defensive player touches the ball last and it crosses their own goal line without scoring?", 1,
                new String[] {"Throw-in",
                        "Goal kick",
                        "Corner kick",
                        "Penalty kick"},
                3));
        cards.add(new Card("What happens when a player is fouled in the opposing teams penalty area?", 1,
                new String[] {"Throw-in",
                        "Goal kick",
                        "Corner kick",
                        "Penalty kick"},
                4));
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public int getScore() {
        return score;
    }

    public void addScore(int points) {
        this.score = this.score + points;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
