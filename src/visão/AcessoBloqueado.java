package visão;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Window.Type;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;

public class AcessoBloqueado extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AcessoBloqueado frame = new AcessoBloqueado();
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
	public AcessoBloqueado() {
		setType(Type.POPUP);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 332, 170);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Acesso bloqueado por excesso de tentativas!");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 10));
		lblNewLabel.setBounds(61, 59, 216, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Entre em contato com o administrador.");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 10));
		lblNewLabel_1.setBounds(71, 84, 190, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(AcessoBloqueado.class.getResource("/src_images/imagemX.png")));
		lblNewLabel_2.setBounds(154, 21, 23, 27);
		contentPane.add(lblNewLabel_2);
	}
}
