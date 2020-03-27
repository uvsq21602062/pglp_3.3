package fr.uvsq.uvsq21602062.projet_maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class RobotTest {

	@Test
	public void testGetPositionX() {
		Robot r = new Robot(15, 16);
		assertTrue(r.getPositionX() == 15);
	}
	
	@Test
	public void testGetPositionY() {
		Robot r = new Robot(15, 16);
		assertTrue(r.getPositionY() == 16);
	}
	
	@Test
	public void testSetPositionX() {
		Robot r = new Robot(15, 16);
		r.setPositionX(10);
		assertTrue(r.getPositionX() == 10);
	}
	
	@Test
	public void testSetPositionY() {
		Robot r = new Robot(15, 16);
		r.setPositionY(10);
		assertTrue(r.getPositionY() == 10);
	}

}
