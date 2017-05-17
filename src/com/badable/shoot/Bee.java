/**
 * 
 */
package com.badable.shoot;

/**
 * @author Administrator
 *小蜜蜂
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
	
	public void setp(){
		y -= ySpeed;
		//X
	}
	
	public boolean outOfBounds(){
		//检查飞机越界
		return false;
	}
	
	
}
