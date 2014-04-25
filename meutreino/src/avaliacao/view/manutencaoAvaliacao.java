package avaliacao.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.DefaultComboBoxModel;

public class manutencaoAvaliacao extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					manutencaoAvaliacao frame = new manutencaoAvaliacao();
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
	public manutencaoAvaliacao() {
		setTitle("Manuten\u00E7\u00E3o Avalia\u00E7\u00E3o");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 450);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnPerfil = new JMenu("Perfil");
		menuBar.add(mnPerfil);
		
		JMenuItem mntmUsurio = new JMenuItem("Usu\u00E1rio");
		mntmUsurio.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, InputEvent.CTRL_MASK));
		mnPerfil.add(mntmUsurio);
		
		JMenu mnManuteno = new JMenu("Manuten\u00E7\u00E3o");
		menuBar.add(mnManuteno);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(panel, BorderLayout.CENTER);
		
		JButton button = new JButton("Pesquisar");
		button.setBounds(577, 11, 87, 23);
		panel.add(button);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(10, 45, 654, 53);
		panel.add(panel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(187, 14, 86, 20);
		panel_1.add(textField_1);
		
		JLabel lblDataAvaliao = new JLabel("Data Avalia\u00E7\u00E3o:*");
		lblDataAvaliao.setBounds(82, 17, 95, 14);
		panel_1.add(lblDataAvaliao);
		
		JButton button_1 = new JButton("<<");
		button_1.setBounds(10, 11, 56, 23);
		panel.add(button_1);
		
		JButton button_2 = new JButton(">");
		button_2.setBounds(137, 11, 56, 23);
		panel.add(button_2);
		
		JButton button_3 = new JButton(">>");
		button_3.setBounds(199, 11, 56, 23);
		panel.add(button_3);
		
		JButton button_4 = new JButton("<");
		button_4.setBounds(71, 11, 56, 23);
		panel.add(button_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Data"}));
		comboBox.setBounds(316, 12, 77, 20);
		panel.add(comboBox);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(399, 12, 168, 20);
		panel.add(textField_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(10, 102, 654, 206);
		panel.add(panel_2);
		
		JLabel lblPesoAtual = new JLabel("Peso Atual*");
		lblPesoAtual.setBounds(84, 92, 97, 14);
		panel_2.add(lblPesoAtual);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(182, 89, 86, 20);
		panel_2.add(textField_5);
		
		JLabel lblGorduraAtual = new JLabel("Gordura Atual:*");
		lblGorduraAtual.setBounds(301, 92, 80, 14);
		panel_2.add(lblGorduraAtual);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(391, 89, 86, 20);
		panel_2.add(textField_6);
		
		JLabel label_5 = new JLabel("%");
		label_5.setBounds(487, 92, 17, 14);
		panel_2.add(label_5);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(10, 319, 654, 51);
		panel.add(panel_3);
		
		JButton button_5 = new JButton("Alterar");
		button_5.setBounds(10, 11, 87, 23);
		panel_3.add(button_5);
		
		JButton button_6 = new JButton("Excluir");
		button_6.setBounds(107, 11, 87, 23);
		panel_3.add(button_6);
		
		JButton button_7 = new JButton("Cancelar");
		button_7.setBounds(204, 11, 87, 23);
		panel_3.add(button_7);
		
		JButton button_8 = new JButton("Salvar");
		button_8.setBounds(301, 11, 87, 23);
		panel_3.add(button_8);
	}

}
