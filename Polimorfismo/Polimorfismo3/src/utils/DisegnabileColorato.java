package utils;

import java.awt.Color;
import java.awt.Graphics;

public class DisegnabileColorato implements Disegnabile {
	private Color color;
	private Disegnabile disegnabile;
	
	public DisegnabileColorato(Color color, Disegnabile disegnabile) {
		super();
		this.color = color;
		this.disegnabile = disegnabile;
	}
	
	@Override
	public void disegna(Graphics graphics) {
		graphics.setColor(color);
		disegnabile.disegna(graphics);
	}
}
