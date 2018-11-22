package visão;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class SenhaPerdida extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SenhaPerdida frame = new SenhaPerdida();
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
	public SenhaPerdida() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEsqueciMinhaSenha = new JLabel("Esqueci Minha Senha");
		lblEsqueciMinhaSenha.setForeground(Color.GRAY);
		lblEsqueciMinhaSenha.setFont(new Font("Arial", Font.PLAIN, 16));
		lblEsqueciMinhaSenha.setBounds(32, 11, 170, 34);
		contentPane.add(lblEsqueciMinhaSenha);
		
		JRadioButton radioButtonRE = new JRadioButton("R.E.");
		radioButtonRE.setBackground(Color.WHITE);
		radioButtonRE.setForeground(Color.GRAY);
		radioButtonRE.setFont(new Font("Arial", Font.PLAIN, 10));
		radioButtonRE.setSelected(true);
		radioButtonRE.setBounds(102, 124, 109, 23);
		contentPane.add(radioButtonRE);
		
		JRadioButton radioButtonCPF = new JRadioButton("CPF");
		radioButtonCPF.setForeground(Color.GRAY);
		radioButtonCPF.setFont(new Font("Arial", Font.PLAIN, 10));
		radioButtonCPF.setBackground(Color.WHITE);
		radioButtonCPF.setBounds(213, 124, 109, 23);
		contentPane.add(radioButtonCPF);
		
		JButton buttonEnviar = new JButton("ENVIAR");
		buttonEnviar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if ( radioButtonCPF.isSelected() && radioButtonRE.isSelected() )
				{
					JOptionPane.showMessageDialog(null, "Seleciona apenas uma opção!", "Atenção", JOptionPane.ERROR_MESSAGE);
				}
				else if ( radioButtonCPF.isSelected() )
				{
					// Buscar por CPF
				}
				else
				{
					// Buscar por RE
				}
			}
		});
		buttonEnviar.setBackground(Color.DARK_GRAY);
		buttonEnviar.setForeground(Color.WHITE);
		buttonEnviar.setFont(new Font("Arial", Font.PLAIN, 14));
		buttonEnviar.setBounds(183, 239, 91, 23);
		contentPane.add(buttonEnviar);
		
	}
}
