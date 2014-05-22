package usuario.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import usuario.controler.DadosInvalidosException;
import usuario.model.Usuario;
import usuario.model.UsuarioJaCadastradoException;
import usuario.model.UsuarioNaoEncontradoException;
import fachada.Fachada;

public class ContaUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfApelido;
	private JTextField tfIdade;
	private JTextField tfAltura;
	private JPasswordField tpSenha;
	private JPasswordField tpRedigite;
	private JTextField tfEmail;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	*/
	String senha = "";
	String RedSenha = "";
	
	int iSexo;
	Fachada fachada = Fachada.getInstance();
	ArrayList<Usuario> lista; // cria uma lista de Usuários
	Usuario usuario; // Instancia um Usuário
	
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
		
		tfNome = new JTextField();
		tfNome.setBounds(199, 37, 305, 20);
		panel_2.add(tfNome);
		tfNome.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:*");
		lblNome.setBounds(134, 40, 59, 14);
		panel_2.add(lblNome);
		
		JLabel lblApelido = new JLabel("Apelido:*");
		lblApelido.setBounds(130, 74, 59, 14);
		panel_2.add(lblApelido);
		
		tfApelido = new JTextField();
		tfApelido.setBounds(199, 71, 305, 20);
		panel_2.add(tfApelido);
		tfApelido.setColumns(10);
		
		JLabel lblEmail = new JLabel("e-mail:*");
		lblEmail.setBounds(134, 111, 59, 14);
		panel_2.add(lblEmail);
		
		tfEmail = new JTextField();
		tfEmail.setBounds(199, 108, 305, 20);
		panel_2.add(tfEmail);
		tfEmail.setColumns(10);
		
		JLabel lblIdade = new JLabel("Idade:*");
		lblIdade.setBounds(134, 142, 59, 14);
		panel_2.add(lblIdade);
		
		tfIdade = new JTextField();
		tfIdade.setBounds(199, 139, 86, 20);
		panel_2.add(tfIdade);
		tfIdade.setColumns(10);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setBounds(347, 142, 46, 14);
		panel_2.add(lblAltura);
		
		tfAltura = new JTextField();
		tfAltura.setBounds(399, 139, 86, 20);
		panel_2.add(tfAltura);
		tfAltura.setColumns(10);
		
		JLabel lblM = new JLabel("m");
		lblM.setBounds(495, 145, 17, 14);
		panel_2.add(lblM);
		
		JRadioButton rdFeminino = new JRadioButton("Feminino");
		buttonGroup.add(rdFeminino);
		rdFeminino.setBounds(308, 170, 96, 23);
		panel_2.add(rdFeminino);
		
		final JRadioButton rbMasculino = new JRadioButton("Masculino");
		rbMasculino.setSelected(true);
		buttonGroup.add(rbMasculino);
		rbMasculino.setBounds(198, 170, 108, 23);
		panel_2.add(rbMasculino);
		
		JLabel lblSexo = new JLabel("Sexo:*");
		lblSexo.setBounds(134, 174, 59, 14);
		panel_2.add(lblSexo);
		
		JLabel lblSenha = new JLabel("Senha:*");
		lblSenha.setBounds(134, 203, 59, 14);
		panel_2.add(lblSenha);
		
		tpSenha = new JPasswordField();
		tpSenha.setBounds(199, 200, 147, 20);
		panel_2.add(tpSenha);
		
		JLabel lblRedigiteASenha = new JLabel("Redigite a Senha:*");
		lblRedigiteASenha.setBounds(80, 234, 113, 14);
		panel_2.add(lblRedigiteASenha);
		
		tpRedigite = new JPasswordField();
		tpRedigite.setBounds(199, 231, 147, 20);
		panel_2.add(tpRedigite);
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				iSexo = rbMasculino.isSelected() ? 1 : 0;
				
				
				 senha = new String(tpSenha.getPassword());
				 RedSenha = new String(tpRedigite.getPassword());
				 
		         
				if (senha.equals(RedSenha)){
					salvarRegistro();
					
					dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(null,"O campo senha está diferente do campo Redigite sua Senha");
				}

			}
		});
	}
	
	
	public void salvarRegistro(){
		try{
			
				
				// Cria a instância de usuario
				usuario = new Usuario(tfNome.getText(), tfApelido.getText(), 0, tfEmail.getText(), senha, iSexo , Integer.parseInt(tfAltura.getText()) , Integer.parseInt(tfIdade.getText()), 0);
				
				fachada.usuarioCadastrar(usuario);
				JOptionPane.showMessageDialog(null, "Usuário Cadastrado Com sucesso!");
			
		}catch (UsuarioJaCadastradoException e){
			JOptionPane.showMessageDialog(null,e.getMessage());
		}catch(DadosInvalidosException e){
			JOptionPane.showMessageDialog(null,e.getMessage());
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
		}
	}
}
