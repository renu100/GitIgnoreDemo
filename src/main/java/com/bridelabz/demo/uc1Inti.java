package com.bridelabz.demo;

class Game {
	 int ROWS=4;
	    int COLS= 13;
	    String deck[][] =new String[ROWS][COLS];
	    String[] suit = {"clubs","diamond", "hearts","spades"};
	    String[] face = {"2","3","4","5","6","7","8","9","10","jack","queen","king","ace"};

		//Initialize game
	  	 public void deck(){
	            for (int row =0 ; row<ROWS;row++){
	                for (int col=0;col<COLS; col++) {
	                    deck[row][col] = suit[row]+" "+face[col];
	                  System.out.println(" " +deck[row][col]);
	                }
	            }
	    }
}

public class uc1Inti {
	public static void main(String[] args) {
		Game obj=new Game();
		obj.deck();
}
}
