package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class ViewPrincipal extends JFrame {

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
		getContentPane().setLayout(null);
		
		JDesktopPane desktop = new JDesktopPane();
		desktop.setBounds(10, 31, 764, 519);
		getContentPane().add(desktop);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(10, 11, 764, 22);
		getContentPane().add(menuBar);
		
		JMenu mnuCadastro = new JMenu("Cadastro");
		menuBar.add(mnuCadastro);
		
		JMenuItem mnuItemTarefa = new JMenuItem("Tarefa");
		mnuItemTarefa.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							ViewTarefa frame = new ViewTarefa();
							frame.setVisible(true);
							desktop.add(frame);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
			
		});
		mnuCadastro.add(mnuItemTarefa);
		
		JMenu mnuConsulta = new JMenu("Consulta");
		menuBar.add(mnuConsulta);
		
		JMenuItem mnuItemConsTarefaPorDia = new JMenuItem("Tarefa por Dia");
		mnuConsulta.add(mnuItemConsTarefaPorDia);
		
		JMenuItem mnuItemConsTarefaPorPeriodo = new JMenuItem("Tarefa por Periodo");
		mnuConsulta.add(mnuItemConsTarefaPorPeriodo);
		
		JMenu mnuRelatorio = new JMenu("Relatório");
		menuBar.add(mnuRelatorio);
		
		JMenuItem mnuItemTarefaDia = new JMenuItem("Tarefa por Dia");
		mnuRelatorio.add(mnuItemTarefaDia);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Tarefa por Periodo");
		mnuRelatorio.add(mntmNewMenuItem);
		
		JMenu mnuAjuda = new JMenu("Ajuda");
		menuBar.add(mnuAjuda);
		
		JMenuItem mnuItemSobre = new JMenuItem("Sobre");
		mnuAjuda.add(mnuItemSobre);
		
		JMenuItem mnuItemSair = new JMenuItem("Sair");
		mnuAjuda.add(mnuItemSair);
		
		
	}
}
