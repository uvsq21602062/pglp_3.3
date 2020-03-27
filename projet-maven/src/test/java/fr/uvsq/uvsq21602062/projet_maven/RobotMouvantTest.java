package fr.uvsq.uvsq21602062.projet_maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class RobotMouvantTest {

	@Test
	public void testGetDirectionX() {
		RobotMouvant r = new RobotMouvant(15, 16, 2, -3);
		assertTrue(r.getDirectionX() == 2);
	}
	
	@Test
	public void testGetDirectionY() {
		RobotMouvant r = new RobotMouvant(15, 16, 2, -3);
		assertTrue(r.getDirectionY() == -3);
	}
	
	@Test
	public void testSetDirectionX() {
		RobotMouvant r = new RobotMouvant(15, 16, 2, -3);
		r.setDirectionX(3);
		assertTrue(r.getDirectionX() == 3);
	}
	
	@Test
	public void testSetDirectionY() {
		RobotMouvant r = new RobotMouvant(15, 16, 2, -3);
		r.setDirectionY(3);
		assertTrue(r.getDirectionY() == 3);
	}
	
	@Test
	public void testAvancer() {
		RobotMouvant r = new RobotMouvant(15, 16, 2, -3);
		r.avancer();
		assertTrue(r.getPositionX() == 17 && r.getPositionY() == 13);
	}

}
