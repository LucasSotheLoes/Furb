package semestre2.poo.unidade07.exercicio1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Tela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldArea;
	private JTextField textFieldEndereco;
	private JTextField textFieldBairroNome;
	private JTextField textFieldCoeficiente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
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
	public Tela() {
		Bairro bairro = new Bairro();
		Imovel imovel = new Imovel();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 438, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelImovel = new JLabel("Imóvel");
		labelImovel.setBounds(10, 0, 46, 14);
		contentPane.add(labelImovel);
		
		JLabel labelBairro = new JLabel("Bairro");
		labelBairro.setBounds(10, 134, 46, 14);
		contentPane.add(labelBairro);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 11, 391, 124);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textFieldEndereco = new JTextField();
		textFieldEndereco.setBounds(86, 34, 266, 20);
		panel.add(textFieldEndereco);
		textFieldEndereco.setColumns(10);
		
		JLabel labelEndereco = new JLabel("Endereço:");
		labelEndereco.setBounds(10, 37, 66, 14);
		panel.add(labelEndereco);
		
		JLabel labelArea = new JLabel("Área:");
		labelArea.setBounds(10, 62, 46, 14);
		panel.add(labelArea);
		
		textFieldArea = new JTextField();
		textFieldArea.setBounds(57, 59, 68, 20);
		panel.add(textFieldArea);
		textFieldArea.setColumns(10);
		
		JLabel labelFinalidade = new JLabel("Finalidade:");
		labelFinalidade.setBounds(10, 98, 56, 14);
		panel.add(labelFinalidade);
		
		JRadioButton botaoResidencial = new JRadioButton("Residencial");
		botaoResidencial.setBounds(107, 94, 84, 23);
		panel.add(botaoResidencial);
		
		JRadioButton botaoComercial = new JRadioButton("Comercial");
		botaoComercial.setBounds(193, 94, 84, 23);
		panel.add(botaoComercial);
		
		JRadioButton botaoIndustrial = new JRadioButton("Industrial");
		botaoIndustrial.setBounds(279, 94, 84, 23);
		panel.add(botaoIndustrial);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(10, 146, 391, 109);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel labelNomeBairro = new JLabel("Nome:");
		labelNomeBairro.setBounds(10, 30, 55, 14);
		panel_1.add(labelNomeBairro);
		
		textFieldBairroNome = new JTextField();
		textFieldBairroNome.setBounds(81, 27, 286, 20);
		panel_1.add(textFieldBairroNome);
		textFieldBairroNome.setColumns(10);
		
		JLabel lblCoeficiente = new JLabel("Coeficiente:");
		lblCoeficiente.setBounds(10, 55, 90, 14);
		panel_1.add(lblCoeficiente);
		
		textFieldCoeficiente = new JTextField();
		textFieldCoeficiente.setBounds(110, 52, 86, 20);
		panel_1.add(textFieldCoeficiente);
		textFieldCoeficiente.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(10, 266, 391, 132);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel labelValorIptu = new JLabel("Moinnnnnnnnnn");
		labelValorIptu.setBounds(20, 64, 318, 14);
		panel_2.add(labelValorIptu);
		
		JButton botaoCalcularIptu = new JButton("Calcular");
		botaoCalcularIptu.setBounds(20, 30, 89, 23);
		panel_2.add(botaoCalcularIptu);
		botaoCalcularIptu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double coeficiente = Double.parseDouble(textFieldCoeficiente.getText());
				imovel.setArea(Integer.parseInt(textFieldArea.getText()));
				bairro.setCoeficienteIptu(coeficiente);
				labelValorIptu.setText("O valor o do iptu é de "  + imovel.calcularIptu() * bairro.getCoeficienteIptu());
				}
		});
		botaoIndustrial.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				imovel.setFinalidade(Finalidade.INDUSTRIAL);
				}
		});
		botaoComercial.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				imovel.setFinalidade(Finalidade.COMERCIAL);
				}
		});
		botaoResidencial.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				imovel.setFinalidade(Finalidade.RESIDENCIAL);
				}
		});
	}
}
