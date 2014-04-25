package usuario.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

public class ManutencaoUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManutencaoUsuario frame = new ManutencaoUsuario();
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
	public ManutencaoUsuario() {
		setTitle("Manuten\u00E7\u00E3o Usu\u00E1rio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 450);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnUsurio = new JMenu("Usu\u00E1rio");
		menuBar.add(mnUsurio);
		
		JMenuItem mntmPerfil = new JMenuItem("Perfil");
		mntmPerfil.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.CTRL_MASK));
		mnUsurio.add(mntmPerfil);
		
		JMenu mnTreino = new JMenu("Manuten\u00E7\u00E3o");
		menuBar.add(mnTreino);
		
		JMenuItem mntmUsurio = new JMenuItem("Usu\u00E1rio");
		mntmUsurio.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, InputEvent.CTRL_MASK));
		mnTreino.add(mntmUsurio);
		
		JMenuItem mntmAvaliao = new JMenuItem("Avalia\u00E7\u00E3o");
		mntmAvaliao.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK));
		mnTreino.add(mntmAvaliao);
		
		JMenuItem mntmTreino = new JMenuItem("Treino");
		mntmTreino.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.CTRL_MASK));
		mnTreino.add(mntmTreino);
		
		JMenuItem mntmNvel = new JMenuItem("N\u00EDvel");
		mntmNvel.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
		mnTreino.add(mntmNvel);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(199, 109, 305, 20);
		textField.setColumns(10);
		panel.add(textField);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBounds(577, 11, 87, 23);
		panel.add(btnPesquisar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(10, 45, 654, 53);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		textField_5 = new JTextField();
		textField_5.setBounds(187, 14, 86, 20);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblIdusuario = new JLabel("IdUsuario:");
		lblIdusuario.setBounds(125, 17, 56, 14);
		panel_1.add(lblIdusuario);
		
		JButton button_3 = new JButton("<<");
		button_3.setBounds(10, 11, 56, 23);
		panel.add(button_3);
		
		JButton button_4 = new JButton(">");
		button_4.setBounds(137, 11, 56, 23);
		panel.add(button_4);
		
		JButton button_5 = new JButton(">>");
		button_5.setBounds(199, 11, 56, 23);
		panel.add(button_5);
		
		JButton button_6 = new JButton("<");
		button_6.setBounds(71, 11, 56, 23);
		panel.add(button_6);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"IdUsuario", "Nome", "E-mail"}));
		comboBox.setBounds(316, 12, 77, 20);
		panel.add(comboBox);
		
		textField_6 = new JTextField();
		textField_6.setBounds(399, 12, 168, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(10, 102, 654, 206);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label_1 = new JLabel("Apelido:*");
		label_1.setBounds(136, 36, 45, 14);
		panel_2.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(191, 33, 305, 20);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_8 = new JLabel("e-mail:*");
		label_8.setBounds(140, 64, 46, 14);
		panel_2.add(label_8);
		
		textField_4 = new JTextField();
		textField_4.setBounds(191, 61, 305, 20);
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel label_2 = new JLabel("Idade:*");
		label_2.setBounds(140, 92, 46, 14);
		panel_2.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(191, 89, 86, 20);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label_4 = new JLabel("Altura:");
		label_4.setBounds(347, 92, 46, 14);
		panel_2.add(label_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(391, 92, 86, 20);
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel label_5 = new JLabel("m");
		label_5.setBounds(479, 92, 17, 14);
		panel_2.add(label_5);
		
		JLabel label = new JLabel("Nome:*");
		label.setBounds(142, 11, 39, 14);
		panel_2.add(label);
		
		JLabel label_3 = new JLabel("Sexo:*");
		label_3.setBounds(146, 121, 39, 14);
		panel_2.add(label_3);
		
		JRadioButton radioButton = new JRadioButton("Masculino");
		radioButton.setBounds(190, 117, 71, 23);
		panel_2.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Feminino");
		radioButton_1.setBounds(271, 117, 71, 23);
		panel_2.add(radioButton_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(191, 147, 147, 20);
		panel_2.add(passwordField);
		
		JLabel label_6 = new JLabel("Senha:*");
		label_6.setBounds(146, 150, 46, 14);
		panel_2.add(label_6);
		
		JLabel label_7 = new JLabel("Redigite a Senha:*");
		label_7.setBounds(96, 181, 96, 14);
		panel_2.add(label_7);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(191, 178, 147, 20);
		panel_2.add(passwordField_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(10, 319, 654, 51);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JButton button_1 = new JButton("Alterar");
		button_1.setBounds(10, 11, 87, 23);
		panel_3.add(button_1);
		
		JButton button_2 = new JButton("Excluir");
		button_2.setBounds(107, 11, 87, 23);
		panel_3.add(button_2);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(204, 11, 87, 23);
		panel_3.add(btnCancelar);
		
		JButton button = new JButton("Salvar");
		button.setBounds(301, 11, 87, 23);
		panel_3.add(button);
	}
}
