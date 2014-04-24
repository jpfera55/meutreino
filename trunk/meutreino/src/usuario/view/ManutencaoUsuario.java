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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel label = new JLabel("Nome:*");
		label.setBounds(154, 112, 39, 14);
		panel.add(label);
		
		textField = new JTextField();
		textField.setBounds(199, 109, 305, 20);
		textField.setColumns(10);
		panel.add(textField);
		
		JLabel label_1 = new JLabel("Apelido:*");
		label_1.setBounds(148, 146, 45, 14);
		panel.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(199, 143, 305, 20);
		textField_1.setColumns(10);
		panel.add(textField_1);
		
		JLabel label_2 = new JLabel("Idade:*");
		label_2.setBounds(154, 214, 39, 14);
		panel.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(199, 211, 86, 20);
		textField_2.setColumns(10);
		panel.add(textField_2);
		
		JRadioButton radioButton = new JRadioButton("Masculino");
		radioButton.setBounds(198, 242, 71, 23);
		panel.add(radioButton);
		
		JLabel label_3 = new JLabel("Sexo:*");
		label_3.setBounds(154, 246, 39, 14);
		panel.add(label_3);
		
		JRadioButton radioButton_1 = new JRadioButton("Feminino");
		radioButton_1.setBounds(279, 242, 71, 23);
		panel.add(radioButton_1);
		
		JLabel label_4 = new JLabel("Altura:");
		label_4.setBounds(347, 214, 46, 14);
		panel.add(label_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(399, 211, 86, 20);
		textField_3.setColumns(10);
		panel.add(textField_3);
		
		JLabel label_5 = new JLabel("m");
		label_5.setBounds(495, 217, 17, 14);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("Senha:*");
		label_6.setBounds(154, 275, 46, 14);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("Redigite a Senha:*");
		label_7.setBounds(104, 306, 96, 14);
		panel.add(label_7);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(199, 272, 147, 20);
		panel.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(199, 303, 147, 20);
		panel.add(passwordField_1);
		
		JButton button = new JButton("Salvar");
		button.setBounds(439, 355, 87, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("Alterar");
		button_1.setBounds(148, 355, 87, 23);
		panel.add(button_1);
		
		JButton button_2 = new JButton("Excluir");
		button_2.setBounds(245, 355, 87, 23);
		panel.add(button_2);
		
		JLabel label_8 = new JLabel("e-mail:*");
		label_8.setBounds(152, 183, 46, 14);
		panel.add(label_8);
		
		textField_4 = new JTextField();
		textField_4.setBounds(199, 180, 305, 20);
		textField_4.setColumns(10);
		panel.add(textField_4);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBounds(577, 11, 87, 23);
		panel.add(btnPesquisar);
		
		JPanel panel_1 = new JPanel();
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
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(342, 355, 87, 23);
		panel.add(btnCancelar);
		
		JButton button_3 = new JButton("<<");
		button_3.setBounds(10, 11, 56, 23);
		panel.add(button_3);
		
		JButton button_4 = new JButton("<");
		button_4.setBounds(137, 11, 56, 23);
		panel.add(button_4);
		
		JButton button_5 = new JButton(">>");
		button_5.setBounds(199, 11, 56, 23);
		panel.add(button_5);
		
		JButton button_6 = new JButton(">");
		button_6.setBounds(71, 11, 56, 23);
		panel.add(button_6);
	}
}