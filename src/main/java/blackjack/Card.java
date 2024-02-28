/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjack;

/**
 *
 * @author Ahmed
 */
public class Card {
   private final int suit;
   private final  int rank;
   private final  int value; 

    public Card(int s , int r, int v){
       this.suit=s;
       this.value=v;
       this.rank=r;
   
   }
   
   public Card(Card obj){
       this.suit=obj.suit;
       this.value=obj.value;
       this.rank=obj.rank;
   
   }
   
   
   
    public int getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    public int getValue() {
        return value;
    }
   
   
   
}
