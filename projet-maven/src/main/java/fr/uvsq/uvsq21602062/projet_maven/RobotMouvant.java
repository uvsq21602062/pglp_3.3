package fr.uvsq.uvsq21602062.projet_maven;

public class RobotMouvant extends Robot{
	private int directionX;
	private int directionY;
	
	RobotMouvant(int positionX, int positionY, int directionX, int directionY) {
		super(positionX, positionY);
		this.directionX = directionX;
		this.directionY = directionY;
	}
	
	public int getDirectionX() {
		return this.directionX;
	}
	
	public int getDirectionY() {
		return this.directionY;
	}
	
	public void setDirectionX(int directionX) {
		this.directionX = directionX;
	}
	
	public void setDirectionY(int directionY) {
		this.directionY = directionY;
	}
	
	public void avancer() {
		this.positionX += this.directionX;
		this.positionY += this.directionY;
	}
}
