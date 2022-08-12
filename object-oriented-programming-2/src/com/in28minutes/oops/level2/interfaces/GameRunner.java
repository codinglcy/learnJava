package com.in28minutes.oops.level2.interfaces;

public class GameRunner {

	public static void main(String[] args) {
		//		MarioGame mariogame = new MarioGame();
		GamingConsole mariogame = new MarioGame();
		//		ChessGame chessgame = new ChessGame();
		GamingConsole chessgame = new ChessGame();

		mariogame.up();
		mariogame.down();
		mariogame.left();
		mariogame.right();

		chessgame.up();
		chessgame.down();
		chessgame.left();
		chessgame.right();
	}

}
