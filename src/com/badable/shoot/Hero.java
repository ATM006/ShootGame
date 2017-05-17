/**
 * 
 */
package com.badable.shoot;

import java.awt.image.BufferedImage;

/**
 * @author Administrator
 *
 */
public class Hero extends FlyingObject {
	/*
	 * ï¿½ï¿½ï¿½ï¿½
	 * Ë«ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½
	 * ï¿½ï¿½ï¿½ï¿½Ð§ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½
	 * 
	 */
	int lief;
	int doubleFire;
	BufferedImage[] images;
	int index;//ï¿½ï¿½ï¿½ï¿½ï¿½Î±ï¿½
	
	public Hero(){
		this.images = new BufferedImage[2];
		images[0] = shootGame.hero0;
		images[1] = shootGame.hero1;
		index = 0;
		lief = 3;
		doubleFire = 0;
		this.image = images[0];
		this.width = image.getWidth();
		this.height = image.getHeight();
		x = 150;
		y=400;
		
	}
	
	
	public void setp(){
		if(images.length>0 && index%2==0){
			image = images[0];
		}else{
			image = images[1];
		}
	}
	
	public boolean outOfBounds(){
		//¼ì²é·É»úÔ½½ç
		return false;
	}
	
	public void moveTo(int x,int y){
		this.x = x;
		this.y = y;
	}
}
