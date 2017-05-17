/**
 * 
 */
package com.badable.shoot;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author Administrator
 *
 */
public class shootGame extends JPanel {

	/*
	 * 锟斤拷态锟斤拷锟斤拷锟斤拷始锟斤拷图片
	 */
	public static final long serialVersionUID = 1L;
	/**锟斤拷锟藉背锟斤拷图片**/
	public static BufferedImage background;
	/**锟斤拷戏锟斤拷始锟斤拷锟斤拷锟斤拷图片**/
	public static BufferedImage gameover;
	public static BufferedImage start;
	/**锟斤拷戏锟斤拷停图片**/
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
	
	public int state=0;
	public int PAUSE=1;
	public int CANSTART=2;
	public int START=3;
	public int GAMEOVER=4;
	public int RUNNING=5;
	
	public void paintState(Graphics g){
		if(state == PAUSE){
			g.drawImage(pause, 0,0, null);
		}else if(state == CANSTART){
			g.drawImage(start, 0,0, null);
		}else {
			g.drawImage(gameover, 0,0, null);
		}
	}
	
	public void start(){
		//创建计时器
		Timer t = new Timer();
		TimerTask task = new TimerTask(){

			public void run() {
				// TODO 自动生成的方法存根
				if(state==RUNNING){
					setpAction();
				}
			}
			
		};
		t.schedule(task, 5);
		
	}
	
	public void setpAction(){
		hero.setp();
	}
	
	public void paint(Graphics g){
		g.drawImage(background,0,0,null);
		//锟斤拷锟斤拷英锟桔飞伙拷 锟接碉拷 锟斤拷锟斤拷锟斤拷
		g.drawImage(hero.image,hero.x-hero.width/2,hero.y-hero.height/2,null);
		
		for(int i=0;i<bullets.length;i++){
			Bullet b = bullets[i];
			g.drawImage(b.image,b.x-b.width/2,b.y-b.height/2,null);
		}
		for(int i=0;i<flyings.length;i++){
			FlyingObject f = flyings[i];
			g.drawImage(f.image, f.x-f.width/2,f.y-f.height/2,null);
		}
		
		paintState(g);
		
	}
	
	/*
	 * 锟斤拷锟斤拷英锟桔飞伙拷 锟斤拷锟斤拷锟斤拷 锟接碉拷
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
		
		KeyAdapter a=new KeyAdapter(){
			public void keyPressed(KeyEvent e) {
				//System.out.println(e.getKeyChar());
				if(e.getKeyChar()==0x1B){
					System.exit(0);
				}
			}
		};
		this.addKeyListener(a);
		
		this.setFocusable(true);
		this.requestFocus();
		
//		MouseAdapter a=new MouseAdapter(){
//			public void mouseClicked(MouseEvent e){
//				System.exit(0);
//			}
//		};
//		this.addMouseListener(a);
	}
	
	public static void main(String []args){
		//锟斤拷锟斤拷锟斤拷锟斤拷
		JFrame frame = new JFrame("Shoot");
		//锟斤拷锟斤拷锟斤拷锟�   
		shootGame game = new shootGame();
		game.start();
		frame.add(game);
		
		frame.setSize(WIDTH, HEIGHT);
		frame.setUndecorated(true);
		frame.setLocationRelativeTo(null);//锟斤拷锟斤拷
		//锟截闭达拷锟斤拷同时锟截憋拷锟斤拷戏
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
	}
}
