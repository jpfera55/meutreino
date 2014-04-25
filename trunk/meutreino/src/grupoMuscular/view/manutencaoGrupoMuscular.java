package grupoMuscular.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class manutencaoGrupoMuscular extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					manutencaoGrupoMuscular frame = new manutencaoGrupoMuscular();
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
	public manutencaoGrupoMuscular() {
		setTitle("Incluir Grupo Muscular");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 233);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 11, 414, 113);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JCheckBox chckbxBceps = new JCheckBox("B\u00EDceps");
		chckbxBceps.setBounds(19, 7, 97, 23);
		panel.add(chckbxBceps);
		
		JCheckBox chckbxTrceps = new JCheckBox("Tr\u00EDceps");
		chckbxTrceps.setBounds(170, 7, 97, 23);
		panel.add(chckbxTrceps);
		
		JCheckBox chckbxPeitoral = new JCheckBox("Peitoral");
		chckbxPeitoral.setBounds(311, 7, 97, 23);
		panel.add(chckbxPeitoral);
		
		JCheckBox chckbxOmbro = new JCheckBox("Ombro");
		chckbxOmbro.setBounds(19, 34, 97, 23);
		panel.add(chckbxOmbro);
		
		JCheckBox chckbxTrapzio = new JCheckBox("Trap\u00E9zio");
		chckbxTrapzio.setBounds(170, 33, 97, 23);
		panel.add(chckbxTrapzio);
		
		JCheckBox chckbxDorsal = new JCheckBox("Dorsal");
		chckbxDorsal.setBounds(311, 33, 97, 23);
		panel.add(chckbxDorsal);
		
		JCheckBox chckbxPerna = new JCheckBox("Perna");
		chckbxPerna.setBounds(19, 60, 97, 23);
		panel.add(chckbxPerna);
		
		JCheckBox chckbxPanturrilha = new JCheckBox("Panturrilha");
		chckbxPanturrilha.setBounds(170, 60, 97, 23);
		panel.add(chckbxPanturrilha);
		
		JCheckBox chckbxAntebrao = new JCheckBox("Antebra\u00E7o");
		chckbxAntebrao.setBounds(311, 60, 97, 23);
		panel.add(chckbxAntebrao);
		
		JCheckBox chckbxAbdmem = new JCheckBox("Abd\u00F4mem");
		chckbxAbdmem.setBounds(19, 86, 97, 23);
		panel.add(chckbxAbdmem);
		
		JCheckBox chckbxGlteos = new JCheckBox("Gl\u00FAteos");
		chckbxGlteos.setBounds(170, 86, 97, 23);
		panel.add(chckbxGlteos);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(10, 135, 414, 49);
		contentPane.add(panel_1);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(10, 11, 89, 23);
		panel_1.add(btnOk);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(109, 11, 89, 23);
		panel_1.add(btnCancelar);
	}
}
