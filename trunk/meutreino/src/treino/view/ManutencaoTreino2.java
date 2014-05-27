package treino.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JToolBar;
import javax.swing.JSplitPane;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextPane;

import java.awt.Point;
import java.awt.Component;

import javax.swing.JDesktopPane;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

import fachada.Fachada;
import treino.model.Treino;

public class ManutencaoTreino2 extends JFrame {

	private JPanel contentPane;
	private JTextField tfData;
	private JTextField tfIntensidade;
	private JTextField tfDuracao;
	private JTable table;
	private JTextField textField_4;
	private JTextField tfTreino;
	private JTextField tfIdUsuario;
	private JTextField tfMusc1;
	private JTextField tfMusc2;

	private String cAcao = "";
	Treino treino;
	Fachada fachada = Fachada.getInstance();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManutencaoTreino2 frame = new ManutencaoTreino2();
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
	public ManutencaoTreino2() {
		setTitle("Manuten\u00E7\u00E3o Treino");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setToolTipText("Conta");
		panel_1.setBounds(10, 11, 664, 390);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		table = new JTable();
		table.setBounds(115, 332, 475, -32);
		panel_1.add(table);
		
		JButton button = new JButton("<<");
		button.setBounds(10, 32, 56, 23);
		panel_1.add(button);
		
		JButton button_1 = new JButton("<");
		button_1.setBounds(71, 32, 56, 23);
		panel_1.add(button_1);
		
		JButton button_2 = new JButton(">");
		button_2.setBounds(137, 32, 56, 23);
		panel_1.add(button_2);
		
		JButton button_3 = new JButton(">>");
		button_3.setBounds(199, 32, 56, 23);
		panel_1.add(button_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(316, 33, 77, 20);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Data"}));
		panel_1.add(comboBox);
		
		textField_4 = new JTextField();
		textField_4.setBounds(399, 33, 168, 20);
		textField_4.setColumns(10);
		panel_1.add(textField_4);
		
		JButton button_4 = new JButton("Pesquisar");
		button_4.setBounds(577, 32, 87, 23);
		panel_1.add(button_4);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 64, 654, 279);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel);
		
		tfTreino = new JTextField();
		tfTreino.setEnabled(false);
		tfTreino.setBounds(279, 11, 86, 20);
		tfTreino.setColumns(10);
		
		JLabel lblIdtreino = new JLabel("IdTreino:");
		lblIdtreino.setBounds(215, 14, 46, 14);
		
		tfData = new JTextField();
		tfData.setEnabled(false);
		tfData.setBounds(279, 67, 86, 20);
		tfData.setColumns(10);
		
		JLabel lblNome = new JLabel("Data:*");
		lblNome.setBounds(231, 70, 39, 14);
		
		JLabel lblEmail = new JLabel("Intensidade:*");
		lblEmail.setBounds(196, 98, 73, 14);
		
		tfIntensidade = new JTextField();
		tfIntensidade.setEnabled(false);
		tfIntensidade.setBounds(279, 95, 86, 20);
		tfIntensidade.setColumns(10);
		
		
		
		JLabel lblIdade = new JLabel("Dura\u00E7\u00E3o:*");
		lblIdade.setBounds(216, 126, 65, 14);
		
		tfDuracao = new JTextField();
		tfDuracao.setEnabled(false);
		tfDuracao.setBounds(279, 123, 86, 20);
		tfDuracao.setColumns(10);
		
		JLabel lblIdusuario = new JLabel("IdUsuario:*");
		lblIdusuario.setBounds(206, 42, 69, 14);
		
		tfIdUsuario = new JTextField();
		tfIdUsuario.setEnabled(false);
		tfIdUsuario.setBounds(279, 39, 86, 20);
		tfIdUsuario.setColumns(10);
		
		JLabel lblMusculo = new JLabel("Grupo Muscular 1:");
		lblMusculo.setBounds(74, 196, 87, 14);
		
		tfMusc1 = new JTextField();
		tfMusc1.setEnabled(false);
		tfMusc1.setBounds(171, 193, 86, 20);
		tfMusc1.setColumns(10);
		
		JLabel lblMusculo_1 = new JLabel("Grupo Muscular 2:");
		lblMusculo_1.setBounds(333, 196, 87, 14);
		
