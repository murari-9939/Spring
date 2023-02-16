package com.example.springDemo.java;

public class GameRunner {
	private MarioGame game;
	public GameRunner(MarioGame game) {
		this.game=game;
	}
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("game runner"+game);
		game.up();
		game.down();
		game.left();
		game.down();
	}
	

}
