package ch.bbw.verruecktesflugzeug;

import java.util.HashMap;

public class Card {
	
	private HashMap<Integer, String> up = new HashMap<Integer, String>();
	private HashMap<Integer, String> down = new HashMap<Integer, String>();
	private HashMap<Integer, String> right = new HashMap<Integer, String>();
	private HashMap<Integer, String> left = new HashMap<Integer, String>();


	public HashMap<Integer, String> getUp() {
		return up;
	}
	public void setUp(HashMap<Integer, String> up) {
		this.up = up;
	}
	public HashMap<Integer, String> getDown() {
		return down;
	}
	public void setDown(HashMap<Integer, String> down) {
		this.down = down;
	}
	public HashMap<Integer, String> getRight() {
		return right;
	}
	public void setRight(HashMap<Integer, String> right) {
		this.right = right;
	}
	public HashMap<Integer, String> getLeft() {
		return left;
	}
	public void setLeft(HashMap<Integer, String> left) {
		this.left = left;
	}
	public Card turned90DegreesClockwise() {
		// TODO Auto-generated method stub
		return null;
	}

}
