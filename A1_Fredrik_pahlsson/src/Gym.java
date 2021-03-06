import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JMenuItem;

public class Gym extends JFrame {
	private JTable table;
	private JTextField txtSibiriengatanb;
	private JTextField textField_1;
	private JTextField txtIrkutsk;
	private JTextField textField_3;
	private JTextField txtDraggazhotmailcom;
	private JTextField textField_5;
	private JTextField txtIvarDrago;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gym frame = new Gym();
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
	public Gym() {
		getContentPane().setForeground(Color.GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArkiv = new JMenu("Arkiv");
		menuBar.add(mnArkiv);
		
		JMenuItem mntmSkrivUt = new JMenuItem("Skriv ut");
		mnArkiv.add(mntmSkrivUt);
		
		JMenuItem mntmAvsluta = new JMenuItem("Avsluta :(");
		mnArkiv.add(mntmAvsluta);
		
		JMenu mnMedlem = new JMenu("Medlem");
		menuBar.add(mnMedlem);
		
		JMenuItem mntmNyMedlem = new JMenuItem("Ny medlem");
		mnMedlem.add(mntmNyMedlem);
		
		JMenuItem mntmSkMedlem = new JMenuItem("S\u00F6k medlem");
		mnMedlem.add(mntmSkMedlem);
		
		JMenu mnHjlp = new JMenu("Hj\u00E4lp");
		menuBar.add(mnHjlp);
		
		JMenuItem mntmMerHjlp = new JMenuItem("Mer Hj\u00E4lp...");
		mnHjlp.add(mntmMerHjlp);
		
		JMenuItem mntmOmProgrammet = new JMenuItem("Om Programmet");
		mnHjlp.add(mntmOmProgrammet);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 188, 319);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", "Ivar Drago"},
				{"2", "Gustav Sv\u00E4nsson"},
				{"3", "Lars \u00C5kesson"},
				{"4", "Kalle Anka"},
				{"5", "Hasse Aro"},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Nr.", "Namn"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(40);
		scrollPane.setViewportView(table);
		
		JLabel lblMedlemNr = new JLabel("Medlem Nr.");
		lblMedlemNr.setBounds(208, 18, 60, 14);
		getContentPane().add(lblMedlemNr);
		
		JLabel lblNamn = new JLabel("Namn");
		lblNamn.setBounds(208, 43, 46, 14);
		getContentPane().add(lblNamn);
		
		JLabel lblAdress = new JLabel("Gata");
		lblAdress.setBounds(208, 155, 46, 14);
		getContentPane().add(lblAdress);
		
		JLabel lblPostnrOrt = new JLabel("Postnr / Ort");
		lblPostnrOrt.setBounds(208, 180, 72, 14);
		getContentPane().add(lblPostnrOrt);
		
		JLabel lblTlfnNr = new JLabel("Tlfn nr.");
		lblTlfnNr.setBounds(208, 205, 46, 14);
		getContentPane().add(lblTlfnNr);
		
		JLabel lblPersNr = new JLabel("Pers nr.");
		lblPersNr.setBounds(208, 68, 46, 14);
		getContentPane().add(lblPersNr);
		
		JLabel lblEpost = new JLabel("E-Post");
		lblEpost.setBounds(208, 230, 46, 14);
		getContentPane().add(lblEpost);
		
		txtSibiriengatanb = new JTextField();
		txtSibiriengatanb.setText("Sibiriengatan 4B");
		txtSibiriengatanb.setBounds(277, 152, 162, 20);
		getContentPane().add(txtSibiriengatanb);
		txtSibiriengatanb.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("22562");
		textField_1.setBounds(277, 177, 60, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		txtIrkutsk = new JTextField();
		txtIrkutsk.setText("Irkutsk");
		txtIrkutsk.setBounds(347, 177, 92, 20);
		getContentPane().add(txtIrkutsk);
		txtIrkutsk.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setText("+7 234 9809 3280 13445");
		textField_3.setBounds(277, 202, 162, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		txtDraggazhotmailcom = new JTextField();
		txtDraggazhotmailcom.setText("draggaz73@ussr.com");
		txtDraggazhotmailcom.setBounds(277, 227, 162, 20);
		getContentPane().add(txtDraggazhotmailcom);
		txtDraggazhotmailcom.setColumns(10);
		
		JButton btnSpara = new JButton("Spara");
		btnSpara.setBounds(324, 290, 89, 23);
		getContentPane().add(btnSpara);
		
		textField_5 = new JTextField();
		textField_5.setText("19731009-5640\r\n");
		textField_5.setBounds(273, 65, 131, 20);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		txtIvarDrago = new JTextField();
		txtIvarDrago.setText("Ivar Drago");
		txtIvarDrago.setBounds(273, 40, 131, 20);
		getContentPane().add(txtIvarDrago);
		txtIvarDrago.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setText("1\r\n");
		textField_7.setBounds(273, 15, 64, 20);
		getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Gym.class.getResource("/img/drago.jpg")));
		label.setBounds(420, 11, 104, 131);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(0, 0, 534, 341);
		getContentPane().add(label_1);
	}
}
