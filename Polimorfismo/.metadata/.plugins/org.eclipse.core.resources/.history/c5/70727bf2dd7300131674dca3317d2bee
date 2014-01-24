/**
 * Questo test verifica il corretto funzionamento di colorazione per 
 * i disegnabili
 * @author Giacomo
 */
package tests;

import java.awt.Color;

import javax.swing.JFrame;

import utils.Cerchio;
import utils.DisegnabileColorato;
import utils.Pannello;
import utils.Rettangolo;

public class Tests02 {
	public static void main(String[] args) {
		Pannello pannello = new Pannello();
		Cerchio cerchio = new Cerchio(100, 100, 100);
		Rettangolo rettangolo = new Rettangolo(200, 200, 100, 100);
		pannello.aggiungiDisegnabile(new DisegnabileColorato(Color .BLUE, cerchio));
		pannello.aggiungiDisegnabile(new DisegnabileColorato(Color .ORANGE,rettangolo));
		JFrame frame = new JFrame("Disegnabile");
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(pannello);
		frame.setVisible(true);
	}
}
