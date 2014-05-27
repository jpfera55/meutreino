package usuario.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JTree;
import javax.swing.JSlider;
import javax.swing.JProgressBar;
import javax.swing.KeyStroke;

import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.JSeparator;

import usuario.model.Usuario;

public class IndicadoresUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	
	Usuario usuario; // Instancia um Usuário


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IndicadoresUsuario frame = new IndicadoresUsuario();
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
	
	
	public IndicadoresUsuario() {
		setTitle("Indicadores ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 450);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnUsurio = new JMenu("Usu\u00E1rio");
		menuBar.add(mnUsurio);
		
		JMenuItem mntmPerfil = new JMenuItem("Perfil");
		mntmPerfil.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_MASK));
		mnUsurio.add(mntmPerfil);
		
		JMenu mnManuteno = new JMenu("Manuten\u00E7\u00E3o");
		menuBar.add(mnManuteno);
		
		JMenuItem mntmUsurio = new JMenuItem("Usu\u00E1rio");
		mntmUsurio.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, InputEvent.CTRL_MASK));
		mnManuteno.add(mntmUsurio);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Avalia\u00E7\u00E3o");
		mntmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK));
		mnManuteno.add(mntmNewMenuItem);
		
		JMenuItem mntmTreino = new JMenuItem("Treino");
		mntmTreino.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.CTRL_MASK));
		mnManuteno.add(mntmTreino);
		
		JMenuItem mntmNvel = new JMenuItem("N\u00EDvel");
		mntmNvel.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
		mnManuteno.add(mntmNvel);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(5, 65, 330, 315);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAltura.setBounds(33, 11, 40, 14);
		panel_1.add(lblAltura);
		
		textField = new JTextField();
		textField.setBounds(33, 31, 86, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(33, 96, 86, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblImc = new JLabel("IMC");
		lblImc.setBounds(33, 77, 46, 14);
		panel_1.add(lblImc);
		
		JLabel lblPonta = new JLabel("Pontua\u00E7\u00E3o");
		lblPonta.setBounds(33, 162, 86, 14);
		panel_1.add(lblPonta);
		lblPonta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_4 = new JTextField();
		textField_4.setBounds(33, 185, 86, 20);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNvel = new JLabel("N\u00EDvel");
		lblNvel.setBounds(33, 218, 46, 14);
		panel_1.add(lblNvel);
		lblNvel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_5 = new JTextField();
		textField_5.setBounds(33, 245, 158, 20);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(33, 149, 260, 2);
		panel_1.add(separator);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(345, 65, 329, 315);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label_3 = new JLabel("Peso Inicial");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_3.setBounds(22, 11, 93, 14);
		panel_2.add(label_3);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(22, 31, 86, 20);
		panel_2.add(textField_8);
		
		JLabel label_4 = new JLabel("kg");
		label_4.setBounds(118, 39, 26, 14);
		panel_2.add(label_4);
		
		JLabel label_5 = new JLabel("Peso Atual");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_5.setBounds(164, 11, 93, 14);
		panel_2.add(label_5);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(164, 31, 86, 20);
		panel_2.add(textField_9);
		
		JLabel label_6 = new JLabel("kg");
		label_6.setBounds(258, 39, 26, 14);
		panel_2.add(label_6);
		
		JLabel label_7 = new JLabel("Propor\u00E7\u00E3o ");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_7.setBounds(22, 95, 86, 19);
		panel_2.add(label_7);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(102, 96, 26, 20);
		panel_2.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(138, 96, 125, 20);
		panel_2.add(textField_11);
		
		JLabel label_8 = new JLabel("%");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_8.setBounds(271, 97, 26, 14);
		panel_2.add(label_8);
		
		textField_1 = new JTextField();
		textField_1.setBounds(22, 185, 86, 20);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_1 = new JLabel("%");
		label_1.setBounds(118, 188, 26, 14);
		panel_2.add(label_1);
		
		JLabel lblPesoInicial = new JLabel("BF Inicial");
		lblPesoInicial.setBounds(22, 160, 93, 14);
		panel_2.add(lblPesoInicial);
		lblPesoInicial.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_2 = new JTextField();
		textField_2.setBounds(164, 185, 86, 20);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblPesoFinal = new JLabel("BF Atual");
		lblPesoFinal.setBounds(164, 160, 93, 14);
		panel_2.add(lblPesoFinal);
		lblPesoFinal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblKg = new JLabel("%");
		lblKg.setBounds(258, 188, 26, 14);
		panel_2.add(lblKg);
		
		JLabel lblProporo = new JLabel("Propor\u00E7\u00E3o ");
		lblProporo.setBounds(22, 244, 86, 19);
		panel_2.add(lblProporo);
		lblProporo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_7 = new JTextField();
		textField_7.setBounds(102, 245, 26, 20);
		panel_2.add(textField_7);
		textField_7.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(138, 245, 125, 20);
		panel_2.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel label_2 = new JLabel("%");
		label_2.setBounds(271, 246, 26, 14);
		panel_2.add(label_2);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(22, 147, 275, 2);
		panel_2.add(separator_1);
		
		JLabel label = new JLabel("<Nome do Usu\u00E1rio>");
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setBounds(23, 21, 143, 27);
		contentPane.add(label);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(5, 11, 669, 44);
		contentPane.add(panel);
	}
}
