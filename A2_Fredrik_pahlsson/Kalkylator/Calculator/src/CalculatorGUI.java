import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class CalculatorGUI extends JFrame {

	private JPanel contentPane;
	Calculator myCalculator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI frame = new CalculatorGUI();
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
	public CalculatorGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 215, 261);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		myCalculator = new Calculator();
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 11, 175, 33);
		contentPane.add(textArea);
	

		JButton btnNewButton = new JButton("9");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("9");
				myCalculator.numberButtonPressed(9);
			}
		});
		btnNewButton.setBounds(134, 158, 51, 23);
		contentPane.add(btnNewButton);
		
		

		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("+");
				myCalculator.plus();
			}
		});
		btnNewButton_1.setBounds(10, 55, 51, 23);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("=");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.equals();
				int i = myCalculator.getResult();
				textArea.setText(String.valueOf(i));
			}
		});
		btnNewButton_2.setBounds(134, 192, 51, 23);
		contentPane.add(btnNewButton_2);
		
		JButton button = new JButton("8");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("8");
				myCalculator.numberButtonPressed(8);
			}
		});
		button.setBounds(71, 158, 51, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("1");
				myCalculator.numberButtonPressed(1);
			}
		});
		button_1.setBounds(10, 90, 51, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("2");
				myCalculator.numberButtonPressed(2);
			}
		});
		button_2.setBounds(71, 90, 51, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("3");
				myCalculator.numberButtonPressed(3);
					}
		});
		button_3.setBounds(134, 90, 51, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("4");
				myCalculator.numberButtonPressed(4);
			}
		});
		button_4.setBounds(10, 124, 51, 23);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("5");
			myCalculator.numberButtonPressed(5);
			}
		});
		button_5.setBounds(71, 124, 51, 23);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("6");
			myCalculator.numberButtonPressed(6);
			}
		});
		button_6.setBounds(132, 124, 51, 23);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("7");
				myCalculator.numberButtonPressed(7);
			}
		});
		button_7.setBounds(10, 158, 51, 23);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("-");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("-");
				myCalculator.minus();
			}
		});
		button_8.setBounds(71, 55, 51, 23);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("*");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("*");
				myCalculator.mult();
			}
		});
		button_9.setBounds(134, 55, 51, 23);
		contentPane.add(button_9);
		
		
	}
}

// myCalculator.mult(); myCalculator.minus(); 