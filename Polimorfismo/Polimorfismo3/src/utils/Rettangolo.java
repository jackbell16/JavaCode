/**
 * Questa classe ha la responsabilità di raggogliere le informazioni
 * riguardo al rettangolo che si vuole disegnare e contiene il metodo
 * per disegnarlo sul pannello
 * @author Giacomo
 */
package utils;

import java.awt.Graphics;

public class Rettangolo implements Disegnabile {
	private int x,y;
	private int width,height;
	public Rettangolo(int x, int y, int width, int height) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public void disegna(Graphics graphics) {
		graphics.drawRect(x, y, width, height);
		
	}
}