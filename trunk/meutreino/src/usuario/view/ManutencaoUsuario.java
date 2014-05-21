package usuario.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import usuario.controler.DadosInvalidosException;
import usuario.model.RepositorioException;
import usuario.model.Usuario;
import usuario.model.UsuarioJaCadastradoException;
import usuario.model.UsuarioNaoEncontradoException;

import javax.swing.SwingConstants;

import fachada.Fachada;

import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;

@SuppressWarnings("serial")
public class ManutencaoUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfApelido;
	private JTextField tfIdade;
	private JTextField tfAltura;
	private JPasswordField tpSenha;
	private JTextField tfEmail;
	private JTextField tfIdUsuario;
	private JTextField tfPesquisar;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JPasswordField tpRedigite;
	
	Fachada fachada = Fachada.getInstance();
	ArrayList<Usuario> lista; // cria uma lista de Usuários
	Usuario usuario; // Instancia um Usuário

	private String cAcao = "";
	int iSexo = 0, iPerfil = 0;
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
		
		JPanel principal = new JPanel();
		principal.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(principal, BorderLayout.CENTER);
		
		JPanel navegacao = new JPanel();
		navegacao.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JButton button_3 = new JButton("<<");
		button_3.setIcon(new ImageIcon(ManutencaoUsuario.class.getResource("/img/del-all.bmp")));
		button_3.setToolTipText("Primeiro Registro");
		
		JButton button_6 = new JButton("<");
		
		JButton button_4 = new JButton(">");
		
		JButton button_5 = new JButton(">>");
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"IdUsuario", "Nome", "E-mail"}));
		
		tfPesquisar = new JTextField();
		tfPesquisar.setColumns(10);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//JOptionPane.showMessageDialog(null, tfPesquisar.getText());
				//if(tfPesquisar.getText() != "")				
					pesquisar(comboBox.getSelectedItem().toString(), tfPesquisar.getText());
				//else
					//JOptionPane.showMessageDialog(null, "Informe dados para pesquisa");
			}
		});
		GroupLayout gl_navegacao = new GroupLayout(navegacao);
		gl_navegacao.setHorizontalGroup(
			gl_navegacao.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_navegacao.createSequentialGroup()
					.addContainerGap()
					.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addGap(5)
					.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(tfPesquisar, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(btnPesquisar, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_navegacao.setVerticalGroup(
			gl_navegacao.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_navegacao.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_navegacao.createSequentialGroup()
						.addGap(12)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(17, Short.MAX_VALUE))
					.addGroup(gl_navegacao.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_navegacao.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(button_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnPesquisar, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(Alignment.LEADING, gl_navegacao.createSequentialGroup()
								.addGap(1)
								.addComponent(tfPesquisar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addComponent(button_6, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(button_4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(button_5, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap(15, Short.MAX_VALUE)))
		);
		navegacao.setLayout(gl_navegacao);
		
		JPanel dados = new JPanel();
		dados.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JLabel label_1 = new JLabel("Apelido:*");
		label_1.setBounds(102, 77, 51, 14);
		
		tfApelido = new JTextField();
		tfApelido.setEnabled(false);
		tfApelido.setBounds(165, 68, 403, 20);
		tfApelido.setColumns(10);
		
		JLabel label_8 = new JLabel("e-mail:*");
		label_8.setBounds(108, 102, 45, 14);
		
		tfEmail = new JTextField();
		tfEmail.setEnabled(false);
		tfEmail.setBounds(165, 96, 403, 20);
		tfEmail.setColumns(10);
		
		JLabel label_2 = new JLabel("Idade:*");
		label_2.setBounds(107, 127, 46, 14);
		
		tfIdade = new JTextField();
		tfIdade.setEnabled(false);
		tfIdade.setBounds(165, 124, 86, 20);
		tfIdade.setColumns(10);
		
		JLabel lblAltura = new JLabel("Altura*:");
		lblAltura.setBounds(408, 127, 46, 14);
		
		tfAltura = new JTextField();
		tfAltura.setEnabled(false);
		tfAltura.setBounds(459, 127, 86, 20);
		tfAltura.setColumns(10);
		
		JLabel label_5 = new JLabel("m");
		label_5.setBounds(551, 130, 17, 14);
		
		JLabel label = new JLabel("Nome:*");
		label.setBounds(108, 45, 45, 14);
		
		JLabel label_3 = new JLabel("Sexo:*");
		label_3.setBounds(108, 151, 45, 14);
		
		final JRadioButton rbMasculino = new JRadioButton("Masculino");
		rbMasculino.setSelected(true);
		buttonGroup.add(rbMasculino);
		rbMasculino.setBounds(159, 147, 86, 23);
		
		JRadioButton rbFeminino = new JRadioButton("Feminino");
		buttonGroup.add(rbFeminino);
		rbFeminino.setBounds(247, 147, 86, 23);
		
		JRadioButton rbAdmin = new JRadioButton("Admin");
		buttonGroup_1.add(rbAdmin);
		rbAdmin.setBounds(504, 147, 64, 23);
		dados.add(rbAdmin);
		
		final JRadioButton rbComum = new JRadioButton("Comum");
		rbComum.setSelected(true);
		buttonGroup_1.add(rbComum);
		rbComum.setBounds(418, 147, 79, 23);
		dados.add(rbComum);
		
		tpSenha = new JPasswordField();
		tpSenha.setEnabled(false);
		tpSenha.setBounds(165, 176, 134, 20);
		
		JLabel label_6 = new JLabel("Senha:*");
		label_6.setBounds(102, 179, 51, 14);
		
		tfNome = new JTextField();
		tfNome.setEnabled(false);
		tfNome.setBounds(165, 42, 403, 20);
		tfNome.setColumns(10);
		
		JPanel acoes = new JPanel();
		acoes.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				cAcao = "alterar";
				habilitaCampos("alterar");
			}
		});
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
					
		        int opcao = JOptionPane.showConfirmDialog(null, "Confirma a exclusão", "Sim ou não?", JOptionPane.YES_NO_OPTION);  
					
			    if(opcao == 0) { 
					try {	
						fachada.usuarioRemover(Integer.parseInt(tfIdUsuario.getText()));
						
						JOptionPane.showMessageDialog(null, "Usuário Removido com Sucesso");
						// Recuperar o registro anterior para exibir na tela
						desabilitaCampos();
						
						
					} catch (NumberFormatException | UsuarioNaoEncontradoException e) {
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(null, e.getMessage());
						//e.printStackTrace();
					} catch (RepositorioException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (HeadlessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				}
			    
			}
			});
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				if(cAcao == "novo"){
					limpaCampos();
					desabilitaCampos();
					
										
				}
				else if(cAcao == "alterar"){
					
					desabilitaCampos();
				}
			}
		});
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				iSexo = rbMasculino.isSelected() ? 1 : 0;
				iPerfil = rbComum.isSelected() ? 1 : 0;
				
				salvarRegistro(cAcao);					
				
				
			}
		});
		
		JButton btnNovo = new JButton("Novo");
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Habilita os campos para Inserção
				limpaCampos();
				
				cAcao = "novo";
				
				habilitaCampos(cAcao);
				
				
				/*int ultimoRegistroId = 0;
				try {
					ultimoRegistroId = fachada.ultimoRegistroId();
					
					JOptionPane.showMessageDialog(null, ultimoRegistroId);
				} catch (RepositorioException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				tfIdUsuario.setText(String.valueOf(ultimoRegistroId + 1));*/
				
							
			}
		});
		GroupLayout gl_acoes = new GroupLayout(acoes);
		gl_acoes.setHorizontalGroup(
			gl_acoes.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_acoes.createSequentialGroup()
					.addGap(7)
					.addComponent(btnNovo)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnAlterar, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(btnExcluir, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(btnSalvar, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(174, Short.MAX_VALUE))
		);
		gl_acoes.setVerticalGroup(
			gl_acoes.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_acoes.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_acoes.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_acoes.createParallelGroup(Alignment.LEADING)
							.addComponent(btnAlterar)
							.addComponent(btnExcluir)
							.addComponent(btnCancelar)
							.addComponent(btnSalvar))
						.addComponent(btnNovo))
					.addContainerGap(15, Short.MAX_VALUE))
		);
		gl_acoes.linkSize(SwingConstants.HORIZONTAL, new Component[] {btnAlterar, btnNovo});
		acoes.setLayout(gl_acoes);
		GroupLayout gl_principal = new GroupLayout(principal);
		gl_principal.setHorizontalGroup(
			gl_principal.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_principal.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_principal.createParallelGroup(Alignment.LEADING)
						.addComponent(acoes, GroupLayout.PREFERRED_SIZE, 654, GroupLayout.PREFERRED_SIZE)
						.addComponent(navegacao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
				.addGroup(gl_principal.createSequentialGroup()
					.addContainerGap()
					.addComponent(dados, GroupLayout.PREFERRED_SIZE, 654, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_principal.setVerticalGroup(
			gl_principal.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_principal.createSequentialGroup()
					.addGap(10)
					.addComponent(navegacao, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(dados, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(acoes, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
					.addGap(10))
		);
		dados.setLayout(null);
		dados.add(label_1);
		dados.add(label);
		dados.add(label_8);
		dados.add(label_2);
		dados.add(label_3);
		dados.add(label_6);
		dados.add(tfNome);
		dados.add(tfApelido);
		dados.add(tfEmail);
		dados.add(tfIdade);
		dados.add(tfAltura);
		dados.add(lblAltura);
		dados.add(label_5);
		dados.add(tpSenha);
		dados.add(rbMasculino);
		dados.add(rbFeminino);
		
		tfIdUsuario = new JTextField();
		tfIdUsuario.setBounds(165, 11, 86, 20);
		dados.add(tfIdUsuario);
		tfIdUsuario.setEnabled(false);
		tfIdUsuario.setColumns(10);
		
		JLabel lblIdusuario = new JLabel("IdUsuario:");
		lblIdusuario.setBounds(97, 14, 64, 14);
		dados.add(lblIdusuario);
		
		JLabel lblPerfil = new JLabel("Perfil*:");
		lblPerfil.setBounds(366, 151, 46, 14);
		dados.add(lblPerfil);
		
			
		tpRedigite = new JPasswordField();
		tpRedigite.setEnabled(false);
		tpRedigite.setBounds(165, 204, 134, 20);
		dados.add(tpRedigite);
		
		JLabel label_4 = new JLabel("Redigite a Senha:*");
		label_4.setBounds(53, 207, 108, 14);
		dados.add(label_4);
		principal.setLayout(gl_principal);
	}
	
	public void habilitaCampos(String acao){
		
		if(acao == "novo"){
		//Habilita os campos
		tfIdUsuario.setEnabled(true);
		tfNome.setEnabled(true);
		tfApelido.setEnabled(true);
		tfEmail.setEnabled(true);
		tfIdade.setEnabled(true);
		tfAltura.setEnabled(true);
		tpSenha.setEnabled(true);
		tpRedigite.setEnabled(true);
		}
		else if(acao == "alterar"){
			
			tfNome.setEnabled(true);
			tfApelido.setEnabled(true);
			tfEmail.setEnabled(true);
			tfIdade.setEnabled(true);
			tfAltura.setEnabled(true);
			
		}
						
		
	}
	
	public void desabilitaCampos(){
		
		//Desabilita os campos
		tfIdUsuario.setEnabled(false);
		tfNome.setEnabled(false);
		tfApelido.setEnabled(false);
		tfEmail.setEnabled(false);
		tfIdade.setEnabled(false);
		tfAltura.setEnabled(false);
		tpSenha.setEnabled(false);
		tpRedigite.setEnabled(false);
		
	}
	
	public void limpaCampos(){
		
		tfIdUsuario.setText("");
		tfNome.setText("");
		tfApelido.setText("");
		tfEmail.setText("");
		tfIdade.setText("");
		tfAltura.setText("");
		tpSenha.setText("");
		tpRedigite.setText("");
				
	}
	
	public void pesquisar(String object, String pesquisa){
		
		
		try{
			JOptionPane.showMessageDialog(null, object);
		if(object == "IdUsuario"){
			
			JOptionPane.showMessageDialog(null, "if");
			usuario = fachada.usuarioProcurar(Integer.parseInt(pesquisa));
			
			tfIdUsuario.setText(Integer.toString(usuario.getIdUsuario()));
			tfNome.setText(usuario.getNome());
			tfApelido.setText(usuario.getApelido());
			tfEmail.setText(usuario.getEmail());
			tfIdade.setText(Integer.toString(usuario.getIdade()));
			tfAltura.setText("");
			tpSenha.setText(usuario.getSenha());
			tpRedigite.setText(usuario.getSenha());
					
			//colocar o retorno do Sexo e do Perfil
			
		}
		}catch (UsuarioNaoEncontradoException e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
		}
		
	}
	
	public void salvarRegistro(String acao){
		try{
			
			// Tratamento de Sexo e Perfil de Usuário
			
			/****************************************/
			if(cAcao == "novo"){
				
							
					
				// Cria a instância de usuario
				usuario = new Usuario(Integer.parseInt(tfIdUsuario.getText()), tfNome.getText(), tfApelido.getText(), iPerfil, tfEmail.getText(), "Senha", iSexo , Integer.parseInt(tfAltura.getText()) , Integer.parseInt(tfIdade.getText()), 0);
				
				fachada.usuarioCadastrar(usuario);
				JOptionPane.showMessageDialog(null, "Usuário Cadastrado Com sucesso!");
			}
			else if(cAcao == "alterar"){
				
						
				usuario = fachada.usuarioProcurar(Integer.parseInt(tfIdUsuario.getText()));
				
				//JOptionPane.showMessageDialog(null, usuario.getNome() + " " + usuario.getAltura());
				
				usuario.setIdUsuario(Integer.parseInt(tfIdUsuario.getText()));				
				usuario.setNome(tfNome.getText());
				usuario.setApelido(tfApelido.getText());
				usuario.setEmail(tfEmail.getText());
				usuario.setIdade(Integer.parseInt(tfIdade.getText()));
				usuario.setAltura(Integer.parseInt(tfAltura.getText()));
				//usuario.setSenha(apelido);
				usuario.setTipo(1);
				usuario.setSexo(1);
								
						
				fachada.usuarioAtualizar(usuario);
				JOptionPane.showMessageDialog(null,"Usuário atualizado com sucesso");
				
			}
			
			desabilitaCampos();
			
			
		}catch (UsuarioJaCadastradoException e){
			JOptionPane.showMessageDialog(null,e.getMessage());
			
		}catch (UsuarioNaoEncontradoException e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
		}catch(DadosInvalidosException e){
			JOptionPane.showMessageDialog(null,e.getMessage());
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
		}
	}
}
