/**
 * Questa classe ha la responsabilità di raggogliere le informazioni
 * riguardo al cerchio che si vuole disegnare e contiene il metodo
 * per disegnarlo sul pannello
 * @author Giacomo
 */
package utils;

import java.awt.Graphics;

public class Cerchio implements Disegnabile {
	private int raggio;
	private int x,y;
	public Cerchio(int radius, int x, int y) {
		super();
		this.raggio = radius;
		this.x = x;
		this.y = y;
	}
	public int getRadius() {
		return raggio;
	}
	public void setRadius(int radius) {
		this.raggio = radius;
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
	@Override
	public void disegna(Graphics graphics) {
		graphics.drawOval(x-raggio, y-raggio, raggio<<1, raggio<<1);
	}
}
