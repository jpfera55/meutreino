package usuario.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
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
		
		JLabel lblPesoInicial = new JLabel("Peso Inicial");
		lblPesoInicial.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPesoInicial.setBounds(33, 81, 93, 14);
		panel_1.add(lblPesoInicial);
		
		textField_1 = new JTextField();
		textField_1.setBounds(33, 106, 86, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPesoFinal = new JLabel("Peso Atual");
		lblPesoFinal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPesoFinal.setBounds(175, 81, 93, 14);
		panel_1.add(lblPesoFinal);
		
		textField_2 = new JTextField();
		textField_2.setBounds(175, 106, 86, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(33, 238, 86, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblImc = new JLabel("IMC");
		lblImc.setBounds(33, 220, 46, 14);
		panel_1.add(lblImc);
		
		JLabel lblProporo = new JLabel("Propor\u00E7\u00E3o ");
		lblProporo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblProporo.setBounds(33, 165, 86, 19);
		panel_1.add(lblProporo);
		
		JLabel lblKg = new JLabel("kg");
		lblKg.setBounds(269, 109, 26, 14);
		panel_1.add(lblKg);
		
		JLabel label_1 = new JLabel("kg");
		label_1.setBounds(129, 109, 26, 14);
		panel_1.add(label_1);
		
		textField_6 = new JTextField();
		textField_6.setBounds(149, 166, 125, 20);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(113, 166, 26, 20);
		panel_1.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel label_2 = new JLabel("%");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(282, 167, 26, 14);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("<Resultado IMC>");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_3.setBounds(106, 269, 114, 25);
		panel_1.add(label_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(345, 65, 329, 315);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblPonta = new JLabel("Pontua\u00E7\u00E3o");
		lblPonta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPonta.setBounds(28, 22, 86, 14);
		panel_2.add(lblPonta);
		
		textField_4 = new JTextField();
		textField_4.setBounds(28, 47, 86, 20);
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNvel = new JLabel("N\u00EDvel");
		lblNvel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNvel.setBounds(28, 140, 46, 14);
		panel_2.add(lblNvel);
		
		textField_5 = new JTextField();
		textField_5.setBounds(28, 165, 229, 20);
		panel_2.add(textField_5);
		textField_5.setColumns(10);
		
		JSlider slider = new JSlider();
		slider.setBounds(28, 96, 257, 23);
		panel_2.add(slider);
		
		JLabel label = new JLabel("<Nome do Usu\u00E1rio>");
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setBounds(23, 21, 143, 33);
		contentPane.add(label);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(5, 11, 669, 44);
		contentPane.add(panel);
	}
}
