package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		Blackjack game = new Blackjack();
		// enter two whole numbers bigger than 0 to play
		game.playBlackjack(7, 3);
	}

}

//Initial Spec.
//Given 2 Integer values greater than 0
// return whichever value is closest to 21 without going over 21.
//If they both go over 21 then return 0.

//Extensions
//1) DONE! show an error message if either value is less than 0 (otherwise playing with negatives avoid the bust message even if they still lose)
//2) each player has two cards rather than a score
//3) choose a number of games to play (keep it small!)
