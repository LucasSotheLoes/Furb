package semestre2.poo.prova02;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class TelaLocacao extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldCpfCnpj;
	private JTextField textFieldNome;
	private JTextField textFieldTelefone;
	private JTextField textFieldEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLocacao frame = new TelaLocacao();
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
	public TelaLocacao() {
		Pessoa p = new Pessoa();
		LocacaoPessoaFisica lf = new LocacaoPessoaFisica();
		LocacaoPessoaJuridica lj = new LocacaoPessoaJuridica();
		lf.setPessoa(p);
		lj.setPessoa(p);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 506);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label1 = new JLabel("Quantidade de diárias:");
		label1.setBounds(37, 34, 184, 14);
		contentPane.add(label1);
		
		JLabel lblNewLabel = new JLabel("Pessoa");
		lblNewLabel.setBounds(37, 77, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel labelCpfcnpj = new JLabel("CPF/CNPJ:");
		labelCpfcnpj.setBounds(49, 115, 72, 14);
		contentPane.add(labelCpfcnpj);
		
		JLabel labelNome = new JLabel("Nome:");
		labelNome.setBounds(49, 139, 46, 14);
		contentPane.add(labelNome);
		
		JLabel labelTelefone = new JLabel("Telefone:");
		labelTelefone.setBounds(49, 164, 46, 14);
		contentPane.add(labelTelefone);
		
		JLabel labelEmail = new JLabel("e-mail:");
		labelEmail.setBounds(49, 192, 46, 14);
		contentPane.add(labelEmail);
		
		JLabel labelTipo = new JLabel("Tipo:");
		labelTipo.setBounds(49, 217, 46, 14);
		contentPane.add(labelTipo);
		
		textFieldCpfCnpj = new JTextField();
		textFieldCpfCnpj.setBounds(131, 112, 251, 20);
		contentPane.add(textFieldCpfCnpj);
		textFieldCpfCnpj.setColumns(10);
		
		textFieldNome = new JTextField();
		textFieldNome.setColumns(10);
		textFieldNome.setBounds(131, 136, 251, 20);
		contentPane.add(textFieldNome);
		
		textFieldTelefone = new JTextField();
		textFieldTelefone.setColumns(10);
		textFieldTelefone.setBounds(131, 161, 251, 20);
		contentPane.add(textFieldTelefone);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(131, 189, 251, 20);
		contentPane.add(textFieldEmail);
		
		JRadioButton botaoPessoaJuridica = new JRadioButton("Jurídica");
		botaoPessoaJuridica.setBounds(273, 213, 109, 23);
		contentPane.add(botaoPessoaJuridica);
		botaoPessoaJuridica.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				p.setFisica(false);
				}
		});
		
		JRadioButton botaoPessoaFisica = new JRadioButton("Física");
		botaoPessoaFisica.setBounds(131, 213, 120, 23);
		contentPane.add(botaoPessoaFisica);
		botaoPessoaFisica.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				p.setFisica(true);
				}
		});
		
		JButton botaoIncluirVeculo = new JButton("Incluir Veículo");
		botaoIncluirVeculo.setBounds(37, 281, 114, 23);
		contentPane.add(botaoIncluirVeculo);
		botaoIncluirVeculo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(p.getNome() == null) {
					throw new IllegalArgumentException("Informe o nome da pessoa");
				} else if(p.getCpfCnpj() == null) {
					throw new IllegalArgumentException("Informe o cpf/cnpj da pessoa");
				} else if(p.getEmail() == null) {
					throw new IllegalArgumentException("Informe o email da pessoa");
				} else if(p.getTelefone() == null) {
					throw new IllegalArgumentException("Informe o telefone da pessoa");
				} 
				if(p.isFisica() && p.getTelefone() == null) {
					TelaVeiculo t = new TelaVeiculo(p, lf);
					t.setVisible(true);
				} else if(!p.isFisica()){
					TelaVeiculo t = new TelaVeiculo(p, lj);
					t.setVisible(true);
				} else 
					throw new IllegalArgumentException("Uma pessoa fisica só pode alugar 1 veiculos por vez");
				
			}
		});
		
		JButton botaoGerarRelatrio = new JButton("Gerar relatório");
		botaoGerarRelatrio.setBounds(268, 281, 114, 23);
		contentPane.add(botaoGerarRelatrio);
		botaoGerarRelatrio.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				p.setNome(textFieldNome.getText());
				p.setEmail(textFieldEmail.getText());
				p.setCpfCnpj(textFieldCpfCnpj.getText());
				p.setTelefone(textFieldTelefone.getText());
				if(p.isFisica() ) {
					TelaRelatorio r = new TelaRelatorio(p.getVeiculo(),lf,null,p);
					r.setVisible(true);
				} else {
				TelaRelatorio r = new TelaRelatorio(p.getVeiculo(),null,lj,p);
				r.setVisible(true);
				}
				}
		});
		ButtonGroup b = new ButtonGroup();
		b.add(botaoPessoaFisica);
		b.add(botaoPessoaJuridica);
	}
}
