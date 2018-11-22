package visão;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controle.BancoDados;
import controle.BancoMySQL;

public class TesteTable extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TesteTable frame = new TesteTable();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public TesteTable() throws SQLException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		table = new JTable();
		contentPane.add(table, BorderLayout.CENTER);
		
		
		// Este aqui é o construtor, por isso vou testar tudo na criação da classe
				BancoDados conexao = new BancoMySQL(true);
				conexao.executarBusca("SELECT * FROM cliente");

				// CLIENTE-> cliente_id , cliente_telefone , cliente_CNPJ , cliente_nome ,
				// end_id

				/*
				 * table_1.setModel( new DefaultTableModel( new Object[][] { {}, // Itens } ,
				 * new String[] { "" , "" // Colunas }) );
				 */

				/*
				 * TableModel tm = new DefaultTableModel();
				 * 
				 * 
				 * 
				 * for ( int k = 0 ; k < conexao.quantidadeRetorno() ; ++k ) { for( int i = 0 ;
				 * i < conexao.quantidadeRetorno() ; ++i ) { //tm.setValueAt( item , x , y );
				 * tm.setValueAt( conexao.buscarCampo( "" ) , k , i ); } }
				 */
				
				// -> NEGATIVO
				//Object[][] o = new Object[ 5 ] [ conexao.quantidadeRetorno() ];
				/*
				for( int x = 1 ; x <= conexao.quantidadeRetorno() ; ++x )
				{
					for( int y = 1; y <= 5 ; ++y )
					{
						o[ x ][ y ] = conexao.buscarCampo( y );
					}
				}
				*/
				
				/*
				for( int x = 1 ; x <= conexao.quantidadeRetorno() ; ++x )
				{
					for( int y = 1 ; y <= 5 ; ++y )
					{
						System.out.println(conexao.buscarCampo(y));
					}
					
					conexao.proximaCedula();
				}
				
				Object o[][] = null;
				
				table.setModel( new DefaultTableModel( o , new String[] { "1", "2", "3", "4", "5" } ));
			

				List<String> a = new ArrayList<String>();
				
				
				///
				do
				{
					/*for ( int x = 1 ; x <= 6 ; ++x )
						System.out.println(r.getInt(x));* /
					System.out.println(r.getString("cliente_id"));
					System.out.println(r.getString("cliente_nome"));
					System.out.println(r.getString("cliente_telefone"));
					System.out.println(r.getString("cliente_CNPJ"));
					System.out.println(r.getString("end_id"));
				}
				while( r.next() );
				
				r.close();
				
				conexao.fecharConexao();
				*/
				
				DefaultTableModel modelo = (DefaultTableModel) table.getModel();
				modelo.setColumnCount( 0 );
				modelo.setRowCount( 0 );
				
				// Header
				modelo.addColumn( "ID" );
				modelo.addColumn( "Nome" );
				modelo.addColumn( "Telefone" );
				modelo.addColumn( "CNPJ" );
				
				do
				{
					
					modelo.addRow( new Object[] { conexao.buscarCampo("cliente_id") , conexao.buscarCampo("cliente_nome") ,
							conexao.buscarCampo("cliente_telefone") , conexao.buscarCampo("cliente_CNPJ") } );
					System.out.println(conexao.buscarCampo("end_id"));
				} while( conexao.proximaCedula() );
				
				conexao.fecharConexao();
				
	}

}
