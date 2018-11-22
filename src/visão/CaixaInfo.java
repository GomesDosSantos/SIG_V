package visão;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class CaixaInfo extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		/*
		try {
			CaixaInfo dialog = new CaixaInfo();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
	}

	/**
	 * Create the dialog.
	 */
	public CaixaInfo( String titulo , int icone , String informacao ) {
		setTitle( /* "TITULO" */ titulo );
		setBackground(Color.WHITE);
		getContentPane().setBackground(Color.WHITE);
		setBounds(100, 100, 450, 173);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblIcon = new JLabel( /* "New label" */ );
			lblIcon.setBounds(21, 5, 82, 103);
			// \/ -> Auto-gerado pelo programa
			//lblIcon.setIcon( new ImageIcon(CaixaInfo.class.getResource("/src_images/imagemOk.png")) );
			// \/ -> Auto-gerado por mim
			lblIcon.setIcon( new ImageIcon( getClass().getResource("/src_images/imagemOk.png")) );
			contentPanel.add(lblIcon);
		}
		{
			JLabel lblInfo = new JLabel( /* "New label" */ informacao );
			lblInfo.setBounds(102, 5, 340, 103);
			contentPanel.add(lblInfo);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		
		this.setDefaultCloseOperation( JDialog.DISPOSE_ON_CLOSE );
		this.setVisible( true );
	}

}
