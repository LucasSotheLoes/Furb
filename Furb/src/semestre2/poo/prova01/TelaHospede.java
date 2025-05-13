//Lucas Söthe Loes
package semestre2.poo.prova01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaHospede extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldDiasHospedados;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaHospede frame = new TelaHospede();
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
	public TelaHospede() {
		Estadia estadia = new Estadia(null, 0);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldDiasHospedados = new JTextField();
		textFieldDiasHospedados.setColumns(10);
		textFieldDiasHospedados.setBounds(47, 117, 347, 20);
		contentPane.add(textFieldDiasHospedados);
		
		JLabel lblNewLabel = new JLabel("Qual temporada estamos?");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(47, 11, 347, 20);
		contentPane.add(lblNewLabel);
		
		JLabel labelFrase2 = new JLabel("Quantos dias voce ficará hospedado?");
		labelFrase2.setHorizontalAlignment(SwingConstants.CENTER);
		labelFrase2.setBounds(47, 92, 338, 14);
		contentPane.add(labelFrase2);
		
		JLabel labelPrecoEstadia = new JLabel("");
		labelPrecoEstadia.setHorizontalAlignment(SwingConstants.CENTER);
		labelPrecoEstadia.setBounds(48, 212, 338, 14);
		contentPane.add(labelPrecoEstadia);
		
		/**
		 * 
		 * @return retorna a uma label o valor total da estadia do hospede 
		 */
		JButton botaoCalcular = new JButton("Calcular custo");
		botaoCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				estadia.setQuantidadeDias(Integer.parseInt(textFieldDiasHospedados.getText()));
				labelPrecoEstadia.setText("O preço a pagar será de: "+ estadia.precoPagar()); 
			}
		});
		botaoCalcular.setBounds(127, 171, 151, 23);
		contentPane.add(botaoCalcular);
		
		JButton botaoBaixa = new JButton("Baixa");
		botaoBaixa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				estadia.setPeriodo(Periodo.BAIXA_TEMPORADA);
			}
		});
		botaoBaixa.setBounds(47, 42, 89, 23);
		contentPane.add(botaoBaixa);
		
		JButton botaoMedia = new JButton("Média");
		botaoMedia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				estadia.setPeriodo(Periodo.MEDIA_TEMPORADA);
			}
		});
		botaoMedia.setBounds(170, 42, 89, 23);
		contentPane.add(botaoMedia);
		
		JButton botaoAlta = new JButton("Alta");
		botaoAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				estadia.setPeriodo(Periodo.ALTA_TEMPORADA);
			}
		});
		botaoAlta.setBounds(296, 42, 89, 23);
		contentPane.add(botaoAlta);
	}
}
