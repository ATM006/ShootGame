/**
 * 
 */
package com.badable.shoot;

/**
 * @author Administrator
 *�з��ɻ�
 */
public class AirPlane extends FlyingObject{
	int speed;
	public AirPlane(){
		this.image = shootGame.airplane;
		this.width = image.getWidth();
		this.height = image.getHeight();
		this.speed = 3;
		this.x=132;
		this.y=289;
	}
	
	public void setp(){
		y += this.speed;
	}
	
	public boolean outOfBounds(){
		return this.y >= shootGame.HEIGHT;
	}
	
	
}
