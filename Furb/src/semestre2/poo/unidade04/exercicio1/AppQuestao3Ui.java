package semestre2.poo.unidade04.exercicio1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class AppQuestao3Ui extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Insira a altura: "));
		int comprimento = Integer.parseInt(JOptionPane.showInputDialog("Insira o comprimento: "));
		Retangulo retangulo = new Retangulo(altura,comprimento);
		JOptionPane.showMessageDialog(null,"A altura é igual a: " + retangulo.getAltura() + "\n O comprimento é igual a: "  + retangulo.getComprimento());
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppQuestao3Ui frame = new AppQuestao3Ui();
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
	public AppQuestao3Ui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}


}
