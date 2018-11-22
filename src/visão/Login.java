package visão;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controle.BancoDados;
import controle.BancoMySQL;
import modelo.Funcionario;

@SuppressWarnings("serial")
public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtFieldLogin;
	private JPasswordField txtFieldSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("Login - SIG_V");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setToolTipText("LOGO");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/src_images/logo.png")));
		lblNewLabel.setBounds(131, 36, 172, 65);
		contentPane.add(lblNewLabel);

		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setFont(new Font("Arial", Font.PLAIN, 13));
		lblLogin.setBounds(37, 128, 46, 21);
		contentPane.add(lblLogin);

		txtFieldLogin = new JTextField();
		txtFieldLogin.setFont(new Font("Arial", Font.PLAIN, 13));
		txtFieldLogin.setBounds(93, 129, 260, 20);
		contentPane.add(txtFieldLogin);
		txtFieldLogin.setColumns(10);

		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 13));
		lblSenha.setBounds(37, 160, 46, 21);
		contentPane.add(lblSenha);

		txtFieldSenha = new JPasswordField();
		txtFieldSenha.setFont(new Font("Arial", Font.PLAIN, 13));
		txtFieldSenha.setColumns(10);
		txtFieldSenha.setBounds(93, 160, 260, 20);
		contentPane.add(txtFieldSenha);

		JLabel lblNewLabel_1 = new JLabel("Esqueci minha senha?");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				SenhaPerdida sp = new SenhaPerdida();
				sp.setVisible(true);

			}
		});
		lblNewLabel_1.setForeground(Color.GRAY);
		lblNewLabel_1.setToolTipText("Clique aqui se esqueceu a senha");
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(63, 192, 155, 14);
		contentPane.add(lblNewLabel_1);

		JButton btnLogin = new JButton("Login");
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				/*
				 * BancoDados conexao = new BancoMySQL(); if ( conexao.abrirConexao() ) {
				 * 
				 * } else { dispose(); }
				 * 
				 * conexao.fazerLogin( txtFieldLogin.getText() , txtFieldSenha.getText() );
				 * conexao.fecharConexao();
				 */
				BancoDados conexao = new BancoMySQL( true );

				// Retorna verdade se Login Correto
				// UPDATE
				// Retorno um objeto Funcionario e, caso não seja NULO, houve sucesso ao buscar
				
				char[] senha = txtFieldSenha.getPassword();
				
				/*
				System.out.println( senha ); 						// Retorna charset 
				System.out.println(senha.toString());				// Retorna endereço na memória com a senha
				System.out.println( (String) senha.toString() );	// Idem ao de cima
				System.out.println(String.valueOf(senha));			// Retorna o valor do charset -> em String
				*/
				
				Funcionario f = conexao.fazerLogin( txtFieldLogin.getText(), /*senha.toString()*/ String.valueOf( senha ) );
				
				System.out.println(f);
				
				if ( f != null )
				{
					//System.out.println(f);
					
					Sistema sistema = new Sistema( f );
					
					sistema.setVisible( true );
					
					/*
					 * CaixaInfo ci = new CaixaInfo( "Pronto" , 1 , "Login feito com sucesso! " + txtFieldLogin.getText() );
					 *
					// ;;
					//ci.getDefaultCloseOperation(); // Nada
					ci.setDefaultCloseOperation( DISPOSE_ON_CLOSE );
					*/
					
				}

				senha = null;

				dispose(); // Fecha a tela de LOGIN
				
				conexao.fecharConexao();
			}
		});
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setBackground(Color.DARK_GRAY);
		btnLogin.setFont(new Font("Arial", Font.PLAIN, 13));
		btnLogin.setBounds(173, 217, 91, 23);
		contentPane.add(btnLogin);
	}
}
