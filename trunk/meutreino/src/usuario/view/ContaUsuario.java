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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class ContaUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField_6;

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
		
		JPanel panel_1 = new JPanel();
		panel_1.setToolTipText("Conta");
		panel_1.setBounds(10, 11, 664, 390);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:*");
		lblNome.setBounds(154, 83, 39, 14);
		panel_1.add(lblNome);
		
		textField_1 = new JTextField();
		textField_1.setBounds(199, 80, 305, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblApelido = new JLabel("Apelido:*");
		lblApelido.setBounds(148, 117, 45, 14);
		panel_1.add(lblApelido);
		
		textField_2 = new JTextField();
		textField_2.setBounds(199, 114, 305, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblIdade = new JLabel("Idade:*");
		lblIdade.setBounds(154, 185, 39, 14);
		panel_1.add(lblIdade);
		
		textField_3 = new JTextField();
		textField_3.setBounds(199, 182, 86, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JRadioButton rdbtnM = new JRadioButton("Masculino");
		rdbtnM.setBounds(198, 213, 71, 23);
		panel_1.add(rdbtnM);
		
		JLabel lblSexo = new JLabel("Sexo:*");
		lblSexo.setBounds(154, 217, 39, 14);
		panel_1.add(lblSexo);
		
		JRadioButton rdbtnFeminino = new JRadioButton("Feminino");
		rdbtnFeminino.setBounds(279, 213, 71, 23);
		panel_1.add(rdbtnFeminino);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setBounds(347, 185, 46, 14);
		panel_1.add(lblAltura);
		
		textField_4 = new JTextField();
		textField_4.setBounds(399, 182, 86, 20);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblM = new JLabel("m");
		lblM.setBounds(495, 188, 17, 14);
		panel_1.add(lblM);
		
		JLabel lblSenha = new JLabel("Senha:*");
		lblSenha.setBounds(154, 246, 46, 14);
		panel_1.add(lblSenha);
		
		JLabel lblRedigiteASenha = new JLabel("Redigite a Senha:*");
		lblRedigiteASenha.setBounds(104, 277, 96, 14);
		panel_1.add(lblRedigiteASenha);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(199, 243, 147, 20);
		panel_1.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(199, 274, 147, 20);
		panel_1.add(passwordField_1);
		
		JButton btnAdicionar = new JButton("Salvar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAdicionar.setBounds(565, 356, 89, 23);
		panel_1.add(btnAdicionar);
		
		JLabel lblEmail = new JLabel("e-mail:*");
		lblEmail.setBounds(152, 154, 46, 14);
		panel_1.add(lblEmail);
		
		textField_6 = new JTextField();
		textField_6.setBounds(199, 151, 305, 20);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
	}
}
