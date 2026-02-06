package Soccer_Flash_Cards;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //scanner for the inputs
        Scanner scanner = new Scanner(System.in);

        //start of the game
        System.out.println("Welcome to the Soccer Flash Card Game!");
        System.out.print("Please enter your name:");
        String name = scanner.nextLine();

        //initialize the player
        PlayerManager player = new PlayerManager(name);

        System.out.println("Welcome " + player.getUserName() + "\nYou have to score 3 to win the game....\nGoodluck!");

        //since this game only has 5 cards try only 5
        int counter = 0;
        //while loop to keep the game running until a successful score
        int size = player.getCards().size();
        while(counter < size){
            Card card = player.getCards().get(counter);
            //print the question and answers
            System.out.println(card.getQuestion());
            card.showAnswers();

            //ask for input
            System.out.print("Your answer: ");
            int answer = scanner.nextInt();

            if(answer == card.getCorrectAnswer()){
                System.out.println("Correct! added " + card.getPoints() + " points!");
                //add the points related to the card
                player.addScore(card.getPoints());
            }else{
                System.out.println("Incorrect answer...." + "the correct answer was " + card.getCorrectAnswerText());
            }
            counter++;
        }


        //finish the game
        if(player.getScore() >= 3){
            System.out.println("You Won!!!!");
        }else {
            System.out.println("Game over!");
        }
        System.out.println("Final score: " + player.getScore() + "/" + player.getCards().size());
        //close the scanner
        scanner.close();
    }
}