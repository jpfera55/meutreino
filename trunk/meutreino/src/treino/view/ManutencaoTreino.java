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

public class ManutencaoTreino extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManutencaoTreino frame = new ManutencaoTreino();
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
	public ManutencaoTreino() {
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
		lblNome.setBounds(126, 61, 39, 14);
		panel_1.add(lblNome);
		
		
		
		JLabel lblApelido = new JLabel("Pontua\u00E7\u00E3o:*");
		lblApelido.setBounds(104, 108, 71, 14);
		panel_1.add(lblApelido);
		
		
		
		JLabel lblIdade = new JLabel("Dura\u00E7\u00E3o:*");
		lblIdade.setBounds(421, 108, 71, 14);
		panel_1.add(lblIdade);
		
		JLabel lblSexo = new JLabel("Nome:*");
		lblSexo.setBounds(229, 265, 39, 14);
		panel_1.add(lblSexo);
		
	
		JButton btnAdicionar = new JButton("Salvar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAdicionar.setBounds(216, 378, 89, 23);
		panel_1.add(btnAdicionar);
		
		JLabel lblEmail = new JLabel("Intensidade:*");
		lblEmail.setBounds(402, 61, 73, 14);
		panel_1.add(lblEmail);
		
		JLabel lblNewLabel = new JLabel("TREINO");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(304, 11, 46, 14);
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(183, 58, 86, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(183, 105, 86, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(485, 58, 86, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(485, 105, 86, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(88, 187, 502, 2);
		panel_1.add(separator);
		
		JLabel lblGrupoMuscular = new JLabel("GRUPO MUSCULAR");
		lblGrupoMuscular.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGrupoMuscular.setBounds(276, 200, 139, 14);
		panel_1.add(lblGrupoMuscular);
		
		textField_4 = new JTextField();
		textField_4.setBounds(293, 262, 139, 20);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		

	}
}
