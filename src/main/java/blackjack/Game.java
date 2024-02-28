/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjack;
import java.util.Random;
/**
 *
 * @author Ahmed
 */
public class Game {
    Player players[]=new Player[4];
    Card cards_deck[] = new Card[52];
    int max_score =-1;
    
    
    void generates_deck(){
    int z=0;
        for(int i=0;i<4;i++)
        {
        
        for(int j=1;j<=13;j++)
        {
        if(j>=10)    
        cards_deck[z]=new Card(i,j-1,10);
            else
        cards_deck[z]=new Card(i,j-1,j);
        
        z++;
        }
        }
        
    }
    
    Card draw_card(){
    int z;
    Random x=new Random();
        while(true)
        {
        z=x.nextInt(52);
            if(cards_deck[z]!=null)
            {
            Card c1=new Card(cards_deck[z]);
            cards_deck[z]=null;
            return c1;
   
            }
    
        }
   
    } 

   

    public void setPlayers(String n,int i) {
        this.players[i].setName(n);
        
        this.players[i].setCards(draw_card(), this.players[i].getNumber_of_cards());
        this.players[i].setScore(this.players[i].getScore() + this.players[i].getCards(this.players[i].getNumber_of_cards()).getValue() );
        maxi();
        this.players[i].setNumber_of_cards(this.players[i].getNumber_of_cards()+1);
    
        
        this.players[i].setCards(draw_card(), this.players[i].getNumber_of_cards());
        
       
        
        this.players[i].setScore(this.players[i].getScore() + this.players[i].getCards(this.players[i].getNumber_of_cards()).getValue() );
        maxi();
        this.players[i].setNumber_of_cards(this.players[i].getNumber_of_cards()+1);
    
    }

    
    void maxi(){
max_score=-1;
        for(int i=0;i<4;i++)
        {
            if(this.players[i].getScore()> max_score&&this.players[i].getScore()<=21)
                max_score=this.players[i].getScore();

        }
    
    }
    
    
    
    
    
    
}
