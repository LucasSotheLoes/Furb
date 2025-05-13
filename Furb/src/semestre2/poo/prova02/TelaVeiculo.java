package semestre2.poo.prova02;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class TelaVeiculo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldPaca;
	private JTextField textFieldKm;
	private JTextField textFieldValorDiaria;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVeiculo frame = new TelaVeiculo(null, null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param pessoa 
	 * @param l 
	 */
	public TelaVeiculo(Pessoa pessoa, Locacao l) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelPlaca = new JLabel("Placa:");
		labelPlaca.setBounds(46, 64, 72, 14);
		contentPane.add(labelPlaca);
		
		textFieldPaca = new JTextField();
		textFieldPaca.setColumns(10);
		textFieldPaca.setBounds(128, 61, 251, 20);
		contentPane.add(textFieldPaca);
		
		JLabel labelKm = new JLabel("Km:");
		labelKm.setBounds(46, 88, 46, 14);
		contentPane.add(labelKm);
		
		textFieldKm = new JTextField();
		textFieldKm.setColumns(10);
		textFieldKm.setBounds(128, 85, 251, 20);
		contentPane.add(textFieldKm);
		
		JLabel labelValorDiria = new JLabel("Valor diária:");
		labelValorDiria.setBounds(46, 113, 72, 14);
		contentPane.add(labelValorDiria);
		
		textFieldValorDiaria = new JTextField();
		textFieldValorDiaria.setColumns(10);
		textFieldValorDiaria.setBounds(128, 110, 251, 20);
		contentPane.add(textFieldValorDiaria);
		
		JLabel labelCategoria = new JLabel("Categoria:");
		labelCategoria.setBounds(46, 138, 72, 14);
		contentPane.add(labelCategoria);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(Categoria.values()));
		comboBox.setBounds(128, 141, 251, 22);
		contentPane.add(comboBox);
		
		JButton botaoConfirmar = new JButton("Confirmar");
		botaoConfirmar.setBounds(46, 201, 89, 23);
		contentPane.add(botaoConfirmar);
		
		JButton botaoCancelar = new JButton("Cancelar");
		botaoCancelar.setBounds(151, 201, 89, 23);
		contentPane.add(botaoCancelar);
		
		JButton botaoGerarRelatorio = new JButton("Gerar relatório");
		botaoGerarRelatorio.setBounds(301, 201, 123, 23);
		contentPane.add(botaoGerarRelatorio);
		
		JLabel labelVeiculo = new JLabel("Veiculo");
		labelVeiculo.setBounds(25, 11, 46, 14);
		contentPane.add(labelVeiculo);
		botaoConfirmar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Veiculo v = new Veiculo();
				v.setPlaca(textFieldPaca.getText());
				v.setKm(Integer.parseInt(textFieldKm.getText()));
				v.setPrecoDiaria(Double.parseDouble(textFieldValorDiaria.getText()));
				Categoria c = (Categoria) comboBox.getSelectedItem();
				v.setCategoria(c);
				pessoa.setVeiculo(v);
				if(v.getCategoria() == null) {
					throw new IllegalArgumentException("Informe a categoria do veiculo");
				} else if(v.getKm() == 0) {
					throw new IllegalArgumentException("Informe os Kms do veiculo");
				} else if(v.getPlaca() == null) {
					throw new IllegalArgumentException("Informe a placa do veiculo");
				} else if(v.getPrecoDiaria() <= 0) {
					throw new IllegalArgumentException("Informe o preco da diaria do veiculo");
				}
				if(pessoa.isFisica()) {
					LocacaoPessoaFisica lf = new LocacaoPessoaFisica();
					lf.setVeiculo(v);
					dispose();
				} else {
					LocacaoPessoaJuridica lj = new LocacaoPessoaJuridica();
					lj.incluirVeiculo(v);
					dispose();
				}
			}	
	});
		botaoCancelar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}	
	});
		
		
	}
}
