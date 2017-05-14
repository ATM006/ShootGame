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
	 * ����
	 * ˫������
	 * ����Ч�� ������
	 * 
	 */
	int lief;
	int doubleFire;
	BufferedImage[] images;
	int index;//�����α�
	
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
}
