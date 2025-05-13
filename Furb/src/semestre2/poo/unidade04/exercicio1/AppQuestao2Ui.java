package semestre2.poo.unidade04.exercicio1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class AppQuestao2Ui extends JFrame {
	public AppQuestao2Ui() {
	}

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Retangulo retangulo = new Retangulo();
		retangulo.setAltura(Integer.parseInt(JOptionPane.showInputDialog("Insira a altura: ")));
		retangulo.setComprimento(Integer.parseInt(JOptionPane.showInputDialog("Insira o comprimento: ")));
		JOptionPane.showMessageDialog(null,"A altura é igual a: " + retangulo.getAltura() + "\n O comprimento é igual a: "  + retangulo.getComprimento());
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppQuestao2Ui frame = new AppQuestao2Ui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

//	/**
//	 * Create the frame.
//	 */
//	public AppQuestao2Ui() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 450, 300);
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//
//		setContentPane(contentPane);
//	}

}
