package com.tlquick.utils;

public enum Symbol
{
   CHERRY("C", 30, 3, "Cherry.JPG"), 
   ORANGE("O", 25, 6, "Orange.JPG"),
   LEMON("L", 7, 20, "Lemon.JPG"), 
   JACKPOT("J", 2, 200, "Jackpot.JPG");  
   
   private final String name;  
   private final int number;
   private final String win;  
   private final int payoff;
   private String image;
   private Symbol(String name, int number, int payoff, String image) 
   { 
       this.name = name;
       this.number = number;
       this.payoff = payoff;
       this.image = image;
       this.win = name + name + name;
   }
   public String getName()   
   { 
       return name; 
   }
   public int getNumber()   
   { 
       return number; 
   }
   public String getWin()   
   { 
       return win; 
   }
   public int getPayoff()   
   { 
       return payoff; 
   }
   public String getImage()   
   { 
       return image; 
   }
}
