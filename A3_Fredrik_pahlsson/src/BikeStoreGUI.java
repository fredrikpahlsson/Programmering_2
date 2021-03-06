import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class BikeStoreGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private Store bikeList;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BikeStoreGUI frame = new BikeStoreGUI();
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
	public BikeStoreGUI() {
		bikeList = new Store();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 410, 265);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(190, 26, 192, 169);
		contentPane.add(textArea);
		
		textField = new JTextField();
		textField.setBounds(51, 27, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(51, 71, 39, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(51, 117, 116, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblTum = new JLabel("Tum:");
		lblTum.setFont(new Font("Verdana", Font.BOLD, 12));
		lblTum.setBounds(12, 74, 56, 16);
		contentPane.add(lblTum);
		
		JLabel lblPris = new JLabel("Pris:");
		lblPris.setFont(new Font("Verdana", Font.BOLD, 12));
		lblPris.setBounds(12, 120, 32, 16);
		contentPane.add(lblPris);
		
		JLabel lblFrg = new JLabel("F\u00E4rg:");
		lblFrg.setFont(new Font("Verdana", Font.BOLD, 12));
		lblFrg.setBounds(12, 30, 56, 16);
		contentPane.add(lblFrg);
		
		JButton btnLggTill = new JButton("L\u00E4gg till cykel");
		btnLggTill.setFont(new Font("Verdana", Font.BOLD, 13));
		btnLggTill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			String bicycleColor = textField.getText();	
			int bicycleSize = Integer.parseInt(textField_1.getText());
			int bicyclePrice = Integer.parseInt(textField_2.getText());
			bikeList.addBike(bicycleColor, bicycleSize, bicyclePrice);
			textArea.setText(bikeList.getAllBikes());
			
			}
		});
		btnLggTill.setBounds(24, 170, 143, 25);
		contentPane.add(btnLggTill);
	}
}