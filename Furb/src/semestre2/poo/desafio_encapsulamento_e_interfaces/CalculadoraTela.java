package semestre2.poo.desafio_encapsulamento_e_interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

public class CalculadoraTela extends JFrame {

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
					CalculadoraTela frame = new CalculadoraTela();
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
	public CalculadoraTela() {
		String n1,n2;
		Principal principal = new Principal();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 303, 419);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton botao0 = new JButton("0");
		botao0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText() == null) 
					textField.setText("0");
				else
					textField.setText(textField.getText() + "0");
			}
		});
		botao0.setBounds(80, 325, 60, 40);
		contentPane.add(botao0);
		
		JButton botao1 = new JButton("1");
		botao1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText() == null) 
					textField.setText("1");
				else
					textField.setText(textField.getText() + "1");
			}
		});
		botao1.setBounds(150, 274, 60, 40);
		contentPane.add(botao1);
		
		JButton botao2 = new JButton("2");
		botao2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText() == null) 
					textField.setText("2");
				else
					textField.setText(textField.getText() + "2");
			}
		});
		botao2.setBounds(80, 274, 60, 40);
		contentPane.add(botao2);
		
		JButton botao3 = new JButton("3");
		botao3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText() == null) 
					textField.setText("3");
				else
					textField.setText(textField.getText() + "3");
			}
		});
		botao3.setBounds(10, 274, 60, 40);
		contentPane.add(botao3);
		
		JButton botao4 = new JButton("4");
		botao4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText() == null) 
					textField.setText("4");
				else
					textField.setText(textField.getText() + "4");
			}
		});
		botao4.setBounds(10, 223, 60, 40);
		contentPane.add(botao4);
		
		JButton botao5 = new JButton("5");
		botao5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText() == null) 
					textField.setText("5");
				else
					textField.setText(textField.getText() + "5");
			}
		});
		botao5.setBounds(80, 223, 60, 40);
		contentPane.add(botao5);
		
		JButton botao6 = new JButton("6");
		botao6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText() == null) 
					textField.setText("6");
				else
					textField.setText(textField.getText() + "6");
			}
		});
		botao6.setBounds(150, 223, 60, 40);
		contentPane.add(botao6);
		
		JButton botao7 = new JButton("7");
		botao7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText() == null) 
					textField.setText("7");
				else
					textField.setText(textField.getText() + "7");
			}
		});
		botao7.setBounds(10, 172, 60, 40);
		contentPane.add(botao7);
		
		JButton botao8 = new JButton("8");
		botao8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText() == null) 
					textField.setText("8");
				else
					textField.setText(textField.getText() + "8");
			}
		});
		botao8.setBounds(80, 172, 60, 40);
		contentPane.add(botao8);
		
		JButton botao9 = new JButton("9");
		botao9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText() == null) 
					textField.setText("9");
				else
					textField.setText(textField.getText() + "9");
			}
		});
		botao9.setBounds(150, 172, 60, 40);
		contentPane.add(botao9);
		
		JButton botaoPonto = new JButton(".");
		botaoPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText() == null) 
					textField.setText("0.");
				else
					textField.setText(textField.getText() + ".");
			}
		});
		botaoPonto.setBounds(10, 325, 60, 40);
		contentPane.add(botaoPonto);
		
		JButton botaoMultiplicar = new JButton("*");
		botaoMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(principal.getN1() == 0)
					principal.setN1(Double.parseDouble(textField.getText()));
				else
					principal.setN2(Double.parseDouble(textField.getText()));
				principal.setOperacao('*');
				textField.setText("");
			}
		});
		botaoMultiplicar.setBounds(150, 325, 60, 40);
		contentPane.add(botaoMultiplicar);
		
		JButton botaoIgual = new JButton("=");
		botaoIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(principal.getN1() == 0)
					principal.setN1(Double.parseDouble(textField.getText()));
				else
					principal.setN2(Double.parseDouble(textField.getText()));
				double resultado = 0;
		        
		        switch (principal.getOperacao()) {
		            case '*':
		                resultado = principal.multiplicar(principal.getN1(), principal.getN2());
		                break;
		            case '/':
		                resultado = principal.dividir(principal.getN1(), principal.getN2());
		                break;
		            case '+':
		                resultado = principal.somar(principal.getN1(), principal.getN2());
		                break;
		            case '-':
		                resultado = principal.subtrair(principal.getN1(), principal.getN2());
		                break;
		        }
				
		        textField.setText(String.valueOf(resultado));
			}
		});
		botaoIgual.setBounds(220, 325, 60, 40);
		contentPane.add(botaoIgual);
		
		JButton botaoDividir = new JButton("/");
		botaoDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(principal.getN1() == 0)
					principal.setN1(Double.parseDouble(textField.getText()));
				else
					principal.setN2(Double.parseDouble(textField.getText()));
				principal.setOperacao('/');
				textField.setText("");
			}
		});
		botaoDividir.setBounds(220, 274, 60, 40);
		contentPane.add(botaoDividir);
		
		JButton botaoMenos = new JButton("-");
		botaoMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(principal.getN1() == 0)
					principal.setN1(Double.parseDouble(textField.getText()));
				else
					principal.setN2(Double.parseDouble(textField.getText()));
				principal.setOperacao('-');
				textField.setText("");
			}
		});
		botaoMenos.setBounds(220, 223, 60, 40);
		contentPane.add(botaoMenos);
		
		JButton botaoMais = new JButton("+");
		botaoMais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(principal.getN1() == 0)
					principal.setN1(Double.parseDouble(textField.getText()));
				else
					principal.setN2(Double.parseDouble(textField.getText()));
				principal.setOperacao('+');
				textField.setText("");
			}
		});
		botaoMais.setBounds(220, 172, 60, 40);
		contentPane.add(botaoMais);
		
		JButton botaoC = new JButton("C");
		botaoC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					textField.setText(" ");
					principal.setN1(0);
					principal.setN2(0);
					principal.setOperacao(' ');
			}
		});
		botaoC.setBounds(10, 123, 60, 40);
		contentPane.add(botaoC);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.BOLD, 36));
		textField.setBounds(0, 0, 287, 112);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
