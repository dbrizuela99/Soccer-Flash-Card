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
                new String[] {"The game stops"}, 2));
    }

}
