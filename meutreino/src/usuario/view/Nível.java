package usuario.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class Nível extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Nível frame = new Nível();
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
	public Nível() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNvel = new JLabel("N\u00EDvel");
		lblNvel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNvel.setBounds(180, 11, 46, 14);
		panel.add(lblNvel);
		
		JLabel lblFaixaInicial = new JLabel("Faixa inicial:");
		lblFaixaInicial.setBounds(102, 68, 68, 14);
		panel.add(lblFaixaInicial);
		
		JLabel lblFaixaFinal = new JLabel("Faixa final:");
		lblFaixaFinal.setBounds(102, 119, 68, 14);
		panel.add(lblFaixaFinal);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o:");
		lblDescrio.setBounds(100, 163, 58, 14);
		panel.add(lblDescrio);
		
		textField = new JTextField();
		textField.setBounds(197, 160, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(197, 116, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(197, 65, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
	}

}
