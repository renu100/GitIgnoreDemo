package com.bridelabz.demo;

import java.util.Random;

public class Deck {
	public static void main(String[] args) {

		/*
		 * creating the array for player suit and rank
		 */
		String player[] = { "Player 1", "Player 2", "Player 3", "Player 4" };
		String[] suit = { "Clubs", "Diamons", "Spades", "Hearts" };
		String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

		// creating 2D array to set the deck of card
		String[][] deck = new String[suit.length][rank.length];

		for (int i = 0; i < suit.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				deck[i][j] = suit[i] + " " + rank[j];
				System.out.println(deck[i][j]);
			}
			System.out.println(" ");
		}

		/*
		 * randomly distributing 9 card to four players
		 */

		int randomSuit = (int) (Math.random() * suit.length);
		int randomrank = (int) (Math.random() * rank.length);
		for (int i = 0; i < suit.length; i++) {
			for (int j = 0; j < rank.length - 4; j++) {
				while (deck[randomSuit][randomrank] == null) {
					randomSuit = (int) (Math.random() * suit.length);
					randomrank = (int) (Math.random() * rank.length);
				}
				System.out.println();
				System.out.print(player[i] + ":" + deck[randomSuit][randomrank]);
				deck[randomSuit][randomrank] = null;// assigning null
			}
			System.out.println();
		}

	}
}
