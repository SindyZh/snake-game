package sindy.trytry.snakegame;

import java.awt.Color;
import java.awt.Graphics;

public class BodyPart {

	private int xCoor, yCoor, width, height;
	
	public BodyPart(int xCoor,int yCoor, int tileSize) {
		this.xCoor = xCoor;
		this.yCoor = yCoor;
		width = tileSize;
		height = tileSize;
	}
	public void tick() {
		
	}
	public void draw(Graphics g, int i) {
		switch (i) {
		case 0:
			g.setColor(Color.blue);
		    break;
		case 1:
			g.setColor(Color.blue);
		    break;
		case 2:
			g.setColor(Color.blue);
		    break;
		case 3:
			g.setColor(Color.blue);
		    break;
		case 4:
			g.setColor(Color.red);
		    break;
		default:
			g.setColor(Color.blue);
		}
		
		g.fillRect(xCoor * width, yCoor * height, width, height);
 		
	}
	public int getxCoor() {
		return xCoor;
	}
	public void setxCoor(int xCoor) {
		this.xCoor = xCoor;
	}
	public int getyCoor() {
		return yCoor;
	}
	public void setyCoor(int yCoor) {
		this.yCoor = yCoor;
	}
	
}
