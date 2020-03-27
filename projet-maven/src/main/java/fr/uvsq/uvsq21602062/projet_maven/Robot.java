package fr.uvsq.uvsq21602062.projet_maven;

public class Robot {
	protected int positionX;
	protected int positionY;
	
	Robot(int positionX, int positionY) {
		this.positionX = positionX;
		this.positionY = positionY;
	}
	
	public int getPositionX() {
		return this.positionX;
	}
	
	public int getPositionY() {
		return this.positionY;
	}
	
	public void setPositionX(int x) {
		this.positionX = x;
	}
	
	public void setPositionY(int y) {
		this.positionY = y;
	}
}
