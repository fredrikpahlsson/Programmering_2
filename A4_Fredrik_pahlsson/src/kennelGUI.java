import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class kennelGUI extends JFrame {

	private JPanel contentPane;
	private JTextField humanNametxt;
	private JTextField dogNametxt;
	private JTextField errorMessagetxt;
	
	Human h = null;
	private JTextField infoTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kennelGUI frame = new kennelGUI();
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
	public kennelGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 345, 332);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHumansAndDogs = new JLabel("Hund Outlet  AB");
		lblHumansAndDogs.setForeground(Color.WHITE);
		lblHumansAndDogs.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHumansAndDogs.setBounds(79, -1, 185, 33);
		contentPane.add(lblHumansAndDogs);
		
		JButton btnNewHuman = new JButton("Ny \u00E4gare");
		btnNewHuman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Human h
				if (humanNametxt.getText().length() >= 3){
					h = new Human(humanNametxt.getText());
					
				} else {
					errorMessagetxt.setText("Namnet måste innehålla minst 3 st bokstäver.");
				}
			}
		});
		btnNewHuman.setBounds(14, 61, 114, 25);
		contentPane.add(btnNewHuman);
		
		JButton btnBuyDog = new JButton("K\u00F6p en vovve ");
		btnBuyDog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (h != null) {
					Dog d = new Dog(dogNametxt.getText());
					errorMessagetxt.setText("");
					h.buyDog(d);
					
				} else {
					errorMessagetxt.setText("Den här vovven har ingen ägare.");
				}
			}
		});
		btnBuyDog.setBounds(14, 97, 114, 25);
		contentPane.add(btnBuyDog);
		
		humanNametxt = new JTextField();
		humanNametxt.setBounds(155, 62, 144, 22);
		contentPane.add(humanNametxt);
		humanNametxt.setColumns(10);
		
		dogNametxt = new JTextField();
		dogNametxt.setBounds(155, 98, 144, 22);
		contentPane.add(dogNametxt);
		dogNametxt.setColumns(10);
		
		JLabel lblInfo = new JLabel("Info");
		lblInfo.setBounds(22, 150, 56, 16);
		contentPane.add(lblInfo);
		
		
		JLabel lblErrorMessages = new JLabel("Felmeddelanden");
		lblErrorMessages.setBounds(22, 221, 106, 16);
		contentPane.add(lblErrorMessages);
		
		errorMessagetxt = new JTextField();
		errorMessagetxt.setEditable(false);
		errorMessagetxt.setBounds(22, 240, 277, 33);
		contentPane.add(errorMessagetxt);
		errorMessagetxt.setColumns(10);
		
		infoTxt = new JTextField();
		infoTxt.setEditable(false);
		infoTxt.setBounds(22, 175, 281, 33);
		contentPane.add(infoTxt);
		infoTxt.setColumns(10);
		
		JButton btnPrintInfo = new JButton("Skiv ut info");
		btnPrintInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoTxt.setText(h.getInfo());
			}
		});
		btnPrintInfo.setBounds(88, 133, 114, 25);
		contentPane.add(btnPrintInfo);
		
		JLabel lblNewLabel = new JLabel("Visst kan man fynda i andrahandssorteringen med!");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(32, 25, 287, 14);
		contentPane.add(lblNewLabel);
	}
}