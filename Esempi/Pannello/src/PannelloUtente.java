/**
 * Questa classe mostra le varie librerie messe a disposizione in Java
 * per la creazione di pannelli per gli utenti finali
 * @author Giacomo
 *
 */

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PannelloUtente {

	public static void main(String[] args) {
		//Viene creato il Menuu
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Azioni");
		JMenuItem item = new JMenuItem("Saluta Italiano");
		JMenuItem item2 = new JMenuItem("Saluta Inglese");
		menu.add(item);
		menu.add(item2);
		menuBar.add(menu);
		//Nella field viene inserito il testo
		final JTextField field = new JTextField();
		//Nella area viene mostrato all'utente
		final JTextArea area = new JTextArea();
		area.setEditable(true);
		//Se viene premuto il menu Saluta Italiano
		item.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				area.setText("Ciao "+field.getText()+" !");
			}
		});
		//Se viene premuto il menu Saluta Inglese
		item2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				area.setText("Hi "+field.getText()+" !");
			}
		});
		//Viene creato il frame
		JFrame frame = new JFrame("Pannello");
		//Vengono impostate le dimensioni del frame
		frame.setSize(500,500);
		//Viene impostato il layout del frame
		frame.add(field,BorderLayout.NORTH);
		frame.add(area,BorderLayout.CENTER);
		//Viene aggiunto il menu al frame
		frame.setJMenuBar(menuBar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		}
}
