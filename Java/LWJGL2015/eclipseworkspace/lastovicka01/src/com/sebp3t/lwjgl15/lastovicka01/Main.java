package com.sebp3t.lwjgl15.lastovicka01;

public class Main {
	
	public static Game game;
	
	public static void main(String[] args) {
        game = new Game();
        game.start();
        System.out.println("[Main] Game loop ended");
    }

}
