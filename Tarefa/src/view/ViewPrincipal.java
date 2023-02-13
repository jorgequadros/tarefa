package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class ViewPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewPrincipal frame = new ViewPrincipal();
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
	public ViewPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JDesktopPane desktop = new JDesktopPane();
		desktop.setBounds(10, 32, 764, 518);
		contentPane.add(desktop);
		
		JMenuBar BarraMenu = new JMenuBar();
		BarraMenu.setBounds(10, 11, 764, 22);
		contentPane.add(BarraMenu);
		
		JMenu mnuCadastro = new JMenu("Cadastro");
		BarraMenu.add(mnuCadastro);
		
		JMenu mnuConsulta = new JMenu("Consulta");
		BarraMenu.add(mnuConsulta);
		
		JMenu mnuRelatorio = new JMenu("Relatório");
		BarraMenu.add(mnuRelatorio);
		
		JMenuItem mnuItemRelTarefaDia = new JMenuItem("Tarefa por Dia");
		mnuRelatorio.add(mnuItemRelTarefaDia);
		
		JMenu mnuAjuda = new JMenu("Ajuda");
		BarraMenu.add(mnuAjuda);
		
		JMenuItem mnuItemAjudaSobre = new JMenuItem("Sobre");
		mnuAjuda.add(mnuItemAjudaSobre);
		
		JMenuItem menuItem = new JMenuItem("New menu item");
		mnuAjuda.add(menuItem);
	}
}
