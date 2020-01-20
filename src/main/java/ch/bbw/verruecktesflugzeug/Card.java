package ch.bbw.verruecktesflugzeug;




public class Card {

	
	private String up;
	private String right;
	private String down;
	private String left;
	
	public Card(String up, String right, String down, String left) {
		super();
		this.up = up;
		this.down = right;
		this.right = down;
		this.left = left;
	}

	public String getUp() {
		return up;
	}


	public void setUp(String up) {
		this.up = up;
	}


	public String getDown() {
		return down;
	}


	public void setDown(String down) {
		this.down = down;
	}


	public String getright() {
		return right;
	}


	public void setright(String right) {
		this.right = right;
	}


	public String getLeft() {
		return left;
	}


	public void setLeft(String left) {
		this.left = left;
	}


	public Card turned90DegreesClockwise() {
		// TODO Auto-generated method stub
		return null;
	}

}
