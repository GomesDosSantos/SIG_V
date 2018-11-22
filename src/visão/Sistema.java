package visão;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.AbstractAction;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controle.BancoDados;
import controle.BancoMySQL;
import modelo.Cliente;
import modelo.Endereco;
import modelo.Estoque;
import modelo.Funcionario;
import modelo.Produto;

public class Sistema extends JFrame {

	private static Funcionario usuario;
	
	private JPanel contentPane;
	private JTextField txtNomeEmpresaCadastro;
	private JTextField txtEnderecoCadastro;
	private JTextField txtDataCadastro;
	private JTextField txtDataManutencaoCadastro;
	private JTextField txtComplementoCadastro;
	private JTextField txtNumeroCadastro;
	private JTextField txtBairroCadastro;
	private JTextField txtCNPJCadastro;
	private JTextField txtInscricaoEstadualCadastro;
	private JTextField txtTelefone1Cadastro;
	private JTextField txtTelefone2Cadastro;
	private JTextField txtFaxCadastro;
	private JTextField txtEmailCadastro;
	private JTextField vendasNomeEmpresa;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JPanel panel_3;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable estoqueListaProdutos;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sistema frame = new Sistema( usuario );
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
	public Sistema( Funcionario usuario ) {
		
		Sistema.usuario = usuario;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 771, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 755, 387);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Cadastro", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Empresa");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 11, 51, 14);
		panel.add(lblNewLabel);
		
		txtNomeEmpresaCadastro = new JTextField();
		txtNomeEmpresaCadastro.setBounds(10, 26, 483, 20);
		panel.add(txtNomeEmpresaCadastro);
		txtNomeEmpresaCadastro.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Endereço");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 48, 54, 14);
		panel.add(lblNewLabel_1);
		
		txtEnderecoCadastro = new JTextField();
		txtEnderecoCadastro.setBounds(10, 64, 483, 20);
		panel.add(txtEnderecoCadastro);
		txtEnderecoCadastro.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Data de Cadastro");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2.setBounds(503, 11, 98, 14);
		panel.add(lblNewLabel_2);
		
		txtDataCadastro = new JTextField();
		txtDataCadastro.setBounds(503, 26, 146, 20);
		panel.add(txtDataCadastro);
		txtDataCadastro.setColumns(10);
		
		txtDataManutencaoCadastro = new JTextField();
		txtDataManutencaoCadastro.setBounds(503, 64, 146, 20);
		panel.add(txtDataManutencaoCadastro);
		txtDataManutencaoCadastro.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Data de Manutenção");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_3.setBounds(503, 48, 116, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Observações");
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_4.setBounds(503, 97, 76, 14);
		panel.add(lblNewLabel_4);
		
		JTextPane txtObservacoesCadastro = new JTextPane();
		txtObservacoesCadastro.setFont(new Font("Arial", Font.PLAIN, 12));
		txtObservacoesCadastro.setBounds(502, 122, 238, 130);
		panel.add(txtObservacoesCadastro);
		
		JLabel lblNewLabel_5 = new JLabel("Complemento");
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_5.setBounds(10, 97, 79, 14);
		panel.add(lblNewLabel_5);
		
		txtComplementoCadastro = new JTextField();
		txtComplementoCadastro.setBounds(10, 112, 187, 20);
		panel.add(txtComplementoCadastro);
		txtComplementoCadastro.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Número");
		lblNewLabel_6.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_6.setBounds(202, 95, 46, 14);
		panel.add(lblNewLabel_6);
		
		txtNumeroCadastro = new JTextField();
		txtNumeroCadastro.setBounds(202, 112, 104, 20);
		panel.add(txtNumeroCadastro);
		txtNumeroCadastro.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Bairro");
		lblNewLabel_7.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_7.setBounds(310, 95, 35, 14);
		panel.add(lblNewLabel_7);
		
		txtBairroCadastro = new JTextField();
		txtBairroCadastro.setBounds(310, 112, 183, 20);
		panel.add(txtBairroCadastro);
		txtBairroCadastro.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("CNPJ");
		lblNewLabel_8.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_8.setBounds(10, 134, 46, 14);
		panel.add(lblNewLabel_8);
		
		txtCNPJCadastro = new JTextField();
		txtCNPJCadastro.setBounds(10, 149, 187, 20);
		panel.add(txtCNPJCadastro);
		txtCNPJCadastro.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Inscrição Estadual");
		lblNewLabel_9.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_9.setBounds(202, 135, 116, 14);
		panel.add(lblNewLabel_9);
		
		txtInscricaoEstadualCadastro = new JTextField();
		txtInscricaoEstadualCadastro.setBounds(202, 149, 217, 20);
		panel.add(txtInscricaoEstadualCadastro);
		txtInscricaoEstadualCadastro.setColumns(10);
		
		JCheckBox checkBoxAtivoCadastro = new JCheckBox("Ativo");
		checkBoxAtivoCadastro.setFont(new Font("Arial", Font.BOLD, 12));
		checkBoxAtivoCadastro.setBounds(425, 147, 68, 23);
		panel.add(checkBoxAtivoCadastro);
		
		JLabel lblNewLabel_10 = new JLabel("Fone1");
		lblNewLabel_10.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_10.setBounds(10, 170, 46, 14);
		panel.add(lblNewLabel_10);
		
		txtTelefone1Cadastro = new JTextField();
		txtTelefone1Cadastro.setBounds(10, 184, 187, 20);
		panel.add(txtTelefone1Cadastro);
		txtTelefone1Cadastro.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Fone2");
		lblNewLabel_11.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_11.setBounds(202, 171, 46, 14);
		panel.add(lblNewLabel_11);
		
		txtTelefone2Cadastro = new JTextField();
		txtTelefone2Cadastro.setBounds(202, 184, 146, 20);
		panel.add(txtTelefone2Cadastro);
		txtTelefone2Cadastro.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Fax");
		lblNewLabel_12.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_12.setBounds(352, 171, 46, 14);
		panel.add(lblNewLabel_12);
		
		txtFaxCadastro = new JTextField();
		txtFaxCadastro.setBounds(352, 184, 141, 20);
		panel.add(txtFaxCadastro);
		txtFaxCadastro.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Email");
		lblNewLabel_13.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_13.setBounds(10, 206, 46, 14);
		panel.add(lblNewLabel_13);
		
		txtEmailCadastro = new JTextField();
		txtEmailCadastro.setBounds(10, 221, 483, 20);
		panel.add(txtEmailCadastro);
		txtEmailCadastro.setColumns(10);
		
		JButton btnSalvarCadastro = new JButton("Salvar");
		btnSalvarCadastro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				// Clique no botão SALVAR
				// Manda para o manipulador do Banco de Dados
				// Salva no Banco de Dados
				
				Endereco endereco = new Endereco( Integer.parseInt( txtNumeroCadastro.getText() ) , txtEnderecoCadastro.getText() , 
						txtBairroCadastro.getText() , "SJC - SEM CIDADE" , "SP" , txtNumeroCadastro.getText() , txtComplementoCadastro.getText() );
				
				Cliente cliente = new Cliente( 1 , txtNomeEmpresaCadastro.getText() , txtCNPJCadastro.getText() , endereco );
				
				
				BancoDados conexao = new BancoMySQL( true );
				
				if ( conexao.gravarCliente( cliente ) )
					System.out.println("OK");
				else
					System.out.println("?");
				
				conexao.fecharConexao();
				
				// Limpar cadastro
				
				
				
			}
		});
		btnSalvarCadastro.setFont(new Font("Arial", Font.BOLD, 12));
		btnSalvarCadastro.setBounds(10, 252, 98, 34);
		panel.add(btnSalvarCadastro);
		
		JButton btnCancelarCadastro = new JButton("Cancelar");
		btnCancelarCadastro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				// Clique no botão CANCELAR
				// Apaga tudo?
				
				
			}
		});
		btnCancelarCadastro.setFont(new Font("Arial", Font.BOLD, 12));
		btnCancelarCadastro.setBounds(118, 252, 92, 34);
		panel.add(btnCancelarCadastro);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Vendas", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_14 = new JLabel("Empresa");
		lblNewLabel_14.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_14.setBounds(10, 11, 51, 14);
		panel_1.add(lblNewLabel_14);
		
		JTextField vendasCNPJ = new JTextField();
		vendasCNPJ.setBounds(10, 72, 188, 20);
		panel_1.add(vendasCNPJ);
		
		vendasNomeEmpresa = new JTextField();
		vendasNomeEmpresa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// ENTER, faz busca rápida no banco de dados
				// e procura por alguma empresa com aquele nome
				
				BancoDados conexao = new BancoMySQL(true);
				
				conexao.executarBusca( "SELECT * FROM cliente WHERE cliente_nome LIKE '%" + vendasNomeEmpresa.getText() + "'" );
				
				/*
				if ( conexao.quantidadeRetorno() == -1 ) // Falhou
				{
					;
				}
				else // Achou alguma correspondência, então
				{
					
					vendasCNPJ.setText( conexao.buscarCampo( "cliente_CNPJ" ) );
					
				}
				*/
				
				vendasCNPJ.setText( conexao.buscarCampo( "cliente_CNPJ" ) );
				
				conexao.fecharConexao();
				
			}
		});
		vendasNomeEmpresa.setBounds(10, 26, 423, 20);
		panel_1.add(vendasNomeEmpresa);
		vendasNomeEmpresa.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Data do Pedido");
		lblNewLabel_15.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_15.setBounds(437, 12, 85, 14);
		panel_1.add(lblNewLabel_15);
		
		textField_14 = new JTextField();
		textField_14.setBounds(437, 26, 138, 20);
		panel_1.add(textField_14);
		textField_14.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("Status do Pedido");
		lblNewLabel_16.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_16.setBounds(579, 12, 96, 14);
		panel_1.add(lblNewLabel_16);
		
		textField_15 = new JTextField();
		textField_15.setBounds(579, 26, 161, 20);
		panel_1.add(textField_15);
		textField_15.setColumns(10);
		
		JLabel lblNewLabel_17 = new JLabel("Últimos Pedidos\r\n");
		lblNewLabel_17.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_17.setBounds(437, 57, 96, 14);
		panel_1.add(lblNewLabel_17);
		
		List list = new List();
		list.setBounds(437, 72, 303, 183);
		panel_1.add(list);
		
		JLabel lblNewLabel_18 = new JLabel("CNPJ");
		lblNewLabel_18.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_18.setBounds(10, 57, 46, 14);
		panel_1.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("Inscrição Estadual");
		lblNewLabel_19.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_19.setBounds(208, 57, 114, 14);
		panel_1.add(lblNewLabel_19);
		
		JComboBox<String> vendasInscricaoEstadual = new JComboBox<String>();
		vendasInscricaoEstadual.setBounds(208, 72, 225, 20);
		panel_1.add(vendasInscricaoEstadual);
		
		JLabel lblNewLabel_20 = new JLabel("Produto");
		lblNewLabel_20.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_20.setBounds(10, 96, 46, 14);
		panel_1.add(lblNewLabel_20);
		
		JComboBox<String> comboBox_2 = new JComboBox<String>();
		comboBox_2.setBounds(10, 112, 128, 20);
		panel_1.add(comboBox_2);
		
		JLabel lblNewLabel_21 = new JLabel("Quantidade");
		lblNewLabel_21.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_21.setBounds(141, 97, 70, 14);
		panel_1.add(lblNewLabel_21);
		
		textField_16 = new JTextField();
		textField_16.setBounds(141, 112, 128, 20);
		panel_1.add(textField_16);
		textField_16.setColumns(10);
		
		JLabel lblNewLabel_22 = new JLabel("Valor Total");
		lblNewLabel_22.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_22.setBounds(278, 97, 114, 14);
		panel_1.add(lblNewLabel_22);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(279, 112, 154, 20);
		panel_1.add(textField_17);
		
		JLabel lblNewLabel_23 = new JLabel("Observações");
		lblNewLabel_23.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_23.setBounds(10, 138, 85, 14);
		panel_1.add(lblNewLabel_23);
		
		List list_1 = new List();
		list_1.setBounds(10, 153, 423, 102);
		panel_1.add(list_1);
		
		JButton btnNewButton_2 = new JButton("Salvar\r\n");
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 13));
		btnNewButton_2.setBounds(54, 293, 107, 39);
		panel_1.add(btnNewButton_2);
		
		JButton btnCancelar = new JButton("Cancelar\r\n");
		btnCancelar.setFont(new Font("Arial", Font.BOLD, 12));
		btnCancelar.setBounds(166, 293, 114, 39);
		panel_1.add(btnCancelar);
		
		JButton btnAnterior_1 = new JButton("Anterior");
		btnAnterior_1.setFont(new Font("Arial", Font.BOLD, 12));
		btnAnterior_1.setBounds(319, 293, 114, 39);
		panel_1.add(btnAnterior_1);
		
		JButton btnPrximo_1 = new JButton("Próximo");
		btnPrximo_1.setFont(new Font("Arial", Font.BOLD, 12));
		btnPrximo_1.setBounds(437, 293, 114, 39);
		panel_1.add(btnPrximo_1);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Fornecedores", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_24 = new JLabel("Nome");
		lblNewLabel_24.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_24.setBounds(10, 11, 46, 14);
		panel_2.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("Logradouro");
		lblNewLabel_25.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_25.setBounds(371, 12, 76, 14);
		panel_2.add(lblNewLabel_25);
		
		textField_18 = new JTextField();
		textField_18.setBounds(371, 29, 369, 20);
		panel_2.add(textField_18);
		textField_18.setColumns(10);
		
		JLabel lblNewLabel_26 = new JLabel("Contato");
		lblNewLabel_26.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_26.setBounds(10, 54, 46, 14);
		panel_2.add(lblNewLabel_26);
		
		textField_19 = new JTextField();
		textField_19.setBounds(10, 73, 175, 20);
		panel_2.add(textField_19);
		textField_19.setColumns(10);
		
		JLabel lblNewLabel_27 = new JLabel("CNPJ");
		lblNewLabel_27.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_27.setBounds(192, 54, 46, 14);
		panel_2.add(lblNewLabel_27);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(192, 73, 175, 20);
		panel_2.add(textField_20);
		
		JLabel lblNmero = new JLabel("Numero\r\n");
		lblNmero.setFont(new Font("Arial", Font.BOLD, 12));
		lblNmero.setBounds(371, 54, 46, 14);
		panel_2.add(lblNmero);
		
		JLabel lblComplemento = new JLabel("Complemento");
		lblComplemento.setFont(new Font("Arial", Font.BOLD, 12));
		lblComplemento.setBounds(463, 54, 86, 14);
		panel_2.add(lblComplemento);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(371, 73, 86, 20);
		panel_2.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(463, 73, 277, 20);
		panel_2.add(textField_22);
		
		JLabel lblTelefones = new JLabel("Telefone(s)");
		lblTelefones.setFont(new Font("Arial", Font.BOLD, 12));
		lblTelefones.setBounds(10, 98, 86, 14);
		panel_2.add(lblTelefones);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(10, 117, 357, 20);
		panel_2.add(textField_23);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setFont(new Font("Arial", Font.BOLD, 12));
		lblBairro.setBounds(371, 98, 46, 14);
		panel_2.add(lblBairro);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setFont(new Font("Arial", Font.BOLD, 12));
		lblCep.setBounds(595, 98, 46, 14);
		panel_2.add(lblCep);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(371, 117, 221, 20);
		panel_2.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(595, 117, 145, 20);
		panel_2.add(textField_25);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Arial", Font.BOLD, 12));
		lblEmail.setBounds(10, 143, 46, 14);
		panel_2.add(lblEmail);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(10, 159, 357, 20);
		panel_2.add(textField_26);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setFont(new Font("Arial", Font.BOLD, 12));
		lblCidade.setBounds(371, 143, 46, 14);
		panel_2.add(lblCidade);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(371, 159, 318, 20);
		panel_2.add(textField_27);
		
		JLabel lblUf = new JLabel("UF");
		lblUf.setFont(new Font("Arial", Font.BOLD, 12));
		lblUf.setBounds(694, 143, 46, 14);
		panel_2.add(lblUf);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(694, 159, 26, 20);
		panel_2.add(textField_28);
		
		JLabel lblSite = new JLabel("Site");
		lblSite.setFont(new Font("Arial", Font.BOLD, 12));
		lblSite.setBounds(10, 185, 46, 14);
		panel_2.add(lblSite);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(10, 200, 357, 20);
		panel_2.add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(371, 200, 357, 20);
		panel_2.add(textField_30);
		
		JLabel lblPas = new JLabel("País");
		lblPas.setFont(new Font("Arial", Font.BOLD, 12));
		lblPas.setBounds(371, 185, 46, 14);
		panel_2.add(lblPas);
		
		JLabel lblObservaes = new JLabel("Observações");
		lblObservaes.setFont(new Font("Arial", Font.BOLD, 12));
		lblObservaes.setBounds(371, 226, 76, 14);
		panel_2.add(lblObservaes);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(371, 241, 369, 107);
		panel_2.add(textField_31);
		
		JButton button = new JButton("Salvar\r\n");
		button.setFont(new Font("Arial", Font.BOLD, 13));
		button.setBounds(31, 262, 95, 32);
		panel_2.add(button);
		
		JButton btnAnterior = new JButton("Anterior");
		btnAnterior.setFont(new Font("Arial", Font.BOLD, 13));
		btnAnterior.setBounds(156, 262, 95, 32);
		panel_2.add(btnAnterior);
		
		JButton btnPrximo = new JButton("Próximo");
		btnPrximo.setFont(new Font("Arial", Font.BOLD, 13));
		btnPrximo.setBounds(255, 262, 95, 32);
		panel_2.add(btnPrximo);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(10, 29, 357, 20);
		panel_2.add(textField_32);
		
		panel_2.add(textField_32);
		
		JPanel panel_4 = new JPanel();
		
		tabbedPane.addTab("Estoque", null, panel_4, null);
		panel_4.setLayout(null);
		
		panel_4.addComponentListener( new ComponentListener() {
			
			@Override
			public void componentShown(ComponentEvent e) {

				System.out.println("Estoque Ganhou foco, buscando produtos no banco de dados.");
				
				// Quando entra no PAINEL de Estoque
				
				new Thread( new Runnable()
						{

							@Override
							public void run() {
								
								BancoDados conexao = new BancoMySQL( true );
								
								conexao.executarBusca( "SELECT * FROM produto" );

								DefaultTableModel modelo = (DefaultTableModel) estoqueListaProdutos.getModel();
								
								modelo.setColumnCount( 0 );
								modelo.setRowCount( 0 );
								
								modelo.addColumn( "ID" );
								modelo.addColumn( "Nome Produto" );
								modelo.addColumn( "Valor Produto" );
								modelo.addColumn( "Quantidade no Estoque" );
							
								do {
									/*modelo.addElement( new Produto( Integer.parseInt(conexao.buscarCampo( "produto_id" )) , Double.parseDouble(conexao.buscarCampo( "produto_valor" )) ,
											conexao.buscarCampo( "produto_nome" ) , new Estoque( 0 , Integer.valueOf(conexao.buscarCampo("produto_quantidade")))) );*/
									modelo.addRow( new Object[] { conexao.buscarCampo( "produto_id" ) , conexao.buscarCampo( "produto_nome" ) ,
											"R$ " + conexao.buscarCampo( "produto_valor" ) , conexao.buscarCampo("produto_quantidade") }  );
								}
								while ( conexao.proximaCedula() );
								
								conexao.fecharConexao();
								
							}
						
					
						}).start();
				
			}
			
			@Override
			public void componentResized(ComponentEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void componentMoved(ComponentEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void componentHidden(ComponentEvent e) {
				
				// Apaga a tabela
				//estoqueListaProdutos.setModel( null );
				estoqueListaProdutos.setModel( new DefaultTableModel() );
				
			}
		});
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setBounds(12, 197, 133, 25);
		panel_4.add(btnNewButton);
		
		
		JButton btnNewButton_1 = new JButton("Buscar");
		btnNewButton_1.setBounds(157, 197, 159, 25);
		panel_4.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(12, 50, 161, 22);
		panel_4.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(183, 50, 133, 22);
		panel_4.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_28 = new JLabel("Produto");
		lblNewLabel_28.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_28.setBounds(12, 31, 56, 16);
		panel_4.add(lblNewLabel_28);
		
		JLabel lblNewLabel_29 = new JLabel("Valor\r\n");
		lblNewLabel_29.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_29.setBounds(183, 31, 56, 16);
		panel_4.add(lblNewLabel_29);
		
		textField_2 = new JTextField();
		textField_2.setBounds(12, 98, 161, 22);
		panel_4.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_30 = new JLabel("Id do produto");
		lblNewLabel_30.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_30.setBounds(12, 79, 117, 16);
		panel_4.add(lblNewLabel_30);
		
		textField_3 = new JTextField();
		textField_3.setBounds(183, 98, 133, 22);
		panel_4.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(12, 146, 161, 22);
		panel_4.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblQuantidadeEmEstoque = new JLabel("Quantidade ");
		lblQuantidadeEmEstoque.setFont(new Font("Arial", Font.BOLD, 12));
		lblQuantidadeEmEstoque.setBounds(12, 129, 161, 16);
		panel_4.add(lblQuantidadeEmEstoque);
		
		JLabel lblNewLabel_31 = new JLabel("Tipo");
		lblNewLabel_31.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_31.setBounds(183, 79, 56, 16);
		panel_4.add(lblNewLabel_31);
		
		JScrollPane estoqueListaProdutosSrollPane = new JScrollPane();
		estoqueListaProdutosSrollPane.setBounds(390, 11, 350, 254);
		panel_4.add(estoqueListaProdutosSrollPane);
		
		estoqueListaProdutos = new JTable();
		estoqueListaProdutos.setBounds(390, 11, 350, 254);
		//panel_4.add(estoqueListaProdutos);
		
		
		estoqueListaProdutosSrollPane.setViewportView( estoqueListaProdutos );
		
		JButton btnRemoverProduto = new JButton("Remover Produto");
		btnRemoverProduto.setBounds(400, 281, 133, 23);
		panel_4.add(btnRemoverProduto);
		
		panel_3 = new JPanel();
		tabbedPane.addTab("Financeiro", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblEmisso = new JLabel("Emissão\r\n");
		lblEmisso.setFont(new Font("Arial", Font.BOLD, 12));
		lblEmisso.setBounds(10, 11, 56, 14);
		panel_3.add(lblEmisso);
		
		JLabel lblVencimento = new JLabel("Vencimento");
		lblVencimento.setFont(new Font("Arial", Font.BOLD, 12));
		lblVencimento.setBounds(138, 12, 95, 14);
		panel_3.add(lblVencimento);
		
		textField_33 = new JTextField();
		textField_33.setBounds(10, 28, 123, 20);
		panel_3.add(textField_33);
		textField_33.setColumns(10);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(138, 28, 123, 20);
		panel_3.add(textField_34);
		
		JLabel lblRecebimento = new JLabel("Recebimento");
		lblRecebimento.setFont(new Font("Arial", Font.BOLD, 12));
		lblRecebimento.setBounds(267, 11, 95, 14);
		panel_3.add(lblRecebimento);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(267, 28, 123, 20);
		panel_3.add(textField_35);
		
		JLabel lblDevedor = new JLabel("Devedor");
		lblDevedor.setFont(new Font("Arial", Font.BOLD, 12));
		lblDevedor.setBounds(394, 11, 95, 14);
		panel_3.add(lblDevedor);
		
		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(394, 28, 177, 20);
		panel_3.add(textField_36);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setFont(new Font("Arial", Font.BOLD, 12));
		lblValor.setBounds(579, 11, 95, 14);
		panel_3.add(lblValor);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(576, 28, 164, 20);
		panel_3.add(spinner);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "SwingAction_1");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_2 extends AbstractAction {
		public SwingAction_2() {
			putValue(NAME, "SwingAction_2");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
