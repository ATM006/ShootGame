/**
 * 
 */
package com.badable.shoot;

/**
 * @author Administrator
 *
 */
public class Bullet extends FlyingObject {
	int Speed;
	
	public Bullet(){
		this.image = shootGame.bullet;
		this.width = image.getWidth();
		this.height = image.getHeight();
		x=200;
		y=300;
		Speed =2;
	}
	
	public void setp(){
		y-=this.Speed;
	}
	
	public boolean outOfBounds(){
		//���ɻ�Խ��
		return y<=- height;		
	}
	
	
}