		tfMusc2 = new JTextField();
		tfMusc2.setEnabled(false);
		tfMusc2.setBounds(438, 193, 86, 20);
		tfMusc2.setColumns(10);
		panel.setLayout(null);
		panel.add(lblIdtreino);
		panel.add(tfTreino);
		panel.add(lblIdusuario);
		panel.add(tfIdUsuario);
		panel.add(lblMusculo_1);
		panel.add(lblMusculo);
		panel.add(lblNome);
		panel.add(tfData);
		panel.add(lblEmail);
		panel.add(tfIntensidade);
		panel.add(tfMusc2);
		panel.add(tfMusc1);
		panel.add(lblIdade);
		panel.add(tfDuracao);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(74, 160, 514, 2);
		panel.add(separator);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 684, 21);
		panel_1.add(menuBar);
		
		JMenu mnUsurio = new JMenu("Usu\u00E1rio");
		menuBar.add(mnUsurio);
		
		JMenuItem mntmPerfil = new JMenuItem("Perfil");
		mnUsurio.add(mntmPerfil);
		
		JMenu mnManuteno = new JMenu("Manuten\u00E7\u00E3o");
		menuBar.add(mnManuteno);
		
		JMenuItem mntmUsurio = new JMenuItem("Usu\u00E1rio");
		mntmUsurio.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, InputEvent.CTRL_MASK));
		mnManuteno.add(mntmUsurio);
		
		JMenuItem mntmAvaliao = new JMenuItem("Avalia\u00E7\u00E3o");
		mntmAvaliao.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK));
		mnManuteno.add(mntmAvaliao);
		
		JMenuItem mntmTreino = new JMenuItem("Treino");
		mntmTreino.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.CTRL_MASK));
		mnManuteno.add(mntmTreino);
		
		JMenuItem mntmNvel = new JMenuItem("N\u00EDvel");
		mntmNvel.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
		mnManuteno.add(mntmNvel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(10, 354, 648, 47);
		panel_1.add(panel_2);
		
		JButton button_7 = new JButton("Alterar");
		
		JButton button_5 = new JButton("Excluir");
		
		JButton button_6 = new JButton("Cancelar");
		
	
		JButton btnAdicionar = new JButton("Salvar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
						
				salvarRegistro(cAcao);		
			}
		});
		
		JButton btnSair = new JButton("Sair");
		
		JButton btnNovo = new JButton("Novo");
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			    limpaCampos();
				
				cAcao = "novo";
				
				habilitaCampos(cAcao);
				
			}
		});
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_2.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(btnNovo)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
					.addGap(7)
					.addComponent(btnAdicionar, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addGap(56)
					.addComponent(btnSair)
					.addGap(19))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
								.addComponent(button_7)
								.addComponent(btnNovo))
							.addComponent(button_5)
							.addComponent(button_6)
							.addComponent(btnAdicionar))
						.addComponent(btnSair))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_2.linkSize(SwingConstants.HORIZONTAL, new Component[] {button_7, btnNovo});
		gl_panel_2.linkSize(SwingConstants.HORIZONTAL, new Component[] {btnAdicionar, btnSair});
		panel_2.setLayout(gl_panel_2);
		

	}
	
public void habilitaCampos(String acao){
		
		if(acao == "novo"){
		//Habilita os campos
		tfIdUsuario.setEnabled(true);
		tfData.setEnabled(true);
		tfDuracao.setEnabled(true);
		tfIntensidade.setEnabled(true);
		tfMusc1.setEnabled(true);
		tfMusc2.setEnabled(true);
		
		}
		else if(acao == "alterar"){
			
			tfIdUsuario.setEnabled(true);
			tfData.setEnabled(true);
			tfDuracao.setEnabled(true);
			tfIntensidade.setEnabled(true);
			tfMusc1.setEnabled(true);
			tfMusc2.setEnabled(true);
			
		}
						
		
	}
	
	public void desabilitaCampos(){
		
		//Desabilita os campos
		tfIdUsuario.setEnabled(false);
		tfData.setEnabled(false);
		tfDuracao.setEnabled(false);
		tfIntensidade.setEnabled(false);
		tfMusc1.setEnabled(false);
		tfMusc2.setEnabled(false);
		
	}
	
	public void limpaCampos(){
		
		tfTreino.setText("");
		tfIdUsuario.setText("");
		tfData.setText("");
		tfDuracao.setText("");
		tfIntensidade.setText("");
		tfMusc1.setText("");
		tfMusc2.setText("");
		
		
				
	}
	
	public void salvarRegistro(String acao){
		try{
			
					
			if(cAcao == "novo"){
			    // int idUsuario,String data, String intensidade, int pontuacao,  int duracao, String grup1, String grup2){			
				// Cria a instância de trieno
				treino = new Treino(Integer.parseInt(tfIdUsuario.getText()), tfData.getText(), tfIntensidade.getText(), 0,  Integer.parseInt(tfDuracao.getText()), tfMusc1.getText(), tfMusc2.getText());
				
				fachada.treinoCadastrar(treino);
				JOptionPane.showMessageDialog(null, "Treino Cadastrado Com sucesso!");
			}
			/*else if(cAcao == "alterar"){
				
						
				treino = fachada.treinoProcurar(Integer.parseInt(tfIdUsuario.getText()));
				
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
				
			}*/
			
			desabilitaCampos();
			
			
		/*}catch (TreinoJaCadastradoException e){
			JOptionPane.showMessageDialog(null,e.getMessage());
			
		}catch (UsuarioNaoEncontradoException e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
		}catch(DadosInvalidosException e){
			JOptionPane.showMessageDialog(null,e.getMessage());*/
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
		}
	}
	
	
}
