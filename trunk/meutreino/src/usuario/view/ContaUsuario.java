package usuario.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;

public class ContaUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContaUsuario frame = new ContaUsuario();
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
	public ContaUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 664, 47);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblIdusurio = new JLabel("IdUsu\u00E1rio:");
		lblIdusurio.setBounds(92, 11, 63, 24);
		panel.add(lblIdusurio);
		
		textField = new JTextField();
		textField.setBounds(155, 13, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 69, 664, 332);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:*");
		lblNome.setBounds(110, 55, 39, 14);
		panel_1.add(lblNome);
		
		textField_1 = new JTextField();
		textField_1.setBounds(159, 52, 443, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblApelido = new JLabel("Apelido:*");
		lblApelido.setBounds(104, 89, 45, 14);
		panel_1.add(lblApelido);
		
		textField_2 = new JTextField();
		textField_2.setBounds(159, 86, 244, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblIdade = new JLabel("Idade:*");
		lblIdade.setBounds(110, 127, 39, 14);
		panel_1.add(lblIdade);
		
		textField_3 = new JTextField();
		textField_3.setBounds(159, 124, 86, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JRadioButton rdbtnM = new JRadioButton("Masculino");
		rdbtnM.setBounds(154, 155, 71, 23);
		panel_1.add(rdbtnM);
		
		JLabel lblSexo = new JLabel("Sexo:*");
		lblSexo.setBounds(110, 159, 39, 14);
		panel_1.add(lblSexo);
		
		JRadioButton rdbtnFeminino = new JRadioButton("Feminino");
		rdbtnFeminino.setBounds(235, 155, 71, 23);
		panel_1.add(rdbtnFeminino);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setBounds(265, 127, 46, 14);
		panel_1.add(lblAltura);
		
		textField_4 = new JTextField();
		textField_4.setBounds(317, 124, 86, 20);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblM = new JLabel("m");
		lblM.setBounds(413, 130, 46, 14);
		panel_1.add(lblM);
		
		JLabel lblLogin = new JLabel("Login:*");
		lblLogin.setBounds(110, 196, 46, 14);
		panel_1.add(lblLogin);
		
		textField_5 = new JTextField();
		textField_5.setBounds(159, 193, 147, 19);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:*");
		lblSenha.setBounds(110, 226, 46, 14);
		panel_1.add(lblSenha);
		
		JLabel lblRedigiteASenha = new JLabel("Redigite a Senha:*");
		lblRedigiteASenha.setBounds(60, 257, 96, 14);
		panel_1.add(lblRedigiteASenha);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(159, 223, 147, 20);
		panel_1.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(159, 254, 147, 20);
		panel_1.add(passwordField_1);
	}
}
