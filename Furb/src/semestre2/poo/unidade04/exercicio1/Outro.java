package semestre2.poo.unidade04.exercicio1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Outro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Outro frame = new Outro();
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
	public Outro() {
		Retangulo retangulo = new Retangulo();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 468, 179);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel Altura = new JLabel("Altura: ");
		Altura.setBounds(35, 50, 63, 14);
		contentPane.add(Altura);
		
		JLabel Comprimento = new JLabel("Comprimento: ");
		Comprimento.setBounds(35, 82, 95, 14);
		contentPane.add(Comprimento);
		
		
		JLabel lblArea = new JLabel("Area: ");
		lblArea.setBounds(348, 28, 94, 14);
		contentPane.add(lblArea);
		
		JLabel lblPerimetro = new JLabel("Perimetro: ");
		lblPerimetro.setBounds(348, 50, 101, 14);
		contentPane.add(lblPerimetro);
		
		JButton botaoCalcular = new JButton("Calcular");
		botaoCalcular.setBounds(228, 46, 89, 23);
		contentPane.add(botaoCalcular);
		botaoCalcular.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int comprimento = Integer.parseInt(textField2.getText());
				int altura = Integer.parseInt(textField.getText());
				retangulo.setAltura(altura);
				retangulo.setComprimento(comprimento);
				lblArea.setText("Area: " + retangulo.calcularArea());
				lblPerimetro.setText("Perimetro: " + retangulo.calcularPerimetro());
			}
		});
		
		JButton botaoLimpar = new JButton("Limpar");
		botaoLimpar.setBounds(228, 78, 89, 23);
		contentPane.add(botaoLimpar);
		botaoLimpar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText("0");
				textField2.setText("0");
				lblArea.setText("Area: " + 0);
				lblPerimetro.setText("Perimetro: " + 0);
			}
		});
		
		textField = new JTextField();
		textField.setBounds(118, 47, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setColumns(10);
		textField2.setBounds(118, 79, 86, 20);
		contentPane.add(textField2);
		
		
	}

}
