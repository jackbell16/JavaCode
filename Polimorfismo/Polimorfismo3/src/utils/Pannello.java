/**
 * Questa classe ha la responsabilità di disegnare tutti gli elementi
 * in un pannello
 * @author Giacomo
 */
package utils;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Pannello extends JPanel {
	private static final long serialVersionUID = 1L;
	private ArrayList<Disegnabile> disegnabili = new ArrayList<>();
	
	public void aggiungiDisegnabile(Disegnabile disegnabile){
			disegnabili.add(disegnabile);
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (int i = 0; i < disegnabili.size(); i++) {
			disegnabili.get(i).disegna(g);
		}
	}
}
