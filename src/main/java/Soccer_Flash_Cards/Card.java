package Soccer_Flash_Cards;

import java.util.ArrayList;

public class Card {
    private String question;
    private int points;
    private String[] answers;
    private int correctAnswer;


    //constructor for the card
    public Card(String question, int points, String[] answers, int correctAnswer) {
        this.question = question;
        this.points = points;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
    }


    //getters and setters
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void showAnswers() {
        int count = 1;
        for(String answer : answers){
            System.out.println(count++ + ". " + answer);
        }
    }


    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getCorrectAnswerText(){
        return  answers[correctAnswer -1];
    }
}
