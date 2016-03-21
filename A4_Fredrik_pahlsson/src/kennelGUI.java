import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class kennelGUI extends JFrame {

	private JPanel contentPane;
	private JTextField humanNameField;
	private JTextField dogNameField;

	dogField;

	public Human human = new Human("");

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
		setBounds(100, 100, 284, 355);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		humanNameField = new JTextField();
		humanNameField.setText("");
		humanNameField.setBounds(12, 27, 116, 22);
		contentPane.add(humanNameField);
		humanNameField.setColumns(10);

		dogField = new JTextField();
		dogField.setText("");
		dogField.setBounds(138, 27, 116, 22);
		contentPane.add(dogField);
		dogField.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 110, 242, 66);
		contentPane.add(scrollPane);
		
				JTextArea infoTextArea = new JTextArea();
				scrollPane.setViewportView(infoTextArea);
				infoTextArea.setText("");

		JLabel lblNamn = new JLabel("Name");
		lblNamn.setBounds(12, 11, 116, 16);
		contentPane.add(lblNamn);

		JLabel lbldogName = new JLabel("Dog");
		lbldogName.setBounds(138, 11, 116, 16);
		contentPane.add(lbldogName);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 203, 242, 66);
		contentPane.add(scrollPane_1);
		
				JTextArea errorTextArea = new JTextArea();
				scrollPane_1.setViewportView(errorTextArea);
				errorTextArea.setText("");

		JButton btnNewOwner = new JButton("New owner");
		btnNewOwner.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				errorTextArea.setText("");
				if (humanNameField.getText().length() > 3) {
					human = new Human(humanNameField.getText());
				} else {
					errorTextArea.setText("Human name must have at least 3 characters");
				}
			}
		});
		btnNewOwner.setBounds(12, 60, 116, 25);
		contentPane.add(btnNewOwner);

		JButton btnNewDog = new JButton("Buy dog");
		btnNewDog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				errorTextArea.setText("");
				if (dogField.getText().equals("")){
					errorTextArea.setText("The dog must have a name");
				} else {
					Dog dog1 = new Dog(dogcontentPane.add(btnNewDog);

		JButton btnNewButton = new JButton("Print info");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoTextArea.setText(human.getInfo());
			}
		});
		btnNewButton.setBounds(138, 280, 116, 25);
		contentPane.add(btnNewButton);
		
				JLabel lblInfo = new JLabel("Info");
				lblInfo.setBounds(12, 96, 48, 14);
				contentPane.add(lblInfo);
										
												JLabel lblErrorMessage = new JLabel("Error message");
												lblErrorMessage.setBounds(12, 185, 86, 22);
												contentPane.add(lblErrorMessageoTextArea);
						infoTextArea.setText(""
		contentPane.add(btnNewButton);
	}