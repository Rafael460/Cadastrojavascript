import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import net.miginfocom.swing.MigLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import java.awt.Component;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AcessoCliente {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel TipoCadastro;
	private JCheckBox chckfisica;
	private JCheckBox chckjuridica;
	private JComboBox tratamento;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AcessoCliente window = new AcessoCliente();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public AcessoCliente() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 651, 404);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel nome = new JLabel("Nome: ");
		nome.setBounds(37, 80, 35, 14);
		frame.getContentPane().add(nome);
		
		JLabel label = new JLabel("");
		label.setBounds(77, 15, 0, 0);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(82, 15, 0, 0);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(87, 15, 0, 0);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(92, 15, 0, 0);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(97, 15, 0, 0);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setBounds(102, 15, 0, 0);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setBounds(107, 15, 0, 0);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("");
		label_7.setBounds(112, 15, 0, 0);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("");
		label_8.setBounds(117, 15, 0, 0);
		frame.getContentPane().add(label_8);
		
		textField = new JTextField();
		textField.setBounds(87, 77, 182, 20);
		textField.setColumns(10);
		frame.getContentPane().add(textField);
		
		JLabel email = new JLabel("Email:");
		email.setBounds(37, 114, 31, 14);
		frame.getContentPane().add(email);
		
		textField_1 = new JTextField();
		textField_1.setBounds(87, 111, 182, 20);
		textField_1.setColumns(10);
		frame.getContentPane().add(textField_1);
		
		JLabel senha = new JLabel("Senha: ");
		senha.setBounds(37, 149, 37, 14);
		frame.getContentPane().add(senha);
		
		textField_2 = new JTextField();
		textField_2.setBounds(99, 146, 170, 20);
		textField_2.setColumns(10);
		frame.getContentPane().add(textField_2);
		
		JLabel Csenha = new JLabel("Confirma Senha:");
		Csenha.setBounds(37, 184, 82, 14);
		frame.getContentPane().add(Csenha);
		
		textField_3 = new JTextField();
		textField_3.setBounds(141, 181, 128, 20);
		textField_3.setColumns(10);
		frame.getContentPane().add(textField_3);
		
		JButton confirma = new JButton("Confirma");
		confirma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// botão confirma e mostrar na tela
								
				
			}
		});
		confirma.setBounds(37, 238, 95, 23);
		frame.getContentPane().add(confirma);
		
		JButton sair = new JButton("Sair");
		sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// botão sair 
				
				JOptionPane.showMessageDialog(null,"Encerrando Processo..");
				System.exit(0);
				
			}
		});
		sair.setBounds(187, 238, 82, 23);
		frame.getContentPane().add(sair);
		
		TipoCadastro = new JLabel("Tipo de Cadastro: ");
		TipoCadastro.setBounds(37, 40, 95, 14);
		frame.getContentPane().add(TipoCadastro);
		
		chckfisica = new JCheckBox("Fis\u00EDca");
		chckfisica.setBounds(145, 36, 71, 23);
		frame.getContentPane().add(chckfisica);
		
		chckjuridica = new JCheckBox("Jur\u00EDdica");
		chckjuridica.setBounds(218, 36, 104, 23);
		frame.getContentPane().add(chckjuridica);
		
		tratamento = new JComboBox();
		tratamento.setBounds(359, 109, 228, 22);
		frame.getContentPane().add(tratamento);
		
		
		tratamento.setModel(new DefaultComboBoxModel(
				new String[] { "Selecione uma Opção:", "CLAREAMENTO DENTAL", "FACETA E LENTE DE CONTATO DENTAL", "ORTODONTIA (AP. DENTÁRIOS)",
						"BICHECTOMIA", "RESTAURAÇÕES ESTÉTICAS", "CHECK-UP DIGITAL", "PRÓTESE DENTÁRIA", "IMPLANTE DENTÁRIO",
						"REABILITAÇÃO ORAL", "ENDODONTIA (TRAT. DE CANAL)", "PERIODONTIA (TRAT. DA GENGIVA)", "ODONTOPEDIATRIA",
						"HARMONIZAÇÃO FACIAL"}));
		
		JLabel lblNewLabel = new JLabel("Servi\u00E7os:");
		lblNewLabel.setBounds(302, 113, 48, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel telefone = new JLabel("Telefone: ");
		telefone.setBounds(302, 80, 71, 14);
		frame.getContentPane().add(telefone);
		
		textField_4 = new JTextField();
		textField_4.setText("");
		textField_4.setBounds(371, 77, 142, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		
		
	}
}
