package com.qa.main;

public class Blackjack {

	public int playBlackjack(int playerOne, int playerTwo) {
//		// Shows what each players cards equal
//		System.out.println("Player one's cards equal: " + playerOne
//		+ "\nPlayer two's cards equal: " + playerTwo + "\n");

		// checks if players are both playing with positive numbers
		if (playerOne > 0 && playerTwo > 0) {
			// Starts playing game
			System.out.println("Playing...\n");
			// checks if player one is bust (over 21) and prints to console
			if (playerOne > 21) {
				System.out.println("Player one is bust!");
				playerOne = 0;
			}
			// checks if player two is bust (over 21) and prints to console
			if (playerTwo > 21) {
				System.out.println("Player two is bust!");
				playerTwo = 0;
			}
			//
			if (playerOne > playerTwo) {
				System.out.println("\nPlayer one won!\nThey had: " + playerOne + "\tPlayer two score: " + playerTwo);
				return playerOne;
			} else if (playerTwo > playerOne) {
				System.out.println("\nPlayer two won!\nThey had: " + playerTwo + "\tPlayer one score: " + playerOne);
				return playerTwo;
			} else {
				System.out
						.println("\nIt's a draw.\nPlayer one score: " + playerOne + "\tPlayer two score: " + playerTwo);
				return 0;
			}
		} else {
			System.out.println(
					"At least one player isn't playing with a valid number. \nWhole positive numbers only please :)");
			return -404;
		}
	}
}
