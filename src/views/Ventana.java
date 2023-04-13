package views;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Ventana extends JFrame {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipalMunicipios panel = new VentanaPrincipalMunicipios();
					Ventana v = new Ventana();
					v.setBounds(0, 0, 800, 600);
					v.setContentPane(panel);
					v.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
