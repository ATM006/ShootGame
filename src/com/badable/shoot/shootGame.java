/**
 * 
 */
package com.badable.shoot;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author Administrator
 *
 */
public class shootGame extends JPanel {

	/*
	 * ��̬������ʼ��ͼƬ
	 */
	public static final long serialVersionUID = 1L;
	/**���屳��ͼƬ**/
	public static BufferedImage background;
	/**��Ϸ��ʼ������ͼƬ**/
	public static BufferedImage gameover;
	public static BufferedImage start;
	/**��Ϸ��ͣͼƬ**/
	public static BufferedImage pause;
	public static BufferedImage hero0;
	public static BufferedImage hero1;
	public static BufferedImage airplane;
	public static BufferedImage bee;
	public static BufferedImage bullet;
	
	public static final int WIDTH = 400;
	public static final int HEIGHT=654;
	static{
		try{
			background = ImageIO.read(shootGame.class.getResource("background.png"));
			gameover = ImageIO.read(shootGame.class.getResource("gameover.png"));
			start = ImageIO.read(shootGame.class.getResource("start.png"));
			pause = ImageIO.read(shootGame.class.getResource("pause.png"));
			hero0 = ImageIO.read(shootGame.class.getResource("hero0.png"));
			hero1 = ImageIO.read(shootGame.class.getResource("hero1.png"));
			airplane = ImageIO.read(shootGame.class.getResource("airplane.png"));
			bee = ImageIO.read(shootGame.class.getResource("bee.png"));
			bullet = ImageIO.read(shootGame.class.getResource("bullet.png"));
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void paint(Graphics g){
		g.drawImage(background,0,0,null);
		//����Ӣ�۷ɻ� �ӵ� ������
		g.drawImage(hero.image,hero.x-hero.width/2,hero.y-hero.height/2,null);
		for(int i=0;i<bullets.length;i++){
			Bullet b = bullets[i];
			g.drawImage(b.image,b.x-b.width/2,b.y-b.height/2,null);
		}
		for(int i=0;i<flyings.length;i++){
			FlyingObject f = flyings[i];
			g.drawImage(f.image, f.x-f.width/2,f.y-f.height/2,null);
		}
		
	}
	
	/*
	 * ����Ӣ�۷ɻ� ������ �ӵ�
	 */
	Hero hero;
	FlyingObject[] flyings={};
	Bullet[] bullets={};
	
	public shootGame(){
		hero = new Hero();
		flyings = new FlyingObject[2];
		flyings[0]=new AirPlane();
		flyings[1]=new AirPlane();
		bullets = new Bullet[1];
		bullets[0]=new Bullet();
	}
	public static void main(String []args){
		//��������
		JFrame frame = new JFrame("Shoot");
		//�������
		shootGame game = new shootGame();
		frame.add(game);
		
		frame.setSize(WIDTH, HEIGHT);
		frame.setLocationRelativeTo(null);//����
		//�رմ���ͬʱ�ر���Ϸ
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}
