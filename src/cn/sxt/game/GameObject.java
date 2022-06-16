package cn.sxt.game;

import java.awt.Graphics;
import java.awt.Image;
/**
 * 游戏物体的父类
 * @author wanghan
 *
 */
import java.awt.Rectangle;
public class GameObject {
	 Image img;
	 double x, y;
	 int speed;
	 int width, height;
	
	 public void drawSelt(Graphics g) {
		 g.drawImage(img, (int)x, (int)y, null);
	 }

	public GameObject(Image img, double x, double y) {
		super();
		this.img = img;
		this.x = x;
		this.y = y;
	}
	
	public GameObject() {	//空构造
		
	}
	
	/**
	 * 返回物体所在的矩形。便于后续的碰撞检测。
	 * @return
	 */
	public Rectangle getRect() {
		 
		return new Rectangle((int)x, (int)y, width, height);
	}
	
}
