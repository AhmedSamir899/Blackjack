/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjack;

import java.util.Scanner;

/**
 *
 * @author Ahmed
 */
public class BlackJack {
    static Game p=new Game();
     static{ 
        p.players[0]=new Player();
        
        p.players[1]=new Player();
        
        p.players[2]=new Player();
        
        p.players[3]=new Player();
        }
     
    public static void main(String args[]){
        GUI gui = new GUI();
       
        p.generates_deck();
 Scanner x=new Scanner(System.in);
         for(int i=0;i<3;i++)
 {String s=new String();
 int t=i+1;
     System.out.println("please enter player"+t+" name: ");
     s=x.next();
    p.setPlayers(s, i);
 }
         p.setPlayers("Dealer", 3);
         gui.runGUI( p.cards_deck, p.players[0].getCards(), p.players[1].getCards(), p.players[2].getCards(), p.players[3].getCards());
         
         
    p.maxi();
      for(int i=0;i<3;i++)
         {
         String g=new String();
         Scanner d=new Scanner(System.in);
         System.out.println("for player"+(i+1)+" Turn");
           
         SS:{while(p.players[i].getScore()<21){
                    int check;
                 System.out.println("if you want hit press 1 and for stand press 2");
                 check=d.nextInt();
                 
                 if(check == 1)
                 {
                     
                     
                     
                     
                    p.players[i].setCards(p.draw_card(), p.players[i].getNumber_of_cards());
        p.players[i].setScore(p.players[i].getScore() + p.players[i].getCards(p.players[i].getNumber_of_cards()).getValue() );
      
                     
                     
                     
                     
                gui.updatePlayerHand(p.players[i].getCards(p.players[i].getNumber_of_cards()),i);
                
                p.players[i].setNumber_of_cards(p.players[i].getNumber_of_cards()+1);
      
                if(p.players[i].getScore()>=21)
                break;
                 }
                 else if(check == 2)
                     break SS;
                 else
                     System.out.println("Wrong input please try again");
                 
                 
             }}
       p.maxi();
         }     
     p.maxi();

    if(p.players[0].getScore()>21&&p.players[1].getScore()>21&&p.players[2].getScore()>21)
    {     System.out.println("player1 score is: " + p.players[0].getScore());
       System.out.println("player2 score is: " + p.players[1].getScore());
       System.out.println("player3 score is: " + p.players[2].getScore());
       System.out.println("dealer score is: " + p.players[3].getScore());
        System.out.println("dealer is the winner");
    
    }
    
    else{ 
        if(p.players[3].getScore() == p.max_score)
    {
        int o=0;
              for(int i=0;i<3;i++)
                {
                 if(p.players[i].getScore() == p.max_score)
                 o++;
                }
      
      if(o==0)
      {              
System.out.println("player1 score is: " + p.players[0].getScore());
       System.out.println("player2 score is: " + p.players[1].getScore());
       System.out.println("player3 score is: " + p.players[2].getScore());
       System.out.println("dealer score is: " + p.players[3].getScore());
          System.out.println("dealer is the winner");
      }
      else
      {while(p.players[3].getScore() <= p.max_score && p.players[3].getScore()<21 )
        {
            
            
            
                 p.players[3].setCards(p.draw_card(), p.players[3].getNumber_of_cards());
            p.players[3].setScore(p.players[3].getScore() + p.players[3].getCards(p.players[3].getNumber_of_cards()).getValue() );
              gui.updateDealerHand(p.players[3].getCards(p.players[3].getNumber_of_cards()),p.cards_deck);
                p.players[3].setNumber_of_cards(p.players[3].getNumber_of_cards()+1);
            
            
            
        
        }
                     p.maxi();

          int o1=0;int gg = 0;
              for(int i=0;i<4;i++)
     {
             if(p.players[i].getScore() == p.max_score)
             {o1++;
             gg=i;
             }
     }
      if(o1==1&& gg==3)
          
      {   System.out.println("player1 score is: " + p.players[0].getScore());
       System.out.println("player2 score is: " + p.players[1].getScore());
       System.out.println("player3 score is: " + p.players[2].getScore());
       System.out.println("dealer score is: " + p.players[3].getScore());
      
          System.out.println("dealer is the winner");
      }
      else if(o1==1&& gg!=3) 
     {   System.out.println("player1 score is: " + p.players[0].getScore());
       System.out.println("player2 score is: " + p.players[1].getScore());
       System.out.println("player3 score is: " + p.players[2].getScore());
       System.out.println("dealer score is: " + p.players[3].getScore());  
         System.out.println(p.players[gg].getName()+ " is the winner");
      }
      else
            {   System.out.println("player1 score is: " + p.players[0].getScore());
       System.out.println("player2 score is: " + p.players[1].getScore());
       System.out.println("player3 score is: " + p.players[2].getScore());
       System.out.println("dealer score is: " + p.players[3].getScore());
       
                System.out.println("Push");
      }
    }
    }
    
    else
    {
       while(p.players[3].getScore() <= p.max_score && p.players[3].getScore()<21 )
        {
         p.players[3].setCards(p.draw_card(), p.players[3].getNumber_of_cards());
            p.players[3].setScore(p.players[3].getScore() + p.players[3].getCards(p.players[3].getNumber_of_cards()).getValue() );
              gui.updateDealerHand(p.players[3].getCards(p.players[3].getNumber_of_cards()),p.cards_deck);
                p.players[3].setNumber_of_cards(p.players[3].getNumber_of_cards()+1);
            
        
        }
                     p.maxi();

          int o1=0;int gg = 0;
              for(int i=0;i<4;i++)
     {
             if(p.players[i].getScore() == p.max_score)
             {o1++;
             gg=i;
             }
     }
      if(o1==1&& gg==3)
          
      {   System.out.println("player1 score is: " + p.players[0].getScore());
       System.out.println("player2 score is: " + p.players[1].getScore());
       System.out.println("player3 score is: " + p.players[2].getScore());
       System.out.println("dealer score is: " + p.players[3].getScore());
       System.out.println("dealer is the winner");
      }
      else if(o1==1&& gg!=3) 
     {   System.out.println("player1 score is: " + p.players[0].getScore());
       System.out.println("player2 score is: " + p.players[1].getScore());
       System.out.println("player3 score is: " + p.players[2].getScore());
       System.out.println("dealer score is: " + p.players[3].getScore()); 
         System.out.println(p.players[gg].getName()+ " is the winner");
      }
      else
            {   System.out.println("player1 score is: " + p.players[0].getScore());
       System.out.println("player2 score is: " + p.players[1].getScore());
       System.out.println("player3 score is: " + p.players[2].getScore());
       System.out.println("dealer score is: " + p.players[3].getScore());  
                System.out.println("Push");
      }
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    }
}
}
