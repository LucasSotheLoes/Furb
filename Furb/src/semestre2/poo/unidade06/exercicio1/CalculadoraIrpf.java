package semestre2.poo.unidade06.exercicio1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CalculadoraIrpf extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraIrpf frame = new CalculadoraIrpf();
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
	public CalculadoraIrpf() {
		double salario = 0;
		String nome = "Lucas";
		Funcionario funcionario = new Funcionario(nome,salario);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 307, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelSalario = new JLabel("Salário:");
		labelSalario.setBounds(35, 71, 46, 14);
		contentPane.add(labelSalario);
		
		textField = new JTextField();
		textField.setBounds(91, 68, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel labelFaixa = new JLabel("oiiiiiiiiii");
		labelFaixa.setBounds(35, 130, 246, 14);
		contentPane.add(labelFaixa);
		
		JLabel labelImposto = new JLabel("oiiiiiiiiii");
		labelImposto.setBounds(35, 156, 246, 14);
		contentPane.add(labelImposto);
		
		JButton botaoAvaliar = new JButton("Avaliar");
		botaoAvaliar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				funcionario.setSalario(Double.parseDouble(textField.getText()));
				labelFaixa.setText("O salário está na " + funcionario.identificarFaixaIrpf() + " faixa");
				labelImposto.setText("O Imposto a pagar é de: R$ " + funcionario.calcularIrpf());
				}
		});
		botaoAvaliar.setBounds(35, 96, 89, 23);
		contentPane.add(botaoAvaliar);
	}
}
