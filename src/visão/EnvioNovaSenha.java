package visão;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;

public class EnvioNovaSenha extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EnvioNovaSenha frame = new EnvioNovaSenha();
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
	public EnvioNovaSenha() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 497, 260);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(EnvioNovaSenha.class.getResource("/src_images/logo.png")));
		lblNewLabel.setBounds(154, 24, 176, 41);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enviamos para o endere\u00E7o de e-mail uma mensagem com as intru\u00E7\u00F5es para redefini\u00E7\u00E3o da senha.\r\n");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 10));
		lblNewLabel_1.setBounds(10, 81, 486, 24);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(EnvioNovaSenha.class.getResource("/src_images/imagemOk.png")));
		lblNewLabel_2.setBounds(222, 116, 32, 24);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Verifique se a mensagem n\u00E3o foi para no lixo eletr\u00F4nico ou caixa de Spam.\r\n");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 10));
		lblNewLabel_3.setBounds(64, 151, 364, 24);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Caso n\u00E3o tenha recebido o e-mail, entre em contato com o administrador.");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 10));
		lblNewLabel_4.setBounds(64, 172, 351, 14);
		contentPane.add(lblNewLabel_4);
	}

}
