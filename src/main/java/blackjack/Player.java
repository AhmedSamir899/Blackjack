/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjack;

/**
 *
 * @author Ahmed
 */
public class Player {
    private String Name;
    private int Score=0;
    private Card cards[]=new Card[11];
    private int number_of_cards=0;
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int Score) {
        this.Score = Score;
    }

    public Card getCards(int k) {
        return cards[k];
    }

    public void setCards(Card cards,int k) {
        this.cards[k] = cards;
    }

    public Card[] getCards() {
        return cards;
    }

    public int getNumber_of_cards() {
        return number_of_cards;
    }

    public void setNumber_of_cards(int number_of_cards) {
        this.number_of_cards = number_of_cards;
    }

}
