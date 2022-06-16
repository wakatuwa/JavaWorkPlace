package cn.sxt.game;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/**
 * 飞机游戏的主窗口
 * @author wanghan
 *
 */
import java.util.Date;
public class MyGameFrame extends JFrame{
		
	Image planeImg = GameUtil.getImage("images/plane.png");
	Image bg = GameUtil.getImage("images/bg.jpg");
	
	Plane plane = new Plane(planeImg,250,250);
	Shell[] shells = new Shell[50];
	
	Explode bao;
	Date startTime = new Date();
	Date endTime;
	int period; //游戏持续时间
	@Override
	public void paint(Graphics g) {	
		Color c = g.getColor();
		super.paint(g);
		g.drawImage(bg, 0, 0, null); 
		
		plane.drawSelt(g);//画飞机
		 
		//画出所有的炮弹
		for(int i=0; i<shells.length; i++) {
			shells[i].draw(g);
			
			boolean peng = shells[i].getRect().intersects(plane.getRect());
			
			//飞机和炮弹的碰撞检测
			if(peng) {
				plane.live = false;
				if(bao == null) {
					bao = new Explode(plane.x, plane.y);
					
					endTime = new Date();
					period = (int)((endTime.getTime() - startTime.getTime())/1000);
				}

				bao.draw(g);
			}
			
			//计时功能，给出提示
			if(!plane.live) {
				g.setColor(Color.RED);
				Font f = new Font("宋体", Font.BOLD, 50);
				g.setFont(f);
				g.drawString("时间："+period+"秒",(int)plane.x,(int)plane.y);	
			}			
		}
	
		g.setColor(c);
	}
	
	//帮助我们反复重画窗口
		class PaintThread extends Thread {	//内部类可以直接使用上面的类
			@Override
			public void run() {
				while(true) {
					
					repaint();	//重画
					
					try {
						Thread.sleep(40);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}	//1s = 1000
				}
			}
		}
		

	//定义键盘监听的内部类
	class KeyMonitor extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {	//按下键盘
			plane.addDirection(e);
		}

		@Override
		public void keyReleased(KeyEvent e) {
			plane.minusDirection(e);
		}
		
	}
		
	/**
	 * 初始化窗口
	 */
	public void launchFrame() {
		this.setTitle("打飞机小游戏。");
		this.setVisible(true);
		this.setSize(Constant.GAME_WIDTH, Constant.GAME_HEIGHT);
		this.setLocation(300, 300);
		
		this.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		//启动重画窗口的线程
		new PaintThread().start();		
		
		new PaintThread().start();	//启动重画窗口的线程
		addKeyListener(new KeyMonitor());	//给窗口增加键盘的监听
		
		
		//初始化50个炮弹
		for(int i = 0; i<shells.length; i++) {
			shells[i] = new Shell();
		}
	}
	
	
	public static void main(String[] args) {
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	}
	
	private Image offScreenImage = null;
	 
	public void update(Graphics g) {
	    if(offScreenImage == null)
	        offScreenImage = this.createImage(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);//这是游戏窗口的宽度和高度
	     
	    Graphics gOff = offScreenImage.getGraphics();
	    paint(gOff);
	    g.drawImage(offScreenImage, 0, 0, null);
	} 
}
