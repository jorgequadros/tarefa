package view;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ViewTarefa extends JInternalFrame {
	private JTextField tfTitulo;

	
	/**
	 * Create the frame.
	 */
	public ViewTarefa() {
		setResizable(true);
		setClosable(true);
		setBounds(100, 100, 400, 300);
		getContentPane().setLayout(null);
		
		JLabel lblTituloForm = new JLabel("Cadastro de Tarefa");
		lblTituloForm.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTituloForm.setBounds(91, 11, 200, 35);
		getContentPane().add(lblTituloForm);
		
		JLabel lblTitulo = new JLabel("Titulo");
		lblTitulo.setBounds(25, 53, 46, 14);
		getContentPane().add(lblTitulo);
		
		tfTitulo = new JTextField();
		tfTitulo.setBounds(25, 68, 180, 20);
		getContentPane().add(tfTitulo);
		tfTitulo.setColumns(10);
		
		JFormattedTextField ftfData = new JFormattedTextField();
		ftfData.setBounds(215, 68, 141, 20);
		getContentPane().add(ftfData);
		
		JLabel lblData = new JLabel("Data da Tarefa");
		lblData.setBounds(215, 53, 73, 14);
		getContentPane().add(lblData);
		
		JLabel lblDescricao = new JLabel("Descrição");
		lblDescricao.setBounds(25, 99, 46, 14);
		getContentPane().add(lblDescricao);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 115, 331, 97);
		getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(171, 223, 89, 23);
		getContentPane().add(btnOk);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(270, 223, 89, 23);
		getContentPane().add(btnCancelar);

	}
}
