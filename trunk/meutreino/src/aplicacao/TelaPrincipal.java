package aplicacao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;


import treino.view.ManutencaoTreino2;
import usuario.view.ManutencaoUsuario;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnManuteoUsurio = new JButton("Usu\u00E1rio");
		btnManuteoUsurio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ManutencaoUsuario manUsuario = new ManutencaoUsuario();
				manUsuario.setVisible(true);
								
			}
		});
		btnManuteoUsurio.setBounds(105, 76, 209, 23);
		panel.add(btnManuteoUsurio);
		
		JButton btnNewButton = new JButton("Treino");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ManutencaoTreino2 manTreino = new ManutencaoTreino2();
				manTreino.setVisible(true);
			}
		});
		btnNewButton.setBounds(105, 110, 209, 23);
		panel.add(btnNewButton);
		
		JButton btnAvaliao = new JButton(" Avalia\u00E7\u00E3o");
		btnAvaliao.setBounds(108, 144, 206, 23);
		panel.add(btnAvaliao);
	}
}
