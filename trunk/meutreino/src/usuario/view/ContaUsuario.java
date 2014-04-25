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
		setTitle("Conta Usu\u00E1rio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setToolTipText("Conta");
		panel_1.setBounds(10, 11, 664, 390);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 317, 644, 62);
		panel_1.add(panel);
		panel.setLayout(null);
		
		JButton btnAdicionar = new JButton("Salvar");
		btnAdicionar.setBounds(10, 21, 89, 23);
		panel.add(btnAdicionar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(109, 21, 89, 23);
		panel.add(btnCancelar);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(10, 11, 644, 295);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(199, 37, 305, 20);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:*");
		lblNome.setBounds(154, 40, 39, 14);
		panel_2.add(lblNome);
		
		JLabel lblApelido = new JLabel("Apelido:*");
		lblApelido.setBounds(148, 74, 45, 14);
		panel_2.add(lblApelido);
		
		textField_2 = new JTextField();
		textField_2.setBounds(199, 71, 305, 20);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblEmail = new JLabel("e-mail:*");
		lblEmail.setBounds(152, 111, 46, 14);
		panel_2.add(lblEmail);
		
		textField_6 = new JTextField();
		textField_6.setBounds(199, 108, 305, 20);
		panel_2.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblIdade = new JLabel("Idade:*");
		lblIdade.setBounds(154, 142, 39, 14);
		panel_2.add(lblIdade);
		
		textField_3 = new JTextField();
		textField_3.setBounds(199, 139, 86, 20);
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setBounds(347, 142, 46, 14);
		panel_2.add(lblAltura);
		
		textField_4 = new JTextField();
		textField_4.setBounds(399, 139, 86, 20);
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblM = new JLabel("m");
		lblM.setBounds(495, 145, 17, 14);
		panel_2.add(lblM);
		
		JRadioButton rdbtnFeminino = new JRadioButton("Feminino");
		rdbtnFeminino.setBounds(279, 170, 71, 23);
		panel_2.add(rdbtnFeminino);
		
		JRadioButton rdbtnM = new JRadioButton("Masculino");
		rdbtnM.setBounds(198, 170, 71, 23);
		panel_2.add(rdbtnM);
		
		JLabel lblSexo = new JLabel("Sexo:*");
		lblSexo.setBounds(154, 174, 39, 14);
		panel_2.add(lblSexo);
		
		JLabel lblSenha = new JLabel("Senha:*");
		lblSenha.setBounds(154, 203, 46, 14);
		panel_2.add(lblSenha);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(199, 200, 147, 20);
		panel_2.add(passwordField);
		
		JLabel lblRedigiteASenha = new JLabel("Redigite a Senha:*");
		lblRedigiteASenha.setBounds(104, 234, 96, 14);
		panel_2.add(lblRedigiteASenha);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(199, 231, 147, 20);
		panel_2.add(passwordField_1);
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
	}
}
