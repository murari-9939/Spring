package com.example.springDemo;
import com.example.springDemo.java.MarioGame;
import com.example.springDemo.java.GameRunner;

public class Appgamingb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var marioGame = new MarioGame();
		var gameRunner= new GameRunner(marioGame);
		gameRunner.run();
	}

	
	

}
