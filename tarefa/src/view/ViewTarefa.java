package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;

@SuppressWarnings("serial")
public class ViewTarefa extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewTarefa frame = new ViewTarefa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewTarefa() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblTituloForm = new JLabel("Cadastro de Tarefa");
		lblTituloForm.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTituloForm.setBounds(113, 11, 200, 35);
		getContentPane().add(lblTituloForm);

	}
}
