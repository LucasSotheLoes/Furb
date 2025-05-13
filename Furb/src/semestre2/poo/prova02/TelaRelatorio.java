package semestre2.poo.prova02;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class TelaRelatorio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaRelatorio frame = new TelaRelatorio(null,null,null,null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param l 
	 * @param veiculo 
	 * @param p 
	 */
	public TelaRelatorio(Veiculo veiculo, LocacaoPessoaFisica lf, LocacaoPessoaJuridica lj, Pessoa p) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel superLabel = new JLabel("o");
		superLabel.setVerticalAlignment(SwingConstants.TOP);
		superLabel.setBounds(10, 11, 414, 239);
		contentPane.add(superLabel);
		if(p.isFisica()) {
			superLabel.setText(lf.imprimir() + "\n" + veiculo.imprimir());
		} else {
			superLabel.setText(veiculo.imprimir() + "\n" + lj.imprimir());
		}
	}

}
