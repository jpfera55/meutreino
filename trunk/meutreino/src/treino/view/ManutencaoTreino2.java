package treino.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.JButton;
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

public class ManutencaoTreino2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
	private JTable table_1;
	private JTextField textField_4;
	private JTextField textField_5;

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
		
		JLabel lblNome = new JLabel("Data:*");
		lblNome.setBounds(122, 122, 39, 14);
		panel_1.add(lblNome);
		
		
		
		JLabel lblApelido = new JLabel("Pontua\u00E7\u00E3o:*");
		lblApelido.setBounds(100, 150, 71, 14);
		panel_1.add(lblApelido);
		
		
		
		JLabel lblIdade = new JLabel("Dura\u00E7\u00E3o:*");
		lblIdade.setBounds(417, 150, 71, 14);
		panel_1.add(lblIdade);
		
	
		JButton btnAdicionar = new JButton("Salvar");
		btnAdicionar.setBounds(574, 378, 89, 23);
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel_1.add(btnAdicionar);
		
		JLabel lblEmail = new JLabel("Intensidade:*");
		lblEmail.setBounds(398, 122, 73, 14);
		panel_1.add(lblEmail);
		
		textField = new JTextField();
		textField.setBounds(181, 119, 86, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(181, 147, 86, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(481, 119, 86, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(481, 147, 86, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
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
		panel.setBounds(10, 58, 654, 53);
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(171, 11, 86, 20);
		panel.add(textField_5);
		
		JLabel lblIdtreino = new JLabel("IdTreino:");
		lblIdtreino.setBounds(115, 14, 46, 14);
		panel.add(lblIdtreino);
		
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
		
		JButton button_5 = new JButton("Excluir");
		button_5.setBounds(383, 378, 87, 23);
		panel_1.add(button_5);
		
		JButton button_6 = new JButton("Cancelar");
		button_6.setBounds(480, 378, 87, 23);
		panel_1.add(button_6);
		
		JButton button_7 = new JButton("Alterar");
		button_7.setBounds(286, 378, 87, 23);
		panel_1.add(button_7);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 200, 664, 167);
		panel_2.setToolTipText("");
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		table_1 = new JTable();
		table_1.setBounds(19, 9, 626, 113);
		panel_2.add(table_1);
		table_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_1.setToolTipText("Grupo Muscular\r\n");
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"id", "Nome"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		
		JButton btnIncluir = new JButton("Incluir");
		btnIncluir.setBounds(19, 133, 89, 23);
		panel_2.add(btnIncluir);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.setBounds(116, 133, 89, 23);
		panel_2.add(btnRemover);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(215, 133, 89, 23);
		panel_2.add(btnAlterar);
		
		JLabel lblGrupoMuscular = new JLabel("Grupo Muscular");
		lblGrupoMuscular.setBounds(20, 184, 120, 14);
		lblGrupoMuscular.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_1.add(lblGrupoMuscular);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(551);
		

	}
}
