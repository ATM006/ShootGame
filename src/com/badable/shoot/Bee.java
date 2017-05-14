/**
 * 
 */
package com.badable.shoot;

/**
 * @author Administrator
 *–°√€∑‰
 */
public class Bee extends FlyingObject{
	int xSpeed;
	int ySpeed;
	
	public Bee(){
		this.image = shootGame.bee;
		this.width = image.getWidth();
		this.height = image.getHeight();
		this.x = 150;
		this.y = 320;
		xSpeed = 1;
		ySpeed = 2;
	}
}
