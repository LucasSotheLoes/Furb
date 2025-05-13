package semestre2.poo.unidade05.exercicio1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Nome extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Nome frame = new Nome();
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
	public Nome() {
		Ponto ponto = new Ponto();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 290, 322);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		JCheckBox CheckBox = new JCheckBox("No 1º quadrante");
		CheckBox.setEnabled(false);
		CheckBox.setBounds(33, 158, 179, 23);
		contentPane.add(CheckBox);
		
		
		JCheckBox CheckBox1 = new JCheckBox("No 2º quadrante");
		CheckBox1.setEnabled(false);
		CheckBox1.setBounds(33, 184, 179, 23);
		contentPane.add(CheckBox1);
		
		JCheckBox CheckBox2 = new JCheckBox("Incide sobre o Eixo Y");
		CheckBox2.setEnabled(false);
		CheckBox2.setBounds(33, 131, 179, 23);
		contentPane.add(CheckBox2);
		
		JCheckBox CheckBox3 = new JCheckBox("Incide sobre o Eixo X");
		CheckBox3.setEnabled(false);
		CheckBox3.setBounds(33, 107, 179, 23);
		contentPane.add(CheckBox3);
		
		JCheckBox CheckBox4 = new JCheckBox("No 3º quadrante");
		CheckBox4.setEnabled(false);
		CheckBox4.setBounds(33, 210, 179, 23);
		contentPane.add(CheckBox4);
		
		JCheckBox CheckBox5 = new JCheckBox("No 4º quadrante");
		CheckBox5.setEnabled(false);
		CheckBox5.setBounds(33, 237, 179, 23);
		contentPane.add(CheckBox5);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(68, 59, 86, 20);
		contentPane.add(textField_1);
		
		textField = new JTextField();
		textField.setBounds(68, 28, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel Eixox = new JLabel("Eixo X:");
		Eixox.setBounds(20, 28, 46, 14);
		contentPane.add(Eixox);
		
		JLabel EixoY = new JLabel("Eixo Y:");
		EixoY.setBounds(20, 61, 46, 14);
		contentPane.add(EixoY);
		
		JButton botaoAvaliar = new JButton("Avaliar");
		botaoAvaliar.setBounds(176, 40, 89, 23);
		contentPane.add(botaoAvaliar);
		botaoAvaliar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(textField_1.getText());
				int y = Integer.parseInt(textField.getText());
				ponto.setX(x);
				ponto.setY(y);
			
					CheckBox3.setSelected(ponto.estaIncidindoSobreX());
					CheckBox2.setSelected(ponto.estaIncidindoSobreY());
					CheckBox.setSelected(ponto.identificarQuadrante() == Quadrante.PRIMEIRO);
					CheckBox1.setSelected(ponto.identificarQuadrante() == Quadrante.SEGUNDO);
					CheckBox4.setSelected(ponto.identificarQuadrante() == Quadrante.TERCEIRO);
					CheckBox5.setSelected(ponto.identificarQuadrante() == Quadrante.QUARTO);
				}
			
		});
	}
}
