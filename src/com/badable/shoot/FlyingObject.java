/**
 * ���������
 */
package com.badable.shoot;

import java.awt.image.BufferedImage;

/**
 * @author ATM
 *
 */
public abstract class FlyingObject {
	BufferedImage image;
	int x,y;
	int width,height;
	

	public abstract void setp();
		
	public abstract boolean outOfBounds();
	
	
}
