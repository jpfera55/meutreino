package usuario.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

public class manutencaoNivel extends JFrame {

	private JPanel contentPane;
	private JTextField textField_2;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					manutencaoNivel frame = new manutencaoNivel();
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
	public manutencaoNivel() {
		setTitle("Manuten\u00E7\u00E3o N\u00EDvel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 452);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnPerfil = new JMenu("Perfil");
		menuBar.add(mnPerfil);
		
		JMenuItem mntmUsurio = new JMenuItem("Usu\u00E1rio");
		mntmUsurio.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, InputEvent.CTRL_MASK));
		mnPerfil.add(mntmUsurio);
		
		JMenu mnManuteno = new JMenu("Manuten\u00E7\u00E3o");
		menuBar.add(mnManuteno);
		
		JMenuItem mntmUsurio_1 = new JMenuItem("Usu\u00E1rio");
		mntmUsurio_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, InputEvent.CTRL_MASK));
		mnManuteno.add(mntmUsurio_1);
		
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
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(panel, BorderLayout.CENTER);
		
		JButton button = new JButton("Pesquisar");
		button.setBounds(577, 11, 87, 23);
		panel.add(button);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(10, 43, 654, 44);
		panel.add(panel_1);
		
		JLabel lblNvel = new JLabel("N\u00EDvel:");
		lblNvel.setBounds(146, 14, 27, 14);
		panel_1.add(lblNvel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(183, 11, 164, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JButton button_1 = new JButton("<<");
		button_1.setBounds(10, 11, 56, 23);
		panel.add(button_1);
		
		JButton button_2 = new JButton(">");
		button_2.setBounds(137, 11, 56, 23);
		panel.add(button_2);
		
		JButton button_3 = new JButton(">>");
		button_3.setBounds(199, 11, 56, 23);
		panel.add(button_3);
		
		JButton button_4 = new JButton("<");
		button_4.setBounds(71, 11, 56, 23);
		panel.add(button_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"N\u00EDvel"}));
		comboBox.setBounds(316, 12, 77, 20);
		panel.add(comboBox);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(399, 12, 168, 20);
		panel.add(textField_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setToolTipText("");
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(10, 98, 654, 210);
		panel.add(panel_2);
		
		JLabel lblPontuaoInicial = new JLabel("Pontua\u00E7\u00E3o Inicial:*");
		lblPontuaoInicial.setBounds(71, 92, 110, 14);
		panel_2.add(lblPontuaoInicial);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(177, 89, 86, 20);
		panel_2.add(textField_5);
		
		JLabel lblPontuaoFinal = new JLabel("Pontua\u00E7\u00E3o Final:*");
		lblPontuaoFinal.setBounds(347, 92, 102, 14);
		panel_2.add(lblPontuaoFinal);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(442, 89, 86, 20);
		panel_2.add(textField_6);
		
		JLabel lblFaixa = new JLabel("Faixa");
		lblFaixa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFaixa.setBounds(23, 11, 46, 14);
		panel_2.add(lblFaixa);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(20, 36, 607, 8);
		panel_2.add(separator);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(10, 319, 654, 51);
		panel.add(panel_3);
		
		JButton button_5 = new JButton("Alterar");
		button_5.setBounds(10, 11, 87, 23);
		panel_3.add(button_5);
		
		JButton button_6 = new JButton("Excluir");
		button_6.setBounds(107, 11, 87, 23);
		panel_3.add(button_6);
		
		JButton button_7 = new JButton("Cancelar");
		button_7.setBounds(204, 11, 87, 23);
		panel_3.add(button_7);
		
		JButton button_8 = new JButton("Salvar");
		button_8.setBounds(301, 11, 87, 23);
		panel_3.add(button_8);
	}
}
