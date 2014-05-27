package usuario.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JPasswordField;

import java.awt.Font;

import javax.swing.border.LineBorder;

import aplicacao.TelaPrincipal;
import usuario.model.RepositorioException;
import usuario.model.Usuario;
import usuario.model.UsuarioNaoEncontradoException;
import fachada.Fachada;

import java.awt.Color;
import java.sql.SQLException;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField tfEmail;
	private JButton btnCriarConta;
	private JLabel lblAbraSuaConta;
	private JPasswordField tpSenha;
	
	Fachada fachada = Fachada.getInstance();
	Usuario usuario; // Instancia um Usuário

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("MeuTreino");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 382, 229);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnCriarConta = new JButton("Criar Conta");
		btnCriarConta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ContaUsuario conta = new ContaUsuario();
				// invoca a tela ContaUsuario
				conta.setVisible(true);
				
				dispose();
			}
		});
		btnCriarConta.setBounds(102, 139, 164, 23);
		contentPane.add(btnCriarConta);
		
		lblAbraSuaConta = new JLabel("Abra sua conta");
		lblAbraSuaConta.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAbraSuaConta.setBounds(126, 104, 106, 24);
		contentPane.add(lblAbraSuaConta);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 11, 346, 169);
		contentPane.add(panel);
		panel.setLayout(null);
		
		tfEmail = new JTextField();
		tfEmail.setBounds(61, 32, 255, 20);
		panel.add(tfEmail);
		tfEmail.setColumns(10);
		
		tpSenha = new JPasswordField();
		tpSenha.setBounds(61, 66, 178, 20);
		panel.add(tpSenha);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(10, 67, 46, 14);
		panel.add(lblSenha);
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblLogin = new JLabel("Email:");
		lblLogin.setBounds(10, 31, 46, 19);
		panel.add(lblLogin);
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(249, 65, 67, 23);
		panel.add(btnOk);
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String senha = new String(tpSenha.getPassword());
				String email = tfEmail.getText();
				
								
				try {
					if(fachada.acessoAoSistema(email, senha)){
						
						TelaPrincipal telaPrincipal = new TelaPrincipal();
						telaPrincipal.setVisible(true);
						dispose();
					}
					else{
						JOptionPane.showMessageDialog(null, "Usuário ou senha Inválidos!");
					}
				} catch (RepositorioException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (HeadlessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (UsuarioNaoEncontradoException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		});
	}
}
